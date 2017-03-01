package s;

public class Fibonacci {
   public static void main(String args[]){
	   short i=0,j=1;
	   do{
		   System.out.print("  "+i+"  "+j);
		   i=(short)(i+j);           //两个short类型整数运算结果是int类型，需要强转
		   j=(short)(i+j);
	   }while(i>0);          //short整数溢出，循环停止
	   
   }
}
