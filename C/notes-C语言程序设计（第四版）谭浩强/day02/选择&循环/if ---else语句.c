/*if ---else语句

C语言规定，else 总是与它前面最近的if配对
*/

#include <stdio.h>
int main(void){
    char c;
    printf("input a character:    ");
    c=getchar();
    if(c<32)
        printf("This is a control character\n");
    else if(c>='0'&&c<='9')
        printf("This is a digit\n");
    else if(c>='A'&&c<='Z')
        printf("This is a capital letter\n");
    else if(c>='a'&&c<='z')
        printf("This is a small letter\n");
    else
        printf("This is an other character\n");
    return 0;
}