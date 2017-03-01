
/*
算法：华氏和摄氏温度之间的转换

*/

#include<stdio.h>
int main(void)
{
int type = 0;
float temperature = 0.0;
scanf("%d", &type);
scanf("%f", &temperature);
switch(type)
{
case 1://输入华氏，转摄氏
printf("%f\n", (temperature - 32.0f) * 5.0f / 9.0f);
break;
case 2://输入摄氏，转华氏
printf("%f\n", temperature * 9.0f / 5.0f - 32.0f);
break;
default:
printf("type undefined.\n");
}
return 0;
}