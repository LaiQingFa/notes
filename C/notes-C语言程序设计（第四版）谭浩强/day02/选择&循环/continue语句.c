/* 
continue��������������ѭ������ʣ�������ǿ��ִ����һ��ѭ����
continue���ֻ����for��while��do-while��ѭ�����У�����if�������һ��ʹ�ã���������ѭ����
*/
#include <stdio.h>
int main(void){
    char c;
    while(c!=13){      /*���ǻس�����ѭ��*/
        c=getchar();
        if(c==0X1B)
            continue; /*����Esc�������������´�ѭ��*/
        printf("%c\n", c);    //%c �����ַ�   Ҳ���Ǹ�ʽ������ַ�
    }
    return 0;
}