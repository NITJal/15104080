// Q1. a) Write a Java program that prompts the user for an integer and then prints out all prime numbers up to that integer.
package Assignment01;
import java.util.Scanner;

public class PrimeNum {
public static void main(String args[])
		{
			Scanner sc= new Scanner(System.in);
			int n,i,p;
			System.out.print("Enter the Number Upto which all prime number have to be shown :     ");
			n=sc.nextInt();
			int prime[]=new int[n+1];
			for(i=0;i<=n;i++)
			{
				prime[i]=1;
			}
			for(p=2;p*p<=n;p++)
			{
				if(prime[p]==1)
				{
					for(i=p*2;i<=n;i=i+p)
					{
						prime[i]=0;
					}
				}
			}
			System.out.print("Prime Numbers upto  "+n+ " are :");
			for(i=2;i<=n;i++)
			{
				if(prime[i]==1)
				{
					System.out.print(" "+i+" ");
				}
			}

			
		}
}


