
/*
�㷨�������ʽ1-1/2+1/3-1/4+...1/99-1/100

*/

#include <stdio.h>
int main()
{
	int sign=1;                    //���ű���
	double deno=2.0,sum=1.0,term;  //�м����ͽ������
	while (deno<=100)              //ѭ������Ϊ100
 {

  sign=-sign;                    //�жϼӵ�ʱ��ķ���

  term=sign/deno;				//��Ҫ�ӵ���һ��

  sum=sum+term;					//�ۼ�

  deno=deno+1;					//��һ��Ҫ�ӵ����ķ�ĸ��1

 }

 printf("%f\n",sum);			//������
	getchar();
	return 0;
}