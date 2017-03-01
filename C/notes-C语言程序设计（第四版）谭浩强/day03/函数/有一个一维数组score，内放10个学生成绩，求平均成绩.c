/*
注意：用数组元素最为实参的时候，向形参变量传递的是数组元素的值，而用数组名作函数实参时，向形参（数组名或指针变量）传递的是数组首元素的地址
       形参数组可以不指定大小
题目：有一个一维数组score，内放10个学生成绩，求平均成绩
    思路：用函数average求平均成绩，用数组名作为函数实参，形参也用数组名
		  在average函数中引用各数组元素，求平均成绩并返回main函数
*/

#include <stdio.h>  
int main()  
{ float average(float array[10]);           // 函数声明  
  float score[10],aver;  
  int i;  
  printf("input 10 scores:\n");  
  for(i=0;i<10;i++)  
      scanf("%f",&score[i]);  
  printf("\n");  
  aver=average(score);                     // 调用average函数  
  printf("average score is %5.2f\n",aver);  
  return 0;  
}   
  
float average(float array[10])             // 定义average函数  
  {int i;  
   float aver,sum=array[0];  
   for(i=1;i<10;i++)  
       sum=sum+array[i];                  // 累加学生成绩  
   aver=sum/10;  
   return(aver);  
}  