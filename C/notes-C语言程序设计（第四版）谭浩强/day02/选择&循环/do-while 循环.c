/*��C�����л���һ�� do-while ѭ����
do-whileѭ����һ����ʽΪ��
do{
    ����
}while(���ʽ);

��do-while����1�ӵ�100��ֵ��
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