/* ��break�������do-while��for��whileѭ�������ʱ��
��ʹ������ֹѭ����ִ��ѭ���������䣬ͨ��break���������if�������һ�𣬼���������ʱ������ѭ����
break����if-else��������䲻�����ã�
�ڶ��ѭ���У�һ��break���ֻ������һ�㡣
*/
#include <stdio.h>
int main(void){
    int i=0;
    char c;
    while(1){  /*����ѭ��*/
        c='\0';  /*��������ֵ*/
        while(c!=13&&c!=27){  /*���̽����ַ�ֱ�����س���Esc��*/
            c=getchar();
            printf("%c\n", c);
        }
        if(c==27)
            break;          /*�ж�����Esc�����˳�ѭ��*/
        i++;
        printf("The No. is %d\n", i);
    }
    printf("The end");
    return 0;
}