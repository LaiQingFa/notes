/*

��Ŀ����ŵ��--�ݹ��㷨
	��һ����a�ϵ�n-1����ͨ��c�ƶ���b
	�ڶ�����a�ϵ�����������Ƶ�c
	��������Ϊn-1����ȫ��b���ˣ����԰�b����a�ظ����ϲ���
*/

#include<stdio.h>
 
void move(int n,char a,char b,char c)
{
    if(n==1)
        printf("\t%c->%c\n",a,c);    //��nֻ��1����ʱ��ֱ�Ӵ�a�ƶ���c
    else
    {
        move(n-1,a,c,b);            //��n-1��Ҫ��aͨ��c�ƶ���b
        printf("\t%c->%c\n",a,c);
        move(n-1,b,a,c);            //n-1���ƶ�����֮��b�俪ʼ�̣�bͨ��a�ƶ���c����ߺ������
    }
}
 
main()
{
    int n;
    printf("������Ҫ�ƶ��Ŀ�����");
    scanf("%d",&n);
    move(n,'a','b','c');
}