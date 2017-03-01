package s;
/**
 * 枚举法
 * 枚举单例有序列化和线程安全的保证，而且只要几行代码就能实现是单例最好的的实现方式
 * 传统单例存在的另外一个问题是一旦你实现了序列化接口，那么它们不再保持单例了，
 * 使用枚举除了线程安全和防止反射强行调用构造器之外，还提供了自动序列化机制，
 * 防止反序列化的时候创建新的对象。推荐尽可能地使用枚举来实现单例
 * 默认枚举实例的创建是线程安全的，但是在枚举中的其他任何方法由程序员自己负责。
           可以通过EnumMethod.INSTANCE来访问，这比调用new一个对象然后调方法简单多 
 */
public  enum EnumMethod {
	INSTANCE;
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}
