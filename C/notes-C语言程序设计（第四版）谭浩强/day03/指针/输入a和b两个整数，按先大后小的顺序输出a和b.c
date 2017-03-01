/*
指针;
 使指针加一意味着地址值加4个字节
 一个变量的指针含义包括两个方面，一个是以存储单元编号表示的地址（如编号为2000的字节）
                                   一是它指向的存储单元的数据类型（如int,float,char）
			  */


//题目：输入a和b两个整数，按先大后小的顺序输出a和b
#include<stdio.h>  

int main ()   
{  
    int *p1,*p2,*p,a,b;
	printf("请输入两个数\n");
	scanf("%d,%d",&a,&b);
	getchar();
	p1=&a;
	p2=&b;
	if(b>a)
	{
	 p=p1;p1=p2;p2=p;
	}
	printf("a=%d,b=%d\n",a,b);
	printf("p1=%d,p2=%d",*p1,*p2);
    return 0;  
}  

									