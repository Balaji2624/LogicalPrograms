package NumbersLogicalPrograms;

import java.util.Scanner;

public class FactorOfNumber {
	public static void Factor(int n)
	{
		for(int i=1;i<=n;i++)
    	{
    		if(n % i == 0)
    		{
    			System.out.println(i);
    		}
    	}
	}
    public static void main(String args[])
    {
    	Scanner scan= new Scanner(System.in);
    	System.out.println("Enter a Number : ");
    	int n =scan.nextInt();
    	scan.close();
    	Factor(n);
    }
}
