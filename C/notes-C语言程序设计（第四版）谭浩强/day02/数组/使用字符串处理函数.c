/*
ʹ���ַ���������
 1.puts����
 2.gets����           ֻ������������һ���ַ���
 3.strcat   �ַ������Ӻ���
 4.strcpy ��strcnpy ����----�ַ������ƺ���
 5.strcmp����---�ַ����ȽϺ��� 
    �ַ�����С�ıȽ�����ASCII ����ϵ�˳����������
	��˳����Ϊ�ַ���ֵ��strcmp()���Ƚ�s1 ��һ���ַ�ֵ��ȥs2 ��һ���ַ�ֵ��
	����ֵΪ0 ���ټ����Ƚ��¸��ַ�������ֵ��Ϊ0 
	�򽫲�ֵ���ء������ַ���"Ac"��"ba"�Ƚ���᷵���ַ�"A"(65)��'b'(98)�Ĳ�ֵ(��33)
6.strlen ����----���ַ������ȵĺ���
7.strlwr  ����----ת��ΪСд�ĺ���
8.strupr  ����----ת��Ϊ��д�ĺ���

*/
#include <stdio.h>
#include <string.h>

int main() {
	char strii[1];
	gets(strii);
	char str[]={"chi"};
	printf("%d\n",strlen(str));
   puts(str);
   printf("%s\n",strcat(strii,str));
   char strcpy1[10];
    printf("%s\n",strcpy(strcpy1,str));
   getchar();
   
    return 0;
}