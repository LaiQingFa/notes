package s;
/**
 * ���߳�д������������
 *
 */
public class SingeTread {
	 	private static SingeTread singleton = null;
	    private SingeTread(){}
	    public static SingeTread getSingleton() {
	        if(singleton == null) singleton = new SingeTread();
	        return singleton;
	    }
}
/**
 * ����д������򵥵ģ���˽�й�������һ�����о�̬�����������ɣ�
 * �ڹ��������ж�singleton����null�жϣ������null��newһ����������󷵻�singleton����
 * ���ַ�������ʵ����ʱ���أ�������һ���������㣺�̲߳���ȫ������������߳�ͬʱ����getSingleton()���������кܴ���ܵ����ظ���������
 */