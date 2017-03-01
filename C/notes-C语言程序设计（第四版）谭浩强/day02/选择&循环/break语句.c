/* 当break语句用于do-while、for、while循环语句中时，
可使程序终止循环而执行循环后面的语句，通常break语句总是与if语句联在一起，即满足条件时便跳出循环。
break语句对if-else的条件语句不起作用；
在多层循环中，一个break语句只向外跳一层。
*/
#include <stdio.h>
int main(void){
    int i=0;
    char c;
    while(1){  /*设置循环*/
        c='\0';  /*变量赋初值*/
        while(c!=13&&c!=27){  /*键盘接收字符直到按回车或Esc键*/
            c=getchar();
            printf("%c\n", c);
        }
        if(c==27)
            break;          /*判断若按Esc键则退出循环*/
        i++;
        printf("The No. is %d\n", i);
    }
    printf("The end");
    return 0;
}