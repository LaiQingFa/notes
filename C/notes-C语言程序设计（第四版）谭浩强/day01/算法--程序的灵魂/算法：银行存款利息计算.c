
/*
�㷨�����д����Ϣ����

*/

#include <stdio.h>  
# define   PI  213.6   //���ų���  ����Ӵ��п�ʼ����PI����213.6   ϰ���Ϸ��ų����ô�д������
     //���ų���ֻ�Ǵ���һ���ַ�������Ԥ����ʱֻ�ǽ����ַ��滻����Ԥ����󣬷��ų����Ͳ������ˣ��Է��ų����������ǲ�����洢��Ԫ��
     //��ʹ�õĽǶȿ������������з��ų������ŵ㣬ʹ�ø�����
const float  pp=3.1415;       //������  �����б����Ļ������� �������ͣ�ռ�洢��Ԫ��ֻ�ǲ�����ı���ֵ  

int main ( )  
{  
    int  type;  
    double money, period, rate, interest;  
    printf("��ӭʹ����Ϣ��������\n");  
    printf("���������");  
    scanf("%lf", &money);  
    printf("======�������======\n");  
    printf("1. 3���� \n");  
    printf("2. 6����\n");  
    printf("3. һ�� \n");  
    printf("4. ����\n");  
    printf("5. ����\n");  
    printf("6. ����\n");  
    printf("�����������޵Ĵ��ţ�");  
    scanf("%d", &type);  
    if (type>=1 && type <=6)  
    {  
        switch(type)   //��if��Ƕ����switch���������  
        {  
        case 1:  
            period = 0.25;  
            rate = 0.031;  
            break;  
        case 2:  
            period = 0.5;  
            rate = 0.033;  
            break;  
        case 3:  
            period = 1;  
            rate = 0.035;  
            break;  
        case 4:  
            period = 2;  
            rate = 0.044;  
            break;  
        case 5:  
            period = 3;  
            rate = 0.05;  
            break;  
        case 6:  
            period = 5;  
            rate = 0.055;  
            break;  
        }  
        interest = money * period * rate;  
        printf("������ϢΪ��%.2lf Ԫ����Ϣ�ϼƹ� %.2lf Ԫ��\n", interest, interest + money);  
    }  
    else  
        printf("ѡ�������ʹ���\n");  
    printf("��л����ʹ�ã���ӭ�´ι��٣�\n");  
    return 0;  
}  
