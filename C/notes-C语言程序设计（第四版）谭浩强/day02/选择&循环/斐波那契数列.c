#include<stdio.h>
int fun(int n)      //n����ڼ���ر�ָ����0�ǵ�0����ǵ�1�
{
    if (n <= 1)
        return n;
    else
        return fun(n-1) + fun(n-2);
}
 
int main()
{
    int n;
    printf("������Ҫ����������Ȼ����쳲��������У�");
    scanf("%d",&n);
    //int *a = (int *)malloc((n+1)*sizeof(int));//����洢��ʹ�ö�̬�ڴ����n+1���ռ���д洢
    int i;
    for (i = 0; i < n+1; i++)         //���������
    {
        printf("%d, ", fun(i));
        if (i != 0 && i%5 == 0)     //ÿ�������һ�λ��У���һ�ж�һ����0�
            printf("\n");
    }
    printf("�� %d ���ǣ�%d\n", n, fun(n)); //���Ҫ�����
	getchar();
    return 0;
}
