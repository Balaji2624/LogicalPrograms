// Calulate the sum of the first N Natural Numbers

package NumbersLogicalPrograms;

public class SumofFirstN {
       public static void sum(int n)
       {
    	   int sum=0;
    	   for(int i=1;i<=n;i++)
    	   {
    		   sum=sum+i;
    	   }
    	   System.out.println("Total of the first N Natural number is : "+sum);
       }
       public static void main(String args[])
       {
    	   sum(10);
       }
}
