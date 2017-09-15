//Q2 b) Write a Java program for sorting a given list of names in ascending order.
package Assignment01;
import java.util.Scanner;
public class SortingNames {

    public static void main(String[] args) 
    {
        int n;
        String temp;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of names you want to enter:");
        n = sc.nextInt();
        String names[] = new String[n+1];
        System.out.print("Enter all the names:  ");
        for(int i = 0; i <= n; i++)
        {
            names[i] = sc.nextLine();
        }
        for (int i = 0; i <= n; i++) 
        {
            for (int j = i + 1; j <= n; j++) 
            {
                if (names[i].compareTo(names[j])>0) 
                {
                    temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }
        System.out.print("Names in Sorted Order:");
        for (int i = 0; i <= n ; i++) 
        {
            System.out.print(names[i]+"\t");
        }
    }
}


