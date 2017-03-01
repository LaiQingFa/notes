package s;
/**
 * 饿汉法就是在第一次引用该类的时候就创建对象实例，而不管实际是否需要创建
 * 
 */
public class Hungry {
	private static Hungry singleton = new Hungry();
    private Hungry() {}
    public static Hungry getSignleton(){
        return singleton;
    }
}
//这样做的好处是编写简单，但是无法做到延迟创建对象。但是我们很多时候都希望对象可以尽可能地延迟加载，从而减小负载