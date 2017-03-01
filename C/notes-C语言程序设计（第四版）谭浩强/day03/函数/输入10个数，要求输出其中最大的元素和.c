/*

数组作为函数参数
题目：输入10个数，要求输出其中最大的元素和
*/

#include<stdio.h>  
  
int main()  
{  
    int max(int x,int y);  
    int a[10],m,n,i;  
    printf("intput 10 number:");  
    for(i = 0;i < 10;i ++)  
    {  
        scanf("%d",&a[i]);  
    }  
    printf("\n");  
    for(i = 0,m = a[0],n = 0;i < 10;i ++ )  
    {  
        if(max(m,a[i])>m)  
        {  
            m = max(m,a[i]);  
            n = i;  
        }  
    }  
    printf("The largest number:%d\n",m);  
    printf("The %dth number:\n",n+1);  
    return m;  
}  
int max(int x,int y)  
{  
    return (x>y?x:y);    //返回x和y 中最大者
}  