/*
题目：用选择法对10个整数进行排序。
    思路：选择法就是首先将n个数中最小的数与a[0]对换，
	再将a[1]到a[n-1]中最小的数与a[1]对换，每比较一轮，找出一个未经排序中最小的一个数。共比较n-1轮
*/
#include <stdio.h>

void sort(int [], int);
int main(int argc, int *argv[])
{
    int a[10] = {3,24,65,76,86,34,64,25,47,97};
    int i;
    sort(a,10);
    for (i = 0; i < 10; i++)
    {
        printf("%d ",a[i]);
    }
    
    getchar();
    return 0;
}

void sort(int array[],int n)
{
     int i,j,k,t;
     for (i = 0; i < n - 1; i++)
     {
         k = i;
         for (j = i + 1; j < n ;j++)
         {
             if (array[j] < array[k]) 
             {
                k = j;
             }
         }
         
         t = array[i];
         array[i] = array[k];         
         array[k] = t;
     }
}