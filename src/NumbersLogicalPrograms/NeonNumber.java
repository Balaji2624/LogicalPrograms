package NumbersLogicalPrograms;

import java.util.Scanner;

public class NeonNumber {
  
    public static void main(String arsg[])
    {
    	int n=9;
    	int square=n*n;
    	int r;
    	int sum=0;
    	while(n>0)
    	{
    		r=square % 10;
    		sum=sum+r;
    		square=square /10;
    	}
    	if(n == sum)
    	{
    		System.out.println("Given NUmber is Neon number");
    	}else {
    		System.out.println("Given number is NOT Neon number");
    	}
    }
}
