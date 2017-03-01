/*
指针;
 现用函数处理，而且用指针类型的数据作函数参数
 思路：定义一个函数swap，将指向两个整型变量的指针变量作为实参传递给swap函数的形参指针变量，在函数中通过指针实现交换两个变量的值
			  */


//题目：输入a和b两个整数，按先大后小的顺序输出a和b
#include <stdio.h>  
int main()  
 {void swap(int *p1,int *p2);  
  int a,b;  
  int*pointer_1,*pointer_2;  
  printf("please enter a and b:");  
  scanf("%d,%d",&a,&b);  
  pointer_1=&a;  
  pointer_2=&b;  
  if(a<b) swap(pointer_1,pointer_2);  
  printf("max=%d,min=%d\n",a,b);  
  return 0;  
 }      
  
void swap(int *p1,int *p2)  
 {int temp;  
  temp=*p1;  
  *p1=*p2;  
  *p2=temp;  
}  
									