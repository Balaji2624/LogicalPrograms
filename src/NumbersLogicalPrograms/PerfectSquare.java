package NumbersLogicalPrograms;

public class PerfectSquare {
	 public static boolean perfect(int n)
	 {
		 boolean isFound=false;
		 if(n<0)
		 {
			 isFound=false;
		 }
		 if(n == 0 || n == 1)
		 {
			 isFound=true;
		 }
		 for(int i=1;i*i<=n;i++)
		 {
			 if(i*i==n)
			 {
				 isFound=true;
			 }
			 
		 }
		 return isFound;
	 }
     public static void main(String args[])
     {
    	if(perfect(49))
    	{
    		System.out.println("Given number is perfect");
    	}else {
    		System.out.println("Given number is NOT Perfect number");
    	}
     }
}
