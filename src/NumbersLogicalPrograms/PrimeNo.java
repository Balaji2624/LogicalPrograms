package NumbersLogicalPrograms;

import java.util.Scanner;

public class PrimeNo {
     public static boolean prime(int n)
     {
    	 boolean isPrime=true;
    	 for(int i=2;i<=n/2;i++)
    	 {
    		 if(n % i == 0)
    		 {
    			 isPrime=false;
    		 }
    	 }
    	 return isPrime;
     }
     public static void main(String args[])
     {
    	 Scanner scan=new Scanner(System.in);
    	 System.out.println("Enter a Number : ");
    	 int n= scan.nextInt();
    	 scan.close();
    	 if(prime(n))
    	 {
    		 System.out.println("Given Number is a Prime Number");
    	 }else {
    		 System.out.println("Given number is NOT Prime Number");
    	 }
     }
}
