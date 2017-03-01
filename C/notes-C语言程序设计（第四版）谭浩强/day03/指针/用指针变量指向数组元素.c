#include <stdio.h>
int main()
{
    int a[10];
    int i;
    int *p;
    printf("请输入10个整数\n");
    for(i=0;i<10;i++)
        scanf("%d",&a[i]);
        for(p=a;p<(a+10);p++)
            printf("%2d",*p);
        printf("%\n");
    return 0;
}