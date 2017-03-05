package spiker;
/**
 * 程序中定义一个线程类，它扩展了Thread类。利用扩展的线程类在MutliThreadDemo类的主方法中创建了三个线程对象，并通过start()方法分别将它们启动
 * @author Administrator
 *这三个线程并不是依次交替执行，而是在三个线程同时被执行的情况下，有的线程被分配时间片的机会多，票被提前卖完，而有的线程被分配时间片的机会比较多
 *利用扩展Thread类创建的多个线程，虽然执行的是相同的代码，但彼此相互独立，且各自拥有自己的资源，互不干扰。
 */
public class ThreadT {

	    public static void main(String[] args) {
	        MutliThread m1=new MutliThread("Window 1"); 
	        MutliThread m2=new MutliThread("Window 2"); 
	        MutliThread m3=new MutliThread("Window 3"); 
	        m1.start();
	        m2.start();
	        m3.start();
	    }
	
}

