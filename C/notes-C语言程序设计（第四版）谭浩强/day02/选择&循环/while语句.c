/*统计从键盘输入的一行字符的个数
*/

#include <stdio.h>
int main(){
  int n=0;
  printf("Input a string:");
  while(getchar()!='\n') n++;
  printf("Number of characters: %d\n", n);
  return 0;
}