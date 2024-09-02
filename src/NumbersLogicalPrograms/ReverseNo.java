package NumbersLogicalPrograms;

public class ReverseNo {
     public static void ReverseNumber(int n)
     {
    	 int temp=n;
    	 int r;
    	 int rev=0;
    	 while(n != 0)
    	 {
    		 r=n % 10;
    		 rev = (rev*10)+r;
    		 n=n/10;
    		 
    	 }
    	 System.out.println("Reverse number of the Given Number "+temp+" is : "+rev);
     }
     public static void main(String args[])
     {
    	 ReverseNumber(123);
     }
}
