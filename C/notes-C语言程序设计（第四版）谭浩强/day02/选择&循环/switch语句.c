/*在使用switch语句时应注意以下几点：
在case后的各常量表达式的值不能相同，否则会出现错误。
在case后，允许有多个语句，可以不用{}括起来。
各case和default子句的先后顺序可以变动，而不会影响程序执行结果。
default子句可以省略不用。
*/

#include <stdio.h>
int main(void){
    int a;
    printf("input integer number:    ");
    scanf("%d",&a);
    switch (a){
        case 1:printf("Monday\n");  
			break;
        case 2:printf("Tuesday\n"); 
			break;
        case 3:printf("Wednesday\n");
			break;
        case 4:printf("Thursday\n");  
			break;
        case 5:printf("Friday\n");  
			break;
        case 6:printf("Saturday\n");
			break;
        case 7:printf("Sunday\n"); 
			break;
        default:printf("error\n");
    }
    return 0;
}