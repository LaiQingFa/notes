/*
��Ŀ����ѡ�񷨶�10��������������
    ˼·��ѡ�񷨾������Ƚ�n��������С������a[0]�Ի���
	�ٽ�a[1]��a[n-1]����С������a[1]�Ի���ÿ�Ƚ�һ�֣��ҳ�һ��δ����������С��һ���������Ƚ�n-1��
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