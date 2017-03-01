/*
输入两个函数，用一个函数求出他们之和
*/


#include<stdio.h>
main()
{
	int a,b;
	scanf("%d %d",&a,&b);
	printf("a+b=%s",add(a,b));

}
int add(int a,int b)
{
	return a+b;
}