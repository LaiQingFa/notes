
/*
�㷨�����Ϻ������¶�֮���ת��

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
case 1://���뻪�ϣ�ת����
printf("%f\n", (temperature - 32.0f) * 5.0f / 9.0f);
break;
case 2://�������ϣ�ת����
printf("%f\n", temperature * 9.0f / 5.0f - 32.0f);
break;
default:
printf("type undefined.\n");
}
return 0;
}