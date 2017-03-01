/*
 解：给定一个大写字母，用小写字母输出
*/
#include <stdio.h>
int main()
{
	char c1,c2;
	c1='A';
	c2=c1+32;
	printf("%d\n",c1);          //输出得到c2的值，是字符'a'的ASCII代码
	printf("%c\n",c1);          //输出得到c2的值，是一个字符
	getchar();
	return 0;
}