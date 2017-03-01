/**
*static 方法是线程安全的吗

只是读数据的话，应该不存在这个问题，但是如果有线程改变变量的值，如果不进行同步的话，会出现问题
*/
public class  StaticMethodThreadSafety {

    public static User setName(User user,String name) {

        User u = user;

        u.name = name;

        return u;

    }

}
/**


如上面的代码所示，在 setName 这个static方法里面u会不会有线程安全问题呢？
答案是不确定的,方法属于一个程序块，只有当别人调用它时才会调到内存里面去执行，也就是说当前有多少个线程在执行就有多少组方法块里的局部变量
(当然无论是静态方法还是实例方法，在内存中都只有一份代码，也就是只占用一份内存空间)

那u这个变量到底是不是线程安全的呢？答案不取决与是否为静态方法，而在于传进来的user，
如果传进来的user属于共享变量或者是同一个User变量，那u也不是线程安全的，如果user都是独立变量，那u也就不用担心线程安全的问题。

在web开发中，我们的servlet，struts2都是属于线程安全的，所以我们在使用静态方法处理业务时是不用担心并发的问题

*/
