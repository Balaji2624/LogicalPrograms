// Armstrong number is a number that the cube of the digits of the number is equal to that number. 

package NumbersLogicalPrograms;

import java.util.Scanner;

public class AmrstongNo {
      public static void main(String args[])
      {
    	  Scanner scan = new Scanner(System.in);
    	  System.out.println("Enter a Number : ");
    	  int n=scan.nextInt();
    	  scan.close();
    	  int temp=n; //153
    	  int r;
    	  int sum=0;
    	  while(n>0)
    	  {
    		  r=n%10;
    		  sum=sum+r*r*r; 
    		  n=n/10;
    	  }
    	  if(sum == temp)
    	  {
    		  System.out.println("Given Number is a Armstrong Number");
    	  }else {
    		  System.out.println("Given Number is NOT Armstrong number");
    	  }
      }
}
