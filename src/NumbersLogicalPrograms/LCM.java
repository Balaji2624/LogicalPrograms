package NumbersLogicalPrograms;

public class LCM {
     static int findHCF(int a , int b)
     {
    	 while(b != 0)
    	 {
    		 int temp=b;//a=12, b=60 ----temp=60
    		 b=a%b;//b=12%60 =0
    		 a=temp;//a=60
    	 }
    	 return a;
     }
     static int findLCM(int a, int b)
     {
    	 int hcf=findHCF(a,b);
    	 return (a*b)/hcf;
     }
     public static void main(String args[])
     {
    	 System.out.println("LCM of  the given two number : "+findLCM(48,18));
    	 
     }
}
