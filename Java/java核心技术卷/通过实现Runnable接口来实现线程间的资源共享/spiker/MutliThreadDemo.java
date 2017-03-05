package spiker;
/**
 *程序在内存中仅创建了一个资源，而新建的三个线程都是基于访问这同一资源的，并且由于每个线程上所运行的是相同的代码，因此它们执行的功能也是相同的。
 *实现Runnable接口相对于扩展Thread类来说，具有无可比拟的优势。
 *这种方式不仅有利于程序的健壮性，使代码能够被多个线程共享，而且代码和数据资源相对独立，从而特别适合多个具有相同代码的线程去处理同一资源的情况。
 *这样一来，线程、代码和数据资源三者有效分离，很好地体现了面向对象程序设计的思想。因此，几乎所有的多线程程序都是通过实现Runnable接口的方式来完成的。
 */
public class MutliThreadDemo {
    public static void main(String[] args) {
        MutliThread m=new MutliThread(); 
        Thread t1=new Thread(m); 
        Thread t2=new Thread(m); 
        Thread t3=new Thread(m); 
        t1.start(); 
        t2.start(); 
        t3.start(); 
    }
}
