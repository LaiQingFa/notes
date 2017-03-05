package spiker;

public class Stringzhxiang {
/**
 * 因为String被设计成不可变(immutable)类，所以它的所有对象都是不可变对象。请看下列代码：

	String s = "Hello";    这个语句声明的是一个指向对象的引用，名为“s”
	s = s + " world!";  
	s所指向的对象是否改变了呢？从本系列第一篇的结论很容易导出这个结论。我们来看看发生了什么事情。
	在这段代码中，s原先指向一个String对象，内容是"Hello"，然后我们对s进行了+操作，那么s所指向的那个对象是否发生了改变呢？答案是没有。
	这时，s不指向原来那个对象了，而指向了另一个String对象，内容为"Hello world!"，原来那个对象还存在于内存之中，只是s这个引用变量不再指向它了。
	
	
	
	final关键字到底修饰了什么？
	
	final使得被修饰的变量"不变"，但是由于对象型变量的本质是“引用”，使得“不变”也有了两种含义：引用本身的不变，和引用指向的对象不变。
	
	引用本身的不变：
	
	final StringBuffer a=new StringBuffer("immutable");  
	final StringBuffer b=new StringBuffer("not immutable");  
	a=b;//编译期错误 
	引用指向的对象不变：
	
	final StringBuffer a=new StringBuffer("immutable");  
	a.append(" broken!"); //编译通过 
	可见，final只对引用的“值”(也即它所指向的那个对象的内存地址)有效，它迫使引用只能指向初始指向的那个对象，改变它的指向会导致编译期错误。
	至于它所指向的对象的变化，final是不负责的。
	
	
	int类型变量默认初始值为0
	
	float类型变量默认初始值为0.0f
	
	double类型变量默认初始值为0.0
	
	boolean类型变量默认初始值为false
	
	char类型变量默认初始值为0(ASCII码)
	
	long类型变量默认初始值为0
	
	所有对象引用类型变量默认初始值为null，即不指向任何对象。注意数组本身也是对象，所以没有初始化的数组引用在自动初始化后其值也是null。
	
	
	
	线程池为线程生命周期开销问题和资源不足问题提供了解决方案。
	通过对多个任务重用线程，线程创建的开销被分摊到了多个任务上。
	其好处是，因为在请求到达时线程已经存在，所以无意中也消除了线程创建所带来的延迟。
	可以立即为请求服务，使应用程序响应更快。而且，通过适当地调整线程池中的线程数目，
	也就是当请求的数目超过某个阈值时，就强制其它任何新到的请求一直等待，直到获得一个线程来处理为止，从而可以防止资源不足。
	
	参考:http://developer.51cto.com/art/201202/320705.htm
	    http://www.cnblogs.com/wxd0108/p/5479442.html
 */
}
