/*
使用字符串处理函数
 1.puts函数
 2.gets函数           只能输入或者输出一个字符串
 3.strcat   字符串连接函数
 4.strcpy 和strcnpy 函数----字符串复制函数
 5.strcmp函数---字符串比较函数 
    字符串大小的比较是以ASCII 码表上的顺序来决定，
	此顺序亦为字符的值。strcmp()首先将s1 第一个字符值减去s2 第一个字符值，
	若差值为0 则再继续比较下个字符，若差值不为0 
	则将差值返回。例如字符串"Ac"和"ba"比较则会返回字符"A"(65)和'b'(98)的差值(－33)
6.strlen 函数----测字符串长度的函数
7.strlwr  函数----转换为小写的函数
8.strupr  函数----转换为大写的函数

*/
#include <stdio.h>
#include <string.h>

int main() {
	char strii[1];
	gets(strii);
	char str[]={"chi"};
	printf("%d\n",strlen(str));
   puts(str);
   printf("%s\n",strcat(strii,str));
   char strcpy1[10];
    printf("%s\n",strcpy(strcpy1,str));
   getchar();
   
    return 0;
}