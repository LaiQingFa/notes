public class Yanghui {

	public static int [][] yanghui(int n){   //求 n行杨辉三角，返回二维数组
		int  mat[][] =new int [n][];  //申请第一维的空间
		for(int i=0;i<n;i++){
			mat[i]=new int [i+1];              //申请第二维的存储空间，每次长度不一样
			mat[i][0]=mat[i][i]=1;
			
			for(int j=1;i<j;j++)
				mat[i][j]=mat[i-1][j-1]+mat[i-1][j];
						
		}
		return mat;              //返回二维数组引用
		
	}
	
	public static void print(int mat[][]){
		for(int i=0;i<mat.length;i++){
			for(int j=0;j<mat[i].length;j++)
				System.out.print(""+mat[i][j]);
			System.out.println("");
		}
	}
	
	public static void main(String args[]){
	
		print(yanghui(10));
	}
	
}