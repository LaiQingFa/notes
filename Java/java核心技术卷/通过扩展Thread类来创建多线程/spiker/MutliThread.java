package spiker;

public class MutliThread extends Thread {
	
    private int ticket=100;//每个线程都拥有100张票 

    public MutliThread (){}
    public MutliThread (String name){
        super(name);
    }
    /**
     * @Override 的作用如果想重写父类的方法，比如toString()方法的话，在方法前面加上@Override 系统可以帮你检查方法的正确性
     */
    @Override
    public void run() {
        while(ticket>0){ 
            System.out.println(ticket--+" is saled by "+Thread.currentThread().getName()); 
        } 
    }
}