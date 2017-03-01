/*
    将外部变量的作用域扩展到其他文件
 
题目：给定b的值，输入a和m,求a*b和a^m的值
	  
			  */
#include<stdio.h>  
int A;   //定义外部变量

int main ()   
{  
	int power(int);
	int b=3,c,d,m;
	printf("请输入:\n");
	scanf("%d,%d",&A,&m);
	c=A*b;	
	printf("%d*%d=%d\n",A,b,c);
	d=power(m);
	printf("%d**%d=%d\n",A,m,d);
	getchar();
    return 0;  
}  

									