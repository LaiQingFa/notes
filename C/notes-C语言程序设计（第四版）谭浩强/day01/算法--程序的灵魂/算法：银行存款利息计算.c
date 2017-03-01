
/*
算法：银行存款利息计算

*/

#include <stdio.h>  
# define   PI  213.6   //符号常量  代表从此行开始所有PI代表213.6   习惯上符号常量用大写来命名
     //符号常量只是代表一个字符串，在预编译时只是进行字符替换，在预编译后，符号常量就不存在了，对符号常量的名字是不分配存储单元的
     //从使用的角度看，常变量具有符号常量的优点，使用更方便
const float  pp=3.1415;       //常变量  ：具有变量的基本属性 ，有类型，占存储单元，只是不允许改变其值  

int main ( )  
{  
    int  type;  
    double money, period, rate, interest;  
    printf("欢迎使用利息计算器！\n");  
    printf("请输入存款金额：");  
    scanf("%lf", &money);  
    printf("======存款期限======\n");  
    printf("1. 3个月 \n");  
    printf("2. 6个月\n");  
    printf("3. 一年 \n");  
    printf("4. 二年\n");  
    printf("5. 三年\n");  
    printf("6. 五年\n");  
    printf("请输入存款期限的代号：");  
    scanf("%d", &type);  
    if (type>=1 && type <=6)  
    {  
        switch(type)   //在if中嵌入了switch分情况处理  
        {  
        case 1:  
            period = 0.25;  
            rate = 0.031;  
            break;  
        case 2:  
            period = 0.5;  
            rate = 0.033;  
            break;  
        case 3:  
            period = 1;  
            rate = 0.035;  
            break;  
        case 4:  
            period = 2;  
            rate = 0.044;  
            break;  
        case 5:  
            period = 3;  
            rate = 0.05;  
            break;  
        case 6:  
            period = 5;  
            rate = 0.055;  
            break;  
        }  
        interest = money * period * rate;  
        printf("到期利息为：%.2lf 元，本息合计共 %.2lf 元。\n", interest, interest + money);  
    }  
    else  
        printf("选择存款类型错误！\n");  
    printf("感谢您的使用，欢迎下次光临！\n");  
    return 0;  
}  
