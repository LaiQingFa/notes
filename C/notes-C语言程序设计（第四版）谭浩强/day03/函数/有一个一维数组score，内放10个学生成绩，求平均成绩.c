/*
ע�⣺������Ԫ����Ϊʵ�ε�ʱ�����βα������ݵ�������Ԫ�ص�ֵ������������������ʵ��ʱ�����βΣ���������ָ����������ݵ���������Ԫ�صĵ�ַ
       �β�������Բ�ָ����С
��Ŀ����һ��һά����score���ڷ�10��ѧ���ɼ�����ƽ���ɼ�
    ˼·���ú���average��ƽ���ɼ�������������Ϊ����ʵ�Σ��β�Ҳ��������
		  ��average���������ø�����Ԫ�أ���ƽ���ɼ�������main����
*/

#include <stdio.h>  
int main()  
{ float average(float array[10]);           // ��������  
  float score[10],aver;  
  int i;  
  printf("input 10 scores:\n");  
  for(i=0;i<10;i++)  
      scanf("%f",&score[i]);  
  printf("\n");  
  aver=average(score);                     // ����average����  
  printf("average score is %5.2f\n",aver);  
  return 0;  
}   
  
float average(float array[10])             // ����average����  
  {int i;  
   float aver,sum=array[0];  
   for(i=1;i<10;i++)  
       sum=sum+array[i];                  // �ۼ�ѧ���ɼ�  
   aver=sum/10;  
   return(aver);  
}  