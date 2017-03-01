/*
二维数组   将一个二维数组行和列的元素互换，存到另一个二维数组中。
*/
#include<stdio.h>
int main()
{
	int i, j, a[2][3] = { {1,2,3},{4,5,6} },b[3][2];
	printf("array a:\n");
	for (i = 0; i <=1; i++)//处理a数组中的一行中各元素
	{
		for (j = 0; j <= 2; j++)//处理a数组中的某一列元素
		{
			printf("%5d", a[i][j]);
			b[j][i] = a[i][j];
		}
		printf("\n");
	}
	printf("array b:\n");
	for (i = 0; i<=2; i++)
	{
		for (j = 0; j <=1; j++)
		{
			printf("%5d", b[i][j]);
		}
		printf("\n");
	}
	getchar();
	return 0;
}