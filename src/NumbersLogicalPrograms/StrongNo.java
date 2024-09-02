package NumbersLogicalPrograms;

import java.util.Scanner;

public class StrongNo {
     public static int fact(int n)
     {
    	 int factorial=1;
    	 for(int i=1;i<=n;i++)
    	 {
    		 factorial=factorial*i;
    		 
    	 }
    	 return factorial;
     }
     public static boolean strongNum(int n)
     {
    	 int temp=n;
    	 int sum=0;
    	 int r;
    	 while(n>0)
    	 {
    		 r=n%10;
    		 sum=sum+fact(r);
    		 n=n/10;
    	 }
    	 return sum == temp;  
     }
     public static void main(String args[])
     {
    	 Scanner scan = new Scanner(System.in);
    	 System.out.println("Enter a Number : ");
    	 int a=scan.nextInt();
    	 scan.close();
    	 if(strongNum(a))
    	 {
    		 System.out.println("Given Number is a Strong Number");
    	 }else {
    		 System.out.println("Given number is a NOT a Strong number");
    	 }
     }
}
