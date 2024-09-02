package NumbersLogicalPrograms;

public class Fibonocci {
     public static void fibonocci(int n)
     {
    	 int a=0;
    	 int b=1;
    	 System.out.print(a+" "+b+" ");
    	 for(int i=1;i<=n;i++)
    	 {
    		 int c=a+b;
    		 System.out.print(c+" ");
    		 a=b;
    		 b=c;
    	 }
    	 
     }
     public static void main(String args[])
     {
    	 int n=4;
    	 fibonocci(n);
     }
}
