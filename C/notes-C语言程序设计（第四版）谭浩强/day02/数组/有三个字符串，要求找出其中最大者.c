/*
有三个字符串，要求找出其中最大者

*/
#include<stdio.h>
#include<string.h>
int main()
{
	int i;

	char a[20],b[20],c[20],max[20],d[20];
	gets(a);
	gets(b);
	gets(c);
	if(strcmp(a,b)>0)
	{
		for(i=0;i<=19;i++)
		d[i]=a[i];
	}
	else 
	{
		for(i=0;i<=19;i++)
		d[i]=b[i];
	}
	if(strcmp(d,c)>0)
	{
		for(i=0;i<=19;i++)
		max[i]=d[i];}
	else 
	{
		for(i=0;i<=19;i++)
		max[i]=c[i];
	}
	printf("THE LARGEST STRING IS %s\n",max);
}