/*在C语言中还有一种 do-while 循环。
do-while循环的一般形式为：
do{
    语句块
}while(表达式);

用do-while计算1加到100的值：
*/

#include <stdio.h>
int main(){
  int i=1, sum=0;
  do{
    sum+=i;
    i++;
  }while(i<=100);
  printf("%d\n", sum);
  return 0;
}