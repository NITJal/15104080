//Q1. b)Write a Java program to multiply two given matrices.
package Assignment01;
import java.util.Scanner;
public class ArrayMultiplication {
	
		public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter rowsize of 1st array  ");
		int x=sc.nextInt();
		System.out.print("Enter colsize 1st of array  ");
		int y=sc.nextInt();
		int i,j,k;
		int a[][]=new int [x][y];
			
		System.out.print("Enter rowsize of 2nd array  ");
		
		
		int p=sc.nextInt();
		System.out.print("Enter colsize 2nd of array  ");
		int q=sc.nextInt();
		int b[][]=new int [p][q];
		if(y!=p){
			System.out.println("Multiplication Not possible !!!! ");
		}
		else {
		System.out.println("Enter Elements of  1st array");
		for(i=0;i<x;i++){
			for(j=0;j<y;j++){
		a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Enter Elements of  2nd array");
		for(i=0;i<p;i++)
		{
			for(j=0;j<q;j++)
			{
		b[i][j]=sc.nextInt();
			}
			
		}
		int  c[][]=new int [x][q];
		
		for(k=0;k<x;k++)
		{
			for(i=0;i<q;i++)
			{
				c[k][i]=0;
				for(j=0;j<p;j++){
					c[k][i]=c[k][i]+(a[k][j]*b[j][i]) ;
				}
				
			}
		}
		System.out.println("Matrix Multiplication is  ");
		for(i=0;i<x;i++)
		{
			for(j=0;j<q;j++)
			{
				System.out.print(c[i][j]+"\t");
		}
			System.out.print("\n");
			}
		
		
		
	}
}
}