/*
    ���ⲿ��������������չ�������ļ�
 
��Ŀ������b��ֵ������a��m,��a*b��a^m��ֵ
	  
			  */
#include<stdio.h>  
int A;   //�����ⲿ����

int main ()   
{  
	int power(int);
	int b=3,c,d,m;
	printf("������:\n");
	scanf("%d,%d",&A,&m);
	c=A*b;	
	printf("%d*%d=%d\n",A,b,c);
	d=power(m);
	printf("%d**%d=%d\n",A,m,d);
	getchar();
    return 0;  
}  

									