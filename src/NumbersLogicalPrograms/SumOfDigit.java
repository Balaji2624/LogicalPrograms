package NumbersLogicalPrograms;

import java.util.Scanner;

public class SumOfDigit {
         public static void main(String args[])
         {
        	 Scanner scan = new Scanner(System.in);
        	 System.out.println("Enter a Number : ");
        	 int n= scan.nextInt();
        	 scan.close();
        	 int sum=0;
        	while(n != 0)
        	{
        		int r=n%10;
        		sum=sum+r;
        		n=n/10;
        	}
            System.out.println(sum);
       
        	 
         }
}
