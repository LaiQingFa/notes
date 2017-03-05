package spiker;
/**
 * 通过Thread类来启动Runnable实现的多线程
 * 在程序开发中只要是多线程肯定永远以实现Runnable接口为主，因为实现Runnable接口相比继承Thread类有如下好处：
	避免点继承的局限，一个类可以继承多个接口。
	适合于资源的共享
 *   public class Thread extends Object implements Runnable
      Thread类是Runnable接口的子类。
 */
public class MutliThreadDemo {
	public static void main(String[] args) {
        MutliThread m1=new MutliThread("Window 1"); 
        MutliThread m2=new MutliThread("Window 2"); 
        MutliThread m3=new MutliThread("Window 3"); 
        Thread t1=new Thread(m1); 
        Thread t2=new Thread(m2); 
        Thread t3=new Thread(m3); 
        t1.start(); 
        t2.start(); 
        t3.start(); 
    }
}
