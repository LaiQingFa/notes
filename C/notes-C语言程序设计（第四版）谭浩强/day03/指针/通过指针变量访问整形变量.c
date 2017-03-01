/*
指针;
 为了说清楚什么是指针，必须弄清楚数据在内存中是如何存储的，又是如何读取的
 直接访问：直接按变量名进行的访问
 间接访问：将变量i的地址存放在另一变量中然后通过该变量来找到变量i的地址，从而访问i变量
指向是通过地址来体现的

一个变量的地址称为该变量的指针；
如果有一变量专门来存放另一变量的地址，称为指针变量（地址变量）；   指针是一个地址，而指针变量是存放地址的变量
	  

	  题目：通过指针变量访问整形变量
			  */
#include<stdio.h>  

int main ()   
{  
	int a =100,b=10;            //定义整型变量a,b并初始化
	int *pointer_1,*pointer_2;  //定义指向整型变量的指针变量pointer_1，pointer_2
	pointer_1=&a;               //把变量a的地址赋值给指针变量pointer_1
	pointer_2=&b;               //把变量b的地址赋值给指针变量pointer_2
	printf("a=%d,b=%d\n",a,b);    //输出变量a和b的值
	printf("*pointer_1=%d,*pointer_2=%d",*pointer_1,*pointer_2);     //输出变量a和b的值
	getchar();
    return 0;  
}  

									