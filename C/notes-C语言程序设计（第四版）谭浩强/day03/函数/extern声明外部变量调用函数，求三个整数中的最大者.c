/*
题目：调用函数，求三个整数中的最大者
	  思路：用extern声明外部变量，扩张外部变量在程序中的作用域		  
			  */
#include<stdio.h>  
int main ()   
{  
    int max();
	extern int A,B,C;            //把外部变量A,B,C的作用域扩展到从此处开始
	printf("请输入三个数");
	scanf("%d%d%d",&A,&B,&C);
	printf("max is %d\n",max());
	getchar();
    return 0;  
}  
int A,B,C;        //定义外部变量A,B,C
int max()
{
	int m ;
	m=A>B?A:B;
	if(C>m)m=C;
	return(m);
}
									