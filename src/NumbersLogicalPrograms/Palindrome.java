// Palindrome Number is the Number when the Reverse that number is the same of that nnumber .

package NumbersLogicalPrograms;

public class Palindrome {
       public static void PalindromeNo(int n)
       {
    	   int temp=n;
    	   int sum=0;
    	   int r;
    	   while(n>0)
    	   {
    		   r= n % 10;
    		   sum = (sum*10)+r;
    		   n = n/10;
    	   }
    	   if(sum == temp)
    	   {
    		   System.out.println("Given Number is Palondrome Number");
    	   }else {
    		   System.out.println("Given Number is NOT palindrome Number");
    	   }
       }
       public static void main(String args[])
       {
    	   PalindromeNo(151);
       }
}
