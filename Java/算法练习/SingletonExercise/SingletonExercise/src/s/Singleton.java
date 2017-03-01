package s;
/**
 * 
 * �������̰߳�ȫ������singleton��null�ж��Լ�new�Ĳ���ʹ��synchronized���м�����
 * ͬʱ����singleton����ʹ��volatile�ؼ��ֽ�������
 * ��֤��������̵߳Ŀɼ��ԣ����ҽ�ֹ�������ָ���������Ż�����˼��ɴ������ϱ�֤���ֵ���ģʽд�����̰߳�ȫ�ġ�
 * ȱ�㣺Ч�ʵ��£������޷�ʵ��Ӧ�á���Ϊÿ�ε���getSingleton()��������������synchronized��������Ŷӣ�������������Ҫnew������Ƿǳ��ٵ�
 */
public class Singleton {
	private static volatile Singleton singleton = null;
	  
    private Singleton(){}
  
    public static Singleton getSingleton(){
        synchronized (Singleton.class){
            if(singleton == null){
                singleton = new Singleton();
            }
        }
        return singleton;
    }    
}
