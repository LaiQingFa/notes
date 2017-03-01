/*
给出三角形三边，求面积
*/
#include <stdio.h>
#include <math.h>
int main()

{

     float a,b,c,s,area;

     printf("请输入三个边长（以Enter键结束每次输入）：\n");

     scanf("%f%f%f",&a,&b,&c);  //变量输入                          

     s=1.0/2*(a+b+c);  //计算s

     area=sqrt(s*(s-a)*(s-b)*(s-c)); //计算面积

     printf("a=%7.2f, b=%7.2f, c=%7.2f, s=%7.2f\n",a,b,c,s); 

     printf("area=%7.2f\n",area); //显示结果

}