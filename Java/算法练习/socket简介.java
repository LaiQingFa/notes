package pra;
/**
 * 
 *   就目前而言，几乎所有的应用程序都是采用socket
 *
 *1、网络中进程之间如何通信
 *本地的进程间通信（IPC）有很多种方式，但可以总结为下面4类：
 *            消息传递（管道、FIFO、消息队列）、同步（互斥量、条件变量、读写锁、文件和写记录锁、信号量）                                       
			      共享内存（匿名的和具名的）	、远程过程调用（Solaris门和Sun RPC）	
			      			     
        网络中进程之间如何通信？
        需要解决的问题是如何唯一标识一个进程：通过TCP/IP协议族（TCP/IP协议栈）
		                           TCP：Transmission Control Protocol 传输控制协议
                                    IP：Internet Protocol 互联网协议
		
                        网络层：ip地址--->唯一标识网络中的主机       传输层:协议+端口--->唯一标识主机中的应用程序（进程）
                       利用三元组（ip地址，协议，端口）可以标识网络的进程，网络中的进程通信可以利用这个标志与其它进程进行交互
 *
 *TCP/IP协议的应用程序通常采用应用编程接口：
 *       UNIX  BSD的套接字（socket）和UNIX System V的TLI（已经被淘汰），来实现网络进程之间的通信。
 *       
 *       
 *2、什么是Socket？
 *     socket起源于Unix，而Unix/Linux基本哲学之一就是“一切皆文件”，
 *     都可以用“打开open –> 读写write/read –> 关闭close”模式来操作。
 *     我的理解就是Socket就是该模式的一个实现，socket即是一种特殊的文件，一些socket函数就是对其进行的操作（读/写IO、打开、关闭）
 *     
 * 3、socket的基本操作
 *     (1)socket()函数
 *        int socket(int domain, int type, int protocol);
 *        domain：即协议域，又称为协议族（family）。常用的协议族有，AF_INET、AF_INET6、AF_LOCAL（或称AF_UNIX，Unix域socket）、AF_ROUTE等等。
 *               协议族决定了socket的地址类型，在通信中必须采用对应的地址，如AF_INET决定了要用ipv4地址（32位的）与端口号（16位的）的组合、AF_UNIX决定了要用一个绝对路径名作为地址。
          type：指定socket类型。常用的socket类型有，SOCK_STREAM、SOCK_DGRAM、SOCK_RAW、SOCK_PACKET、SOCK_SEQPACKET等等（socket的类型有哪些？）。
          protocol：故名思意，就是指定协议。常用的协议有，IPPROTO_TCP、IPPTOTO_UDP、IPPROTO_SCTP、IPPROTO_TIPC等，它们分别对应TCP传输协议、
                  UDP传输协议、STCP传输协议、TIPC传输协议
 * 
	       type和protocol不可以随意组合，如SOCK_STREAM不可以跟IPPROTO_UDP组合。当protocol为0时，会自动选择type类型对应的默认协议。
		       当我们调用socket创建一个socket时，返回的socket描述字它存在于协议族（address family，AF_XXX）空间中，但没有一个具体的地址。
		       如果想要给它赋值一个地址，就必须调用bind()函数，否则就当调用connect()、listen()时系统会自动随机分配一个端口。
 * 
 *     (2)bind()函数
 *             bind()函数把一个地址族中的特定地址赋给socket;
 *             int bind(int sockfd, const struct sockaddr *addr, socklen_t addrlen);
 *           函数的三个参数：
 *                sockfd：即socket描述字，它是通过socket()函数创建了，唯一标识一个socket。bind()函数就是将给这个描述字绑定一个名字。
 *                addr：一个const struct sockaddr *指针，指向要绑定给sockfd的协议地址。
 *                addrlen：对应的是地址的长度。
 *                通常服务器在启动的时候都会绑定一个众所周知的地址（如ip地址+端口号），用于提供服务，客户就可以通过它来接连服务器；
 *                而客户端就不用指定，有系统自动分配一个端口号和自身的ip地址组合。
 *                这就是为什么通常服务器端在listen之前会调用bind()，而客户端就不会调用，而是在connect()时由系统随机生成一个。
 *                
 *      (3)listen()、connect()函数
 *               	如果作为一个服务器，在调用socket()、bind()之后就会调用listen()来监听这个socket，如果客户端这时调用connect()发出连接请求，服务器端就会接收到这个请求。
 					int listen(int sockfd, int backlog);
					int connect(int sockfd, const struct sockaddr *addr, socklen_t addrlen);
					listen函数的第一个参数即为要监听的socket描述字，第二个参数为相应socket可以排队的最大连接个数。
					socket()函数创建的socket默认是一个主动类型的，listen函数将socket变为被动类型的，等待客户的连接请求。
					connect函数的第一个参数即为客户端的socket描述字，第二参数为服务器的socket地址，第三个参数为socket地址的长度。
					客户端通过调用connect函数来建立与TCP服务器的连接。        
					
	     (4)accept()函数
	             TCP服务器端依次调用socket()、bind()、listen()之后，就会监听指定的socket地址了。
	             TCP客户端依次调用socket()、connect()之后就想TCP服务器发送了一个连接请求。
	             TCP服务器监听到这个请求之后，就会调用accept()函数取接收请求，这样连接就建立好了。之后就可以开始网络I/O操作了，即类同于普通文件的读写I/O操作。  
 *            int accept(int sockfd, struct sockaddr *addr, socklen_t *addrlen);
 *            accept函数的第一个参数为服务器的socket描述字，第二个参数为指向struct sockaddr *的指针，用于返回客户端的协议地址，第三个参数为协议地址的长度。
 *            如果accpet成功，那么其返回值是由内核自动生成的一个全新的描述字，代表与返回客户的TCP连接。
 *      注意：accept的第一个参数为服务器的socket描述字，是服务器开始调用socket()函数生成的，称为监听socket描述字；而accept函数返回的是已连接的socket描述字。
 *          一个服务器通常通常仅仅只创建一个监听socket描述字，它在该服务器的生命周期内一直存在。
 *          内核为每个由服务器进程接受的客户连接创建了一个已连接socket描述字，当服务器完成了对某个客户的服务，相应的已连接socket描述字就被关闭。      
 *          
 *       (5)read()、write()等函数
 *            至此服务器与客户已经建立好连接了。可以调用网络I/O进行读写操作了
 *           
 *       (6)close()函数
 *            在服务器与客户端建立连接之后，会进行一些读写操作，完成了读写操作就要关闭相应的socket描述字，好比操作完打开的文件要调用fclose关闭打开的文件。
 *            注意：close操作只是使相应socket描述字的引用计数-1，只有当引用计数为0的时候，才会触发TCP客户端向服务器发送终止连接请求
 *       
 *            
 *            
 *4.socket中TCP的三次握手建立连接详解
 *        tcp建立连接要进行“三次握手”，即交换三个分组。大致流程如下：
													客户端向服务器发送一个SYN J
													服务器向客户端响应一个SYN K，并对SYN J进行确认ACK J+1
													客户端再想服务器发一个确认ACK K+1
 *
 *
 *
 */
public class Test {

}
