package s;
/**
 * �����������ڵ�һ�����ø����ʱ��ʹ�������ʵ����������ʵ���Ƿ���Ҫ����
 * 
 */
public class Hungry {
	private static Hungry singleton = new Hungry();
    private Hungry() {}
    public static Hungry getSignleton(){
        return singleton;
    }
}
//�������ĺô��Ǳ�д�򵥣������޷������ӳٴ������󡣵������Ǻܶ�ʱ��ϣ��������Ծ����ܵ��ӳټ��أ��Ӷ���С����