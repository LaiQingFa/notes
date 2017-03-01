/*
字符指针数组   输入一个整数 输出对应的字符串
*/
#include <stdio.h>
#include <string.h>
char s[3][20]={
    "It is error!",
    "It is ok!",
    "It may ok.",
};
int main() {
    int i;
 
    while (1) {
        printf("Input a number(0..2):");
        fflush(stdout);
        rewind(stdin);
        if (1==scanf("%d",&i)) {
            if (0<=i && i<=2) {
                printf("%s\n",s[i]);
                continue;
            }
        }
        printf("Format error!\n");
        break;
    }
    return 0;
}