/*求方程ax^2+bx+c=0的实数根.a,b,c由键盘输入,a≠0且b^2-4ac>0*/
#include <stdio.h>
#include <math.h>
int main()
{
   float a=0;
   float b=0;
float c=0;
float d=0;
printf("Please input a,b,c:\n");
scanf("%f,%f,%f",&a,&b,&c);           //&a表示a在内存中的地址    
d=b*b-4*a*c;
if(d<0){
printf("No Solution");
}
else{
 d=sqrt(d);
b=0-b;
 printf("x1=%f,x2=%f",(b+d)/(2*a),(b-d)/(2*a));
}


getchar();
return 0;
}