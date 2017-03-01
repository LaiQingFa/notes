/*

题目：汉诺塔--递归算法
	第一，把a上的n-1个盘通过c移动到b
	第二，把a上的最下面的盘移到c
	第三，因为n-1个盘全在b上了，所以把b当做a重复以上步骤
*/

#include<stdio.h>
 
void move(int n,char a,char b,char c)
{
    if(n==1)
        printf("\t%c->%c\n",a,c);    //当n只有1个的时候直接从a移动到c
    else
    {
        move(n-1,a,c,b);            //第n-1个要从a通过c移动到b
        printf("\t%c->%c\n",a,c);
        move(n-1,b,a,c);            //n-1个移动过来之后b变开始盘，b通过a移动到c，这边很难理解
    }
}
 
main()
{
    int n;
    printf("请输入要移动的块数：");
    scanf("%d",&n);
    move(n,'a','b','c');
}