package NumbersLogicalPrograms;

public class ArmstrongNoRange {
       public static boolean Armstrong(int n)
       {
    	   int temp=n;
    	   boolean isPresent=false;
    	   int sum=0;
    	   int r;
    	   while(n>0)
    	   {
    		   r=n % 10;
    		   sum = sum+r*r*r;
    		   n = n/10;
    	   }
    	   if(sum == temp)
    	   {
    		   isPresent=true;
    	   }else {
    		   isPresent=false;
    	   }
    	   return isPresent;
       }
       public static void main(String args[])
       {
    	   for(int i=10;i<=1000;i++)
    	   {
    		   if(Armstrong(i))
    		   {
    			   System.out.println(i);
    		   }
    	   }
       }
}
