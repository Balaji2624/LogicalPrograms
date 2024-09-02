package NumbersLogicalPrograms;

import java.util.Scanner;

public class GratestOfThree {
      public static void great(int a, int b,int c)
      {
    	  int x=a>b ? a:b;
    	  int y=b>c ? b:c;
    	  int z=x>y ? x : y;
    	  System.out.println("Greatest number from the given three numbers is : "+z);
      }
      public static void main(String args[])
      {
    	  Scanner scan = new Scanner(System.in);
    	  System.out.println("enter a three numbers : ");
    	  int a=scan.nextInt();
    	  int b=scan.nextInt();
    	  int c=scan.nextInt();
    	  scan.close();
    	  great(a,b,c);
      }
}
