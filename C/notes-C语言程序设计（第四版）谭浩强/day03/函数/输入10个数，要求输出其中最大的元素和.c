/*

������Ϊ��������
��Ŀ������10������Ҫ�������������Ԫ�غ�
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
    return (x>y?x:y);    //����x��y �������
}  