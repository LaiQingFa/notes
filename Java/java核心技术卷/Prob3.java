package jr;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * 今日头条2017春招  形式化算式题 解
 *   对一个算式（包含数字加减乘除）进行点阵输出
 * 
 */
public class Prob3 {

	public static void main( String args[]){
		
		Prob3 t=new Prob3();
   	    	
   	    	
   	      }
   	      
   	      
   	      
   	    public Prob3(){
   			String a=" * ";
   			String b="***";
   			String c="*  ";
   			String d="  *";
   			String e="* *";
   			String f=" **";
   			
   			String []   one=new String[5];
   			one[0]=a;
   			one[1]=a;
   			one[2]=a;
   			one[3]=a;
   			one[4]=a;
   			String [] two=new String[5];
   			two[0]=b;
   			two[1]=d;
   			two[2]=b;
   			two[3]=c;	
   			two[4]=b;	
   			
   			
   			String [] three=new String[5];
   			three[0]=b;
   			three[1]=d;
   			three[2]=b;
   			three[3]=d;
   			three[4]=b;
   			
   			String [] four=new String[5];
   			four[0]=e;
   			four[1]=e;
   			four[2]=b;
   			four[3]=d;
   			four[4]=d;
   			
   			String [] five=new String[5];
   			five[0]=b;
   			five[1]=c;
   			five[2]=b;
   			five[3]=d;
   			five[4]=b;
   			
   			String [] six =new String[5];
   			six[0]=b;
   			six[1]=c;
   			six[2]=b;
   			six[3]=e;	
   			six[4]=b;
   			
   			String [] seven=new String[5];
   			seven[0]=b;
   			seven[1]=d;
   			seven[2]=d;
   			seven[3]=d;	
   			seven[4]=d;	
   			
   			String [] eight=new String[5];
   			eight[0]=b;
   			eight[1]=e;
   			eight[2]=b;
   			eight[3]=e;	
   			eight[4]=b;	
   			
   			String [] night=new String[5];
   			night[0]=b;
   			night[1]=e;
   			night[2]=b;
   			night[3]=d;
   			night[4]=b;
   			
   			String [] zero=new String[5];
   			zero[0]=b;
   			zero[1]=e;
   			zero[2]=e;
   			zero[3]=e;
   			zero[4]=b;
   			
   			String [] add=new String[5];
   			add[0]="   ";
   			add[1]=a;
   			add[2]=b;
   			add[3]=a;
   			add[4]="   ";
   			
   			String [] minus=new String[5];
   			minus[0]="   ";
   			minus[1]="   ";
   			minus[2]=b;
   			minus[3]="   ";
   			minus[4]="   ";
   			
   			String [] multiply=new String[5];
   			multiply[0]="   ";
   			multiply[1]=e;
   			multiply[2]=a;
   			multiply[3]=e;	
   			multiply[4]="   ";
   			String [] divide=new String[5];
   			divide[0]="   ";
   			divide[1]=d;
   			divide[2]=a;
   			divide[3]=c;
   			divide[4]="   ";
   			
   			
   			String [] dengyu=new String [5];
   			dengyu[0]="   ";
   			dengyu[1]=b;
   			dengyu[2]="   ";
   			dengyu[3]=b;
   			dengyu[4]="   ";
   			
   			String [] xiaoshudian=new String [5];
   			xiaoshudian[0]="   ";
   			xiaoshudian[1]="   ";
   			xiaoshudian[2]="   ";
   			xiaoshudian[3]=f;
   			xiaoshudian[4]=f;
   			
   			
   			String [] show=new String [5];
   			show[0]="   ";
   			show[1]="   ";
   			show[2]="   ";
   			show[3]="   ";
   			show[4]="   ";
   			

   		
   			  Scanner ArrayScan1 = new Scanner(System.in);
   	   	      String contxt =ArrayScan1.nextLine();
   	   	      String num1="";
   	   	      String num2 ="";
   	   	      String fuhao="";
   	   	      int test=0;
   	   	      int total=0;
   	   	      for(int i=0;i<contxt.length();i++){ 
   	   	    	String ch = contxt.charAt(i)+""; 
   	   	    	
   	   	      if(ch.equals("*")||ch.equals("-")||ch.equals("/")||ch.equals("+")){
   	            	test++;
   	            	 fuhao=ch; 
   	   		       
   	            }
   	  		      
   	   	    	  if(test!=0){
   	   	    		  num2+=ch;
   	   	    	  }else{
   	   	    		num1+=ch; 
   	   	    	  }     
   	   	      }
   	  
   	   	         int intnum2=Integer.parseInt(num2);
   	   	         int intnum1=Integer.parseInt(num1);
   	   	         
   	   	         switch(fuhao){
   	   	         case "*":
   	   	        	 total=intnum2*intnum1;
   	   	        	 break;
   	   	         case "-":
   	   	        	total=intnum1-intnum2;
   	   	        	break;
   	   	         case "+":
   	 	        	total=intnum1+intnum2;
   	 	        	break;
   	   	         case "/":
   		        	total=intnum1/intnum2;
   		        	break;
   	   	         }
   	   	         
   	   	         String showcontxt=contxt+"="+total;
   	   	      
      	   	      for(int i=0;i<showcontxt.length();i++){ 
         	   	    	String ch = showcontxt.charAt(i)+""; 
         	   	    	if(ch.equals(1+"")){
         	   	    		show[0]+=one[0]+"  ";
         	   	    		show[1]+=one[1]+"  ";
         	   	    		show[2]+=one[2]+"  ";
         	   	    		show[3]+=one[3]+"  ";
         	   	    		show[4]+=one[4]+"  ";
         	   	    		
         	   	    	}else if(ch.equals(2+"")){
         	   	    		show[0]+=two[0]+"  ";
         	   	    		show[1]+=two[1]+"  ";
         	   	    		show[2]+=two[2]+"  ";
         	   	    		show[3]+=two[3]+"  ";
         	   	    		show[4]+=two[4]+"  ";
         	   	    	}else if(ch.equals(3+"")){
         	   	    		show[0]+=three[0]+"  ";
         	   	    		show[1]+=three[1]+"  ";
         	   	    		show[2]+=three[2]+"  ";
         	   	    		show[3]+=three[3]+"  ";
         	   	    		show[4]+=three[4]+"  ";
         	   	   	    	}
         	   	    	else if(ch.equals(4+"")){
         	   	    		show[0]+=four[0]+"  ";
         	   	    		show[1]+=four[1]+"  ";
         	   	    		show[2]+=four[2]+"  ";
         	   	    		show[3]+=four[3]+"  ";
         	   	    		show[4]+=four[5]+"  ";
         	   	   	    	}
         	   	    	else if(ch.equals(5+"")){
         	   	    		show[0]+=five[0]+"  ";
         	   	    		show[1]+=five[1]+"  ";
         	   	   	 		show[2]+=five[2]+"  ";
         	   	   	 		show[3]+=five[3]+"  ";
         	   	   	 		show[4]+=five[4]+"  ";
         	   	   	    	}
         	   	    	else if(ch.equals(6+"")){
         	   	    		show[0]+=six[0]+"  ";
         	   	    		show[1]+=six[1]+"  ";
         	   	    		show[2]+=six[2]+"  ";
         	   	    		show[3]+=six[3]+"  ";
         	   	    		show[4]+=six[4]+"  ";
         	   	   	    	}
         	   	    	else if(ch.equals(7+"")){
         	   	    		show[0]+=seven[0]+"  ";
         	   	    		show[1]+=seven[1]+"  ";
         	   	    		show[2]+=seven[2]+"  ";
         	   	    		show[3]+=seven[3]+"  ";
         	   	    		show[4]+=seven[4]+"  ";
         	   	   	    	}
         	   	    	else if(ch.equals(8+"")){
         	   	    		show[0]+=eight[0]+"  ";
         	   	    		show[1]+=eight[1]+"  ";
         	   	    		show[2]+=eight[2]+"  ";
         	   	    		show[3]+=eight[3]+"  ";
         	   	    		show[4]+=eight[4]+"  ";
         	   	   	    	}
         	   	    	else if(ch.equals(9+"")){
         	   	    		show[0]+=night[0]+"  ";
         	   	    		show[1]+=night[1]+"  ";
         	   	   	 		show[2]+=night[2]+"  ";
         	   	   	 		show[3]+=night[3]+"  ";
         	   	   	 		show[4]+=night[4];
         	   	   	    	}
         	   	    	else if(ch.equals(0+"")){
         	   	    		show[0]+=zero[0]+"  ";
         	   	    		show[1]+=zero[1]+"  ";
         	   	    		show[2]+=zero[2]+"  ";
         	   	    		show[3]+=zero[3]+"  ";
         	   	    		show[4]+=zero[4]+"  ";
         	   	   	    	}
         	   	    	else if(ch.equals("+")){
         	   	    		show[0]+=add[0]+"  ";
         	   	    		show[1]+=add[1]+"  ";
         	   	    		show[2]+=add[2]+"  ";
         	   	    		show[3]+=add[3]+"  ";
         	   	    		show[4]+=add[4]+"  ";
         	   	   	    	}
         	   	    	else if(ch.equals("-")){
         	   	    		show[0]+=minus[0]+"  ";
         	   	    		show[1]+=minus[1]+"  ";
         	   	    		show[2]+=minus[2]+"  ";
         	   	    		show[3]+=minus[3]+"  ";
         	   	    		show[4]+=minus[4]+"  ";
         	   	   	    	}
         	   	    	else if(ch.equals("*")){
         	   	    		show[0]+=multiply[0]+"  ";
         	   	    		show[1]+=multiply[1]+"  ";
         	   	    		show[2]+=multiply[2]+"  ";
         	   	    		show[3]+=multiply[3]+"  ";
         	   	    		show[4]+=multiply[4]+"  ";
         	   	   	    	}
         	   	    	else if(ch.equals("/")){
         	   	    		show[0]+=divide[0]+"  ";
         	   	    		show[1]+=divide[1]+"  ";
         	   	    		show[2]+=divide[2]+"  ";
         	   	    		show[3]+=divide[3]+"  ";
         	   	    		show[4]+=divide[4]+"  ";
         	   	   	    	}
         	   	    	else if(ch.equals(".")){
         	   	    		show[0]+=xiaoshudian[0]+"  ";
         	   	    		show[1]+=xiaoshudian[1]+"  ";
         	   	    		show[2]+=xiaoshudian[2]+"  ";
         	   	    		show[3]+=xiaoshudian[3]+"  ";
         	   	    		show[4]+=xiaoshudian[4]+"  ";
         	   	   	    	}else if(ch.equals("=")){
         	   	   	    	show[0]+=dengyu[0]+"  ";
         	   	   	    	show[1]+=dengyu[1]+"  ";
         	   	   	    	show[2]+=dengyu[2]+"  ";
         	   	   	    	show[3]+=dengyu[3]+"  ";
         	   	   	    	show[4]+=dengyu[4]+"  ";
         	   	   	   	    	}
         	         
         
         	   	      }     

		
   	   	         System.out.print(show[0]+"\r\n");
   	   	   System.out.print(show[1]+"\r\n");
   	   	System.out.print(show[2]+"\r\n");
   	 System.out.print(show[3]+"\r\n");
   	System.out.print(show[4]+"\r\n");
   	   	         
   	   	         
   	   	         
	}
	
}
