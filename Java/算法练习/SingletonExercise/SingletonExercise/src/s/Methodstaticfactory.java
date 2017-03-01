package s;
/**
 * 静态工厂实现法
 * 可以调用Methodstaticfactory.getSingleton()获取实例
 */
public class Methodstaticfactory {
	
	// 单例是静态的final变量，当类第一次加载到内存中的时候就初始化了，所以创建的实例固然是thread-safe。
	private static final Methodstaticfactory INSTANCE = new Methodstaticfactory();
	 
    private Methodstaticfactory(){}
 
    public static Methodstaticfactory getSingleton(){
        return INSTANCE;
    }
}
