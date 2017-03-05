
转自http://www.cnblogs.com/littlepanpc/p/3757572.html

这篇文章主要是自己在使用java的过程中对自己一些之前常困惑的问题的一些总结。

正如题目所言，这篇博客主要是讨论java中的接口与抽象类的区别，有自己的使用心得，以及自己平时在使用的过程中遇到的问题及解决方案。

1, 定义上的区别：

其实说别的抽象意义都不会让人明白，只有java语言级别上的区别才能根本上区别两者：java中"everything is an object", 所以接口理论上讲也是一种对象，或者叫类. 它的定义是: 以关键字interface取代class定义的类就是接口, 形如: public interface IA{}；而抽象类的定义呢，则是: 以关键字abstract修饰的类定义. 形如: public abstract class A {}. 其它的定义如"含有抽象方法的类是抽象类"等等都不准确.

2, 使用上的区别：

接口只有用来"implements", 即实现。而且一个类可以同时实现多个接口。而抽象类是用来"extends"的, 即继承。一个类只能继承一个抽象类。假如类B继承了抽象类A, 则B要么实现了其中的抽象方法，要么将自己声明为abstract. 此外没有别的解决方案.

3, 成员上的区别：

接口中的成员变量默认情况是public static final的，想像一下为什么会如此呢？大概是接口原本就是要让其它的类来实现的，里面的成员变量就是要让接口之外的类来使用的，所以吧，private是不行的，protected和defaut的都是有限制的。而且接口又不可能被实例化，也得自己不会去更改变量的值，别的类也不会改变接口的成员变量值，因为，如果B和C都实现了IA接口，而B修改了IA中的成员变量的值，而C如果使用了该变量的值，它是要使用该变量的原值还是修改之后的值，这个就让人混淆了，所以就是static跟final的了吧. 但是在抽象类中，可以定义任何权限的成员变量: public private protected或default的、static或non-static的、final或non-final的。

然后是两者中的成员函数.

接口中的成员函数，默认是public的，形如: void get(int i)；正如上所言，它们就是用来被别的类来实现的, 且不得是static或final的。与此同时，接口中的所有方法只能有方法声明，不能有方法体，即使方法体中不实现任何操作。 而在抽象类中如果有要求被子类实现的方法，则该方法用关键字abstract修饰, 形如：public abstract void method();. 抽象类中可以含有抽象方法，当然，也可以完全不含有抽象方法(此时该类当然依旧可以用abstract修饰，但已经毫无意义，因为抽象方法原本就是要求子类实现其中的抽象方法的)。而且抽象类中的非抽象方法可以调用抽象方法，例如：public void f(){method();}, 但在接口中却不能如此，因为接口中方法声明不得含有方法体, 没有方法体自然无法调用其它方法. (java中的抽象方法源于c++中虚函数的概念，虚函数要求派生类覆盖该函数，然后该继承体系中的基类和派生类在运行时调用该虚函数时，基类调用基类的版本，派生类调用派生版本，这种编译器只有在运行时才能确定调用哪个版本的机制叫做"动态绑定", c++中一个基类类型的指针或引用被赋予了一个派生类型的指针或引用时，常会遇到这种问题。java中亦有如此概念，我想对java熟悉的同行肯定知道这个概念。)

4, java 8中的接口与抽象类.

以上所述接口与抽象类的区别是java 6中的概念。

java 8终于在开发人员的苦苦等等下于今年3月份发布了，这个java 8对java语言的更新和拓展，其意义绝不亚于java 5/6的出现。在这里单独讲述一下java 8中有关接口与抽象类的问题。

其实java 8基本上没有对抽象类带来什么变化，相反，对接口的带来的巨大的改变。

首先java 8对接口带来了"功能接口"(Functional Interface)的概念. 我们知道java中定义的接口是十分脆弱的，如java库的Runnable接口和Callable接口，他们只有一个方法run()和call(), 此外再没有别的什么东西，也不能对这两个接口进行拓展.

java 8中引入的接口注解FunctionalInterface, 使得接口可以对自己添加方法声明来进行拓展, 例如：


1 @FunctionalInterface
2 public interface Functional {
3     void method();
4 }
java 8库中的Runnable和Callable接口已经实现了这个功能。喜欢尝鲜的同行已经可以尝试这个功能了。

4.1, java 8中接口的默认方法和静态方法.

java 8在接口引入了默认方法和静态方法的概念。同时FunctionalInterface并不会影响default方法和static方法。

java 8中的default方法和static方法的使用示例如下：


复制代码
 1 public interface DefaulableFactory {
 2     // Interfaces now allow static methods
 3     static Defaulable create( Supplier< Defaulable > supplier ) {
 4         return supplier.get();
 5     }
 6 
 7     private interface Defaulable {
 8         // Interfaces now allow default methods, the implementer    may or 
 9         // may not implement (override) them.
10         default String notRequired() { 
11             return "Default implementation"; 
12         }        
13     }
14         
15     private static class DefaultableImpl implements Defaulable {
16     }
17     
18     private static class OverridableImpl implements Defaulable {
19         @Override
20         public String notRequired() {
21             return "Overridden implementation";
22         }
23     }
24 
25     public static void main( String[] args ) {
26         Defaulable defaulable = DefaulableFactory.create(  DefaultableImpl::new );
27         System.out.println( defaulable.notRequired() );
28         
29         defaulable = DefaulableFactory.create( OverridableImpl::new );
30         System.out.println( defaulable.notRequired() );
31     }
32 
33 }

最新版本中的接口其default和static方法, 其出现已经可以取代抽象类了
(比如接口中方法全部都是default或者static方法，此时类似于抽象类中没有定义抽象方法一样)，不知道抽象类还有没有存在的意义？这个问题值得思考。