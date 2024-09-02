package NumbersLogicalPrograms;

import java.util.Scanner;

public class Factorial {
      public static void main(String args[])
      {
    	  Scanner scan = new Scanner(System.in);
    	  System.out.println("Enter a Number : ");
    	  int n=scan.nextInt();
    	  scan.close();
    	  int fact=1;
    	  for(int i=1;i<=n;i++) {
    		  fact=fact*i;
    	  }
    	  System.out.println("Factroial of the Given Number is : "+fact);
      }
}
