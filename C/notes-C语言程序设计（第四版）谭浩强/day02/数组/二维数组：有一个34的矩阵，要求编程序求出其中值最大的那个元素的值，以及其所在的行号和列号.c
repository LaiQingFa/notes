/*
��ά����   ��һ��3*4�ľ���Ҫ�������������ֵ�����Ǹ�Ԫ�ص�ֵ���Լ������ڵ��кź��кš�
*/
#include<stdio.h>  
  
int main() {  
    int i, j;  
    int max, row, colum;  
    int a[3][4] = { { 1, 2, 3, 4 }, { 9, 8, 7, 6 }, { -10, 10, -5, 2 } };    //�������鲢����ֵ
    max = a[0][0];                                                          //����Ϊ[0][[0]���
    for (i = 0; i < 3; i++)  
        for (j = 0; j < 4; j++)  
            if (max < a[i][j]) {                                           //���ĳԪ�ش���max��ֵ����ȡ��maxԭֵ
                max = a[i][j];  
                row = i;  
                colum = j;  
            }  
    printf("max=%d row=%d colum=%d\n", max, row, colum);  
    return 0;  
}  