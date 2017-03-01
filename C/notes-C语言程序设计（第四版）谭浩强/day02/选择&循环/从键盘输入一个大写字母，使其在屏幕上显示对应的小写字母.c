/*题目：从键盘输入一个大写字母，使其在屏幕上显示对应的小写字母

   思路：这一题需要找到对应的ASCII码，用getchar函数从键盘读入一个大写字母，把它转换成小写字母，然后用putchar函数输出该小写字母
*/

#include <stdio.h>
int main()
{ 
	char a,b; 
	a=getchar();
	b=a+32;
	putchar(b);
	putchar('\n');
	return 0; 
}