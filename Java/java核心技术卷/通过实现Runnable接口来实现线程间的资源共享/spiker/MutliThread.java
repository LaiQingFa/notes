package spiker;

public class MutliThread implements Runnable {
	 private int ticket=100;//每个线程都拥有100张票 
	      public void run(){ 
	          while(ticket>0){ 
	              System.out.println(ticket--+" is saled by "+Thread.currentThread()); 
	         } 
	      } 

}
