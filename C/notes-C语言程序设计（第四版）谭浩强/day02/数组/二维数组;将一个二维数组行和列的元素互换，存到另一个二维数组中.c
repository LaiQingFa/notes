/*
��ά����   ��һ����ά�����к��е�Ԫ�ػ������浽��һ����ά�����С�
*/
#include<stdio.h>
int main()
{
	int i, j, a[2][3] = { {1,2,3},{4,5,6} },b[3][2];
	printf("array a:\n");
	for (i = 0; i <=1; i++)//����a�����е�һ���и�Ԫ��
	{
		for (j = 0; j <= 2; j++)//����a�����е�ĳһ��Ԫ��
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