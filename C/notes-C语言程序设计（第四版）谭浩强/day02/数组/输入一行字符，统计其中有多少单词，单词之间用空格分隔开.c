/*
����һ���ַ���ͳ�������ж��ٵ��ʣ�����֮���ÿո�ָ���

*/
#include <stdio.h>  
//����һ���ַ���ͳ�������ж��ٵ��ʣ�����֮���ÿո�ָ���  
int main()  
{  
    int i,num=0,word=0;  
    char string[80];  
    char c;  
        gets(string);  
    for(i=0;(c=string[i])!='\0';i++)  
        if(c==' ')word=0;  
        else if(word==0)  
        {word=1;  
         num++;  
        }  
    printf("there is %d words in this line;\n",num);  
    return 0;  
}  