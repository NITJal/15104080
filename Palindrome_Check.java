//Q2 a) Write a Java program that checks whether a given string is a palindrome or not. Ex: MADAM is a palindrome.
package Assignment01;
import java.util.Scanner;
public class Palindrome_Check 
{
		public static void main(String args[])
		{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the string to be check for Palindrome :  ");
		String s=sc.nextLine();
		int  l=s.length();
		int i,j=l-1,c=0;
		
		for(i=0;i<l/2;i++)
		{
			if(s.charAt(i)==s.charAt(j))
			{
				c++;
				j--;
			}
			if(c==0)
			{
				System.out.println("NO");
				break;}
		}
		 if(c==l/2)
			System.out.println("YES");

			}
	}