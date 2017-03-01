/*
二维数组   有一个3*4的矩阵，要求编程序求出其中值最大的那个元素的值，以及其所在的行号和列号。
*/
#include<stdio.h>  
  
int main() {  
    int i, j;  
    int max, row, colum;  
    int a[3][4] = { { 1, 2, 3, 4 }, { 9, 8, 7, 6 }, { -10, 10, -5, 2 } };    //定义数组并赋初值
    max = a[0][0];                                                          //先认为[0][[0]最大
    for (i = 0; i < 3; i++)  
        for (j = 0; j < 4; j++)  
            if (max < a[i][j]) {                                           //如果某元素大于max的值，就取代max原值
                max = a[i][j];  
                row = i;  
                colum = j;  
            }  
    printf("max=%d row=%d colum=%d\n", max, row, colum);  
    return 0;  
}  