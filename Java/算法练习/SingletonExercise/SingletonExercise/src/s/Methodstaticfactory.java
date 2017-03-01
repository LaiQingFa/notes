package s;
/**
 * ��̬����ʵ�ַ�
 * ���Ե���Methodstaticfactory.getSingleton()��ȡʵ��
 */
public class Methodstaticfactory {
	
	// �����Ǿ�̬��final�����������һ�μ��ص��ڴ��е�ʱ��ͳ�ʼ���ˣ����Դ�����ʵ����Ȼ��thread-safe��
	private static final Methodstaticfactory INSTANCE = new Methodstaticfactory();
	 
    private Methodstaticfactory(){}
 
    public static Methodstaticfactory getSingleton(){
        return INSTANCE;
    }
}
