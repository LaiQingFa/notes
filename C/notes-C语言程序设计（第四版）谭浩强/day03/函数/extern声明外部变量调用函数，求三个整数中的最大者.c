/*
��Ŀ�����ú����������������е������
	  ˼·����extern�����ⲿ�����������ⲿ�����ڳ����е�������		  
			  */
#include<stdio.h>  
int main ()   
{  
    int max();
	extern int A,B,C;            //���ⲿ����A,B,C����������չ���Ӵ˴���ʼ
	printf("������������");
	scanf("%d%d%d",&A,&B,&C);
	printf("max is %d\n",max());
	getchar();
    return 0;  
}  
int A,B,C;        //�����ⲿ����A,B,C
int max()
{
	int m ;
	m=A>B?A:B;
	if(C>m)m=C;
	return(m);
}
									