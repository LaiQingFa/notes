/*��Ŀ���Ӽ�������һ����д��ĸ��ʹ������Ļ����ʾ��Ӧ��Сд��ĸ

   ˼·����һ����Ҫ�ҵ���Ӧ��ASCII�룬��getchar�����Ӽ��̶���һ����д��ĸ������ת����Сд��ĸ��Ȼ����putchar���������Сд��ĸ
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