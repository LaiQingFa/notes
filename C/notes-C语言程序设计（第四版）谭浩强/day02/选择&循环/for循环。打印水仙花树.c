// ��ӡ������ˮ�ɻ���
#include <stdio.h>
int main(){

    int i,j,k,n,s;
    printf("ˮ�ɻ�����:\n");
    for(n = 100;n < 1000;n++)
    {
      i = n / 100;     /*�ֽ����λ*/
      j = n / 10 % 10;   /*�ֽ��ʮλ*/
      k = n % 10;     /*�ֽ����λ*/
      s = i * i * i + j * j * j + k * k * k;
      if(s == n)
      {
        printf("%d\n",n);
      }
    }
  getchar();
  return 0;
}
