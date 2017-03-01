/* 
continue语句的作用是跳过循环体中剩余的语句而强行执行下一次循环。
continue语句只用在for、while、do-while等循环体中，常与if条件语句一起使用，用来加速循环。
*/
#include <stdio.h>
int main(void){
    char c;
    while(c!=13){      /*不是回车符则循环*/
        c=getchar();
        if(c==0X1B)
            continue; /*若按Esc键不输出便进行下次循环*/
        printf("%c\n", c);    //%c 单个字符   也就是格式化输出字符
    }
    return 0;
}