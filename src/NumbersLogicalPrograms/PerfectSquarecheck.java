package NumbersLogicalPrograms;

public class PerfectSquarecheck {
    public static boolean perfectSquare(int n)
    {
    	boolean isFound=false;
    	if(n<0)
    	{
    		isFound = false;
    	}
    	if( n == 0 || n == 1)
    	{
    		isFound=true;
    	}
    	int i=1;
    	while(i*i <= n)
    	{
    		if(i*i == n)
    		{
    			isFound=true;
    		}
    		i++;
    	}
    	return isFound;
    }
    public static void main(String args[])
    {
    	if(perfectSquare(49))
    	{
    		System.out.println("Given number is a perfect number");
    	}else {
    		System.out.println("Given Number is NOT perfect number");
    	}
    }
}
