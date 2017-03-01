/*
1.函数的嵌套调用
2.函数的递归调用:在调用一个函数本身又出现直接或间接的调用该函数本身
                   只应出现有限次数，有终止的递归调用  可用if语句来控制

题目：用递归方法求n!
*/

#include<stdio.h>
int fun(int n)   //定义函数
{
    if(n==0||n==1)
    {
        n=1;
    }
    else
    {
     n=n*fun(n-1);  //递归调用函数
    }
}
  int main()
  {
        int i,j;
        printf("请输入一个数字:\n");
        scanf("%d",&i);
        j=fun(i);
        printf("它的阶乘为： %d",j);
  }