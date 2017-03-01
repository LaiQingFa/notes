/*
多维数组名作函数参数
题目：有一个3*4的矩阵，求所有元素中的最大值

*/
#include<stdio.h>  
 
  
int main ()  
  
{  
    int max_value(int array[][4]);								//函数声明  
    int a[3][4]={{11,32,45,67},{22,44,66,88},{15,72,43,37}};	//定义数组并初始化  
	printf("max_value=%d\n",max_value(a));//输出最大值  
	getchar();
    return 0;  
}  
  
int max_value(int array[][4])  
{  
    int i,j,max;  
    max=array[0][0];  
    for(i=0;i<3;i++)  
        for(j=0;j<4;j++)  
            if(array[i][j]>max) max=array[i][j];  
    return max;													//返回最大值  
}  