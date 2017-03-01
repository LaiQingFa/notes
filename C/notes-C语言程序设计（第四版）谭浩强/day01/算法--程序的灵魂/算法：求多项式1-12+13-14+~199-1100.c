
/*
算法：求多项式1-1/2+1/3-1/4+...1/99-1/100

*/

#include <stdio.h>
int main()
{
	int sign=1;                    //符号变量
	double deno=2.0,sum=1.0,term;  //中间数和结果变量
	while (deno<=100)              //循环次数为100
 {

  sign=-sign;                    //判断加的时候的符号

  term=sign/deno;				//需要加的那一项

  sum=sum+term;					//累加

  deno=deno+1;					//下一次要加的数的分母加1

 }

 printf("%f\n",sum);			//输出结果
	getchar();
	return 0;
}