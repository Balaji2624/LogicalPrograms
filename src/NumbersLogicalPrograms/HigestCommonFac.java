package NumbersLogicalPrograms;

import java.util.Scanner;

public class HigestCommonFac {
     public static int findHCF(int a,int b)
     {
    	 while(b != 0)
    	 {
    		int temp=b;
    		b=a%b;
    		a=temp;
    	 }
    	 return a;
     }
     public static void main(String args[])
     {
    	 Scanner scan=new Scanner(System.in);
    	 System.out.println("Enter a first Number : ");
    	 int a= scan.nextInt();
    	 System.out.println("Enter a Second Number : ");
    	 int b=scan.nextInt();
    	 System.out.println("Higest Common factor of the given two number is :  "+findHCF(a,b));
    	 scan.close();
    	 
     }
}
