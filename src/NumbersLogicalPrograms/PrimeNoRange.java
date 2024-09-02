package NumbersLogicalPrograms;

public class PrimeNoRange {
     public static boolean prime(int n)
     {
    	 boolean isPrime=true;
    	 if(n <= 1)
    	 {
    		 isPrime=false;
    	 }
    	 for(int i=2;i<n;i++)
    	 {
    		 if(n % i == 0)
    		 {
    			 isPrime= false;
    			 break;
    		 }
    	 }
    	 return isPrime;
     }
     public static void main(String args[])
     {
    	 int a=10;
    	 int b=20;
    	 System.out.println("Prime Number in given Range are : ");
    	 for(int i=a;i<=b;i++)
    	 {
    		 if(prime(i))
    		 {
    			 System.out.println(i);
    		 }
    	 }
     }
}
