/*
�������������ߣ������
*/
#include <stdio.h>
#include <math.h>
int main()

{

     float a,b,c,s,area;

     printf("�����������߳�����Enter������ÿ�����룩��\n");

     scanf("%f%f%f",&a,&b,&c);  //��������                          

     s=1.0/2*(a+b+c);  //����s

     area=sqrt(s*(s-a)*(s-b)*(s-c)); //�������

     printf("a=%7.2f, b=%7.2f, c=%7.2f, s=%7.2f\n",a,b,c,s); 

     printf("area=%7.2f\n",area); //��ʾ���

}