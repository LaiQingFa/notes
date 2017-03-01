// 打印出所有水仙花数
#include <stdio.h>
int main(){

    int i,j,k,n,s;
    printf("水仙花数有:\n");
    for(n = 100;n < 1000;n++)
    {
      i = n / 100;     /*分解出百位*/
      j = n / 10 % 10;   /*分解出十位*/
      k = n % 10;     /*分解出个位*/
      s = i * i * i + j * j * j + k * k * k;
      if(s == n)
      {
        printf("%d\n",n);
      }
    }
  getchar();
  return 0;
}
