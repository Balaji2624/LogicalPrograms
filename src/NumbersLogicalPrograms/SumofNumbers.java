// Calculate the sum of the number in given Range

package NumbersLogicalPrograms;

import java.util.Scanner;

public class SumofNumbers {
        public static void sum(int a,int b)
        {
        	for(int i=a;i<=b;i++)
        	{
        		System.out.print(i+" ");
        	}
        }
        public static void main(String args[])
        {
        	Scanner scan = new Scanner(System.in);
        	System.out.println("Enter a Range of the Niumbers : ");
        	int a=scan.nextInt();
        	int b=scan.nextInt();
        	scan.close();
        	sum(a,b);
        }
}
