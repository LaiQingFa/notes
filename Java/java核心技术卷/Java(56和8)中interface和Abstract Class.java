
ת��http://www.cnblogs.com/littlepanpc/p/3757572.html

��ƪ������Ҫ���Լ���ʹ��java�Ĺ����ж��Լ�һЩ֮ǰ������������һЩ�ܽᡣ

������Ŀ���ԣ���ƪ������Ҫ������java�еĽӿ����������������Լ���ʹ���ĵã��Լ��Լ�ƽʱ��ʹ�õĹ��������������⼰���������

1, �����ϵ�����

��ʵ˵��ĳ������嶼�����������ף�ֻ��java���Լ����ϵ�������ܸ������������ߣ�java��"everything is an object", ���Խӿ������Ͻ�Ҳ��һ�ֶ��󣬻��߽���. ���Ķ�����: �Թؼ���interfaceȡ��class���������ǽӿ�, ����: public interface IA{}����������Ķ����أ�����: �Թؼ���abstract���ε��ඨ��. ����: public abstract class A {}. �����Ķ�����"���г��󷽷������ǳ�����"�ȵȶ���׼ȷ.

2, ʹ���ϵ�����

�ӿ�ֻ������"implements", ��ʵ�֡�����һ�������ͬʱʵ�ֶ���ӿڡ���������������"extends"��, ���̳С�һ����ֻ�ܼ̳�һ�������ࡣ������B�̳��˳�����A, ��BҪôʵ�������еĳ��󷽷���Ҫô���Լ�����Ϊabstract. ����û�б�Ľ������.

3, ��Ա�ϵ�����

�ӿ��еĳ�Ա����Ĭ�������public static final�ģ�����һ��Ϊʲô������أ�����ǽӿ�ԭ������Ҫ������������ʵ�ֵģ�����ĳ�Ա��������Ҫ�ýӿ�֮�������ʹ�õģ����԰ɣ�private�ǲ��еģ�protected��defaut�Ķ��������Ƶġ����ҽӿ��ֲ����ܱ�ʵ������Ҳ���Լ�����ȥ���ı�����ֵ�������Ҳ����ı�ӿڵĳ�Ա����ֵ����Ϊ�����B��C��ʵ����IA�ӿڣ���B�޸���IA�еĳ�Ա������ֵ����C���ʹ���˸ñ�����ֵ������Ҫʹ�øñ�����ԭֵ�����޸�֮���ֵ����������˻����ˣ����Ծ���static��final���˰�. �����ڳ������У����Զ����κ�Ȩ�޵ĳ�Ա����: public private protected��default�ġ�static��non-static�ġ�final��non-final�ġ�

Ȼ���������еĳ�Ա����.

�ӿ��еĳ�Ա������Ĭ����public�ģ�����: void get(int i)�����������ԣ����Ǿ����������������ʵ�ֵ�, �Ҳ�����static��final�ġ����ͬʱ���ӿ��е����з���ֻ���з��������������з����壬��ʹ�������в�ʵ���κβ����� ���ڳ������������Ҫ������ʵ�ֵķ�������÷����ùؼ���abstract����, ���磺public abstract void method();. �������п��Ժ��г��󷽷�����Ȼ��Ҳ������ȫ�����г��󷽷�(��ʱ���൱Ȼ���ɿ�����abstract���Σ����Ѿ��������壬��Ϊ���󷽷�ԭ������Ҫ������ʵ�����еĳ��󷽷���)�����ҳ������еķǳ��󷽷����Ե��ó��󷽷������磺public void f(){method();}, ���ڽӿ���ȴ������ˣ���Ϊ�ӿ��з����������ú��з�����, û�з�������Ȼ�޷�������������. (java�еĳ��󷽷�Դ��c++���麯���ĸ���麯��Ҫ�������า�Ǹú�����Ȼ��ü̳���ϵ�еĻ����������������ʱ���ø��麯��ʱ��������û���İ汾����������������汾�����ֱ�����ֻ��������ʱ����ȷ�������ĸ��汾�Ļ��ƽ���"��̬��", c++��һ���������͵�ָ������ñ�������һ���������͵�ָ�������ʱ�����������������⡣java��������˸�������java��Ϥ��ͬ�п϶�֪��������)

4, java 8�еĽӿ��������.

���������ӿ���������������java 6�еĸ��

java 8�����ڿ�����Ա�Ŀ��ȵ����ڽ���3�·ݷ����ˣ����java 8��java���Եĸ��º���չ���������������java 5/6�ĳ��֡������ﵥ������һ��java 8���йؽӿ������������⡣

��ʵjava 8������û�жԳ��������ʲô�仯���෴���ԽӿڵĴ����ľ޴�ĸı䡣

����java 8�Խӿڴ�����"���ܽӿ�"(Functional Interface)�ĸ���. ����֪��java�ж���Ľӿ���ʮ�ִ����ģ���java���Runnable�ӿں�Callable�ӿڣ�����ֻ��һ������run()��call(), ������û�б��ʲô������Ҳ���ܶ��������ӿڽ�����չ.

java 8������Ľӿ�ע��FunctionalInterface, ʹ�ýӿڿ��Զ��Լ���ӷ���������������չ, ���磺


1 @FunctionalInterface
2 public interface Functional {
3     void method();
4 }
java 8���е�Runnable��Callable�ӿ��Ѿ�ʵ����������ܡ�ϲ�����ʵ�ͬ���Ѿ����Գ�����������ˡ�

4.1, java 8�нӿڵ�Ĭ�Ϸ����;�̬����.

java 8�ڽӿ�������Ĭ�Ϸ����;�̬�����ĸ��ͬʱFunctionalInterface������Ӱ��default������static������

java 8�е�default������static������ʹ��ʾ�����£�


���ƴ���
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

���°汾�еĽӿ���default��static����, ������Ѿ�����ȡ����������
(����ӿ��з���ȫ������default����static��������ʱ�����ڳ�������û�ж�����󷽷�һ��)����֪�������໹��û�д��ڵ����壿�������ֵ��˼����