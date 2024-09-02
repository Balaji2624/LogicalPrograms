package NumbersLogicalPrograms;

import java.util.Scanner;

public class CheckNumbers {
	public static void check(int n)
	{
		if(n>0)
		{
			System.out.println(n+" is a  Positive Number");
		}else {
			System.out.println(n+" is a Negative Number");
		}
	}
	
     public static void main(String args[])
     {
    	 Scanner scan=new Scanner(System.in);
    	 System.out.println("Enter a Number : ");
    	 int no=scan.nextInt();
    	 scan.close();
    	 check(no);
     }
}
