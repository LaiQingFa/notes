/**
������Դ��http://blog.csdn.net/carolzhang8406/article/details/46046095


��һ.ʲô��װ�䣿ʲô�ǲ��䣿
    JavaΪÿ�ֻ����������Ͷ��ṩ�˶�Ӧ�İ�װ������.
һ����new������洢�ڡ��ѡ��������new����һ�����󡪡��ر���С�ġ��򵥵ı������������Ǻ���Ч�����ԣ�������Щ���ͣ�
java������new���������������Ǵ���һ���������õġ��Զ����������������ֱ�Ӵ洢��ֵ���������ڶ��У���˸��Ӹ�Ч��
��ʱ��������Ҫ��int�����Ļ�������תΪ�������еĻ������Ͷ���һ����֮��Ӧ���ࡣ����Integer���Ӧ��������int��
��Щ�౻��Ϊ��װ������Щ�����װ���������ǣ�Integer��Long��Float��Double��Short��Byte��Character��Void��Boolean��
��Java SE5֮ǰ�����Ҫ����һ����ֵΪ10��Integer���󣬱����������У�
                 Integer i = new Integer(10);
���ڴ�Java SE5��ʼ���ṩ���Զ�װ������ԣ����Ҫ����һ����ֵΪ10��Integer����ֻ��Ҫ�����Ϳ����ˣ�
				Integer i = 10;
������������л��Զ�������ֵ������Ӧ�� Integer���������װ�䡣
��װ���Ӧ�������Զ�����װ������ת��Ϊ�����������ͣ�
				Integer i = 10;  //װ��
				int n = i;   //����
������һ��˵��װ�����  �Զ���������������ת��Ϊ��װ�����ͣ��������  �Զ�����װ������ת��Ϊ�����������͡�

 ��������װ���ʵ��
   װ�������ͨ�����ð�װ����valueOf����ʵ�ֵģ������������ͨ�����ð�װ���� xxxValue����ʵ�ֵġ���xxx�����Ӧ�Ļ����������ͣ���
   
   
 �������ӣ�
 .������δ������������ʲô��
public class Main {
    public static void main(String[] args) {
         
        Integer i1 = 100;
        Integer i2 = 100;
        Integer i3 = 200;
        Integer i4 = 200;
         
        System.out.println(i1==i2);
        System.out.println(i3==i4);
    }

	
	��ʵ���������ǣ�

true
false

����������i1��i2ָ�����ͬһ�����󣬶�i3��i4ָ����ǲ�ͬ�Ķ��󡣴�ʱֻ��һ��Դ���֪������
������δ�����Integer��valueOf�����ľ���ʵ�֣�
public static Integer valueOf(int i) {
        if(i >= -128 && i <= IntegerCache.high)
            return IntegerCache.cache[i + 128];
        else
            return new Integer(i);
    }
	
������IntegerCache���ʵ��Ϊ��

 private static class IntegerCache {
        static final int high;
        static final Integer cache[];

        static {
            final int low = -128;

            // high value may be configured by property
            int h = 127;
            if (integerCacheHighPropValue != null) {
                // Use Long.decode here to avoid invoking methods that
                // require Integer's autoboxing cache to be initialized
                int i = Long.decode(integerCacheHighPropValue).intValue();
                i = Math.max(i, 127);
                // Maximum array size is Integer.MAX_VALUE
                h = Math.min(i, Integer.MAX_VALUE - -low);
            }
            high = h;

            cache = new Integer[(high - low) + 1];
            int j = low;
            for(int k = 0; k < cache.length; k++)
                cache[k] = new Integer(j++);
        }

        private IntegerCache() {}
    }

��������2�δ�����Կ�������ͨ��valueOf��������Integer�����ʱ�������ֵ��[-128,127]֮�䣬
   �㷵��ָ��IntegerCache.cache���Ѿ����ڵĶ�������ã����򴴽�һ���µ�Integer����
   ����Ĵ�����i1��i2����ֵΪ100����˻�ֱ�Ӵ�cache��ȡ�Ѿ����ڵĶ�������i1��i2ָ�����ͬһ�����󣬶�i3��i4���Ƿֱ�ָ��ͬ�Ķ���

   2.������δ������������ʲô��
public class Main {
    public static void main(String[] args) {
         
        Double i1 = 100.0;
        Double i2 = 100.0;
        Double i3 = 200.0;
        Double i4 = 200.0;
         
        System.out.println(i1==i2);
        System.out.println(i3==i4);
    }
}
ʵ��������Ϊ��
false
false

ΪʲôDouble���valueOf�����������Integer���valueOf������ͬ��ʵ�֡��ܼ򵥣���ĳ����Χ�ڵ�������ֵ�ĸ��������޵ģ���������ȴ���ǡ�

���
		һ�㲻��ֱ���á�==�����ߡ�!=�����������������бȽϡ��ж������������Ƿ���ȿ��Ը������ǵĲ�ľ���ֵ�Ƿ����0�������жϡ�
		Math.abs(a-b)==0
		���ǵ�ʵ��Ӧ�ã�һ���������������֮��ľ���ֵС�ڻ����ĳһ���ɽ��ܵ����(�����ȣ�����0.00000001����)������Ϊ��������ȵġ�

		Math.abs(a-b)<0.00000001


ע�⣬Integer��Short��Byte��Character��Long�⼸�����valueOf������ʵ�������Ƶġ�
����������Double��Float��valueOf������ʵ�������Ƶġ�

3.������δ�����������ʲô��

public class Main {
    public static void main(String[] args) {
         
        Boolean i1 = false;
        Boolean i2 = false;
        Boolean i3 = true;
        Boolean i4 = true;
         
        System.out.println(i1==i2);
        System.out.println(i3==i4);
    }
}
�����������ǣ�

true
true

4.̸̸Integer i = new Integer(xxx)��Integer i =xxx;�����ַ�ʽ������
������Ȼ�������Ŀ���ڱȽϿ����͵ġ�����Ҫ��һ��Ҫ���ϣ����ܽ�һ����Ҫ����������������
����1����һ�ַ�ʽ���ᴥ���Զ�װ��Ĺ��̣����ڶ��ַ�ʽ�ᴥ����
����2����ִ��Ч�ʺ���Դռ���ϵ����𡣵ڶ��ַ�ʽ��ִ��Ч�ʺ���Դռ����һ���������Ҫ���ڵ�һ�������ע���Ⲣ���Ǿ��Եģ���

5.����������������ʲô��
public class Main {
    public static void main(String[] args) {
         
        Integer a = 1;
        Integer b = 2;
        Integer c = 3;
        Integer d = 3;
        Integer e = 321;
        Integer f = 321;
        Long g = 3L;
        Long h = 2L;
         
        System.out.println(c==d);
        System.out.println(e==f);
        System.out.println(c==(a+b));
        System.out.println(c.equals(a+b));
        System.out.println(g==(a+b));
        System.out.println(g.equals(a+b));
        System.out.println(g.equals(a+h));
    }
��������Ҫע����ǣ��� "=="��������������������� ��װ�����͵����ã����ǱȽ�ָ����Ƿ���ͬһ������
�����������һ���������Ǳ��ʽ���������������㣩��Ƚϵ�����ֵ�����ᴥ���Զ�����Ĺ��̣���
���⣬���ڰ�װ�����ͣ�equals�����������������ת������������2��֮���������������һĿ��Ȼ��

true
false
true
true
true
false
true

��һ���͵ڶ���������û��ʲô���ʡ�����������  a+b�������������㣬��˻ᴥ���Զ�������̣������intValue��������
������ǱȽϵ�����ֵ�Ƿ���ȡ�������c.equals(a+b)���ȴ����Զ�������̣��ٴ����Զ�װ����̣�
Ҳ����˵a+b�����ȸ��Ե���intValue�������õ��˼ӷ���������ֵ֮�󣬱����Integer.valueOf�������ٽ���equals�Ƚϡ�
ͬ����ں����Ҳ������������Ҫע�⵹���ڶ��������һ������Ľ��
�������ֵ��int���͵ģ�װ����̵��õ���Integer.valueOf�������long���͵ģ�װ����õ�Long.valueOf������



*/