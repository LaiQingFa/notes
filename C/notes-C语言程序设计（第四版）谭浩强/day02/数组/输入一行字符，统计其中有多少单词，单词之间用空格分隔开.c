/*
输入一行字符，统计其中有多少单词，单词之间用空格分隔开

*/
#include <stdio.h>  
//输入一行字符，统计其中有多少单词，单词之间用空格分隔开  
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