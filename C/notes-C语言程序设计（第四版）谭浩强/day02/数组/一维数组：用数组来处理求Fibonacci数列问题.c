/*
一维数组   用数组来处理求Fibonacci数列问题
*/
#include<stdio.h>
int main()
{
	int i, f[20] = { 1,1 };//对最前面两个元素f[0]和f[1]赋初值1
	for (i = 2; i < 20; i++)
	{
		f[i] = f[i-2]+f[i-1];//先后求出f[2]~f[19]的值
	}
	for (i = 0; i<20; i++)
	{
		if (i % 5 == 0)//控制每输出5个数后换行
		{
			printf("\n");
		}
		printf("%d\t", f[i]);//输出一个数
	}
	printf("\n");
	getchar();
	return 0;
}