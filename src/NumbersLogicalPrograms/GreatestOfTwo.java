package NumbersLogicalPrograms;

import java.util.Scanner;

public class GreatestOfTwo {
      public static void GreatestNo(int a, int b)
      {
    	  if(a>b)
    	  {
    		  System.out.println(a+" is Grater than the Number "+b);
    	  }else {
    		  System.out.println(a+" is a Smaller than the number "+b);
    	  }
      }
//	public static void GreatestNo(int a, int b)
//	{
//		int c;
//		c=a>b ? a:b;
//		System.out.println("Gratest number from the given two number is : "+c);
//	}
      public static void main(String args[])
      {
    	  Scanner scan=new Scanner(System.in);
    	  System.out.println("Enter a Numbers : ");
    	  int a=scan.nextInt();
    	  int b=scan.nextInt();
    	  scan.close();
    	  
    	  GreatestNo(a,b);
      }
}
