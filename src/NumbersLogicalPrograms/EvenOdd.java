package NumbersLogicalPrograms;

public class EvenOdd {
      public static void check(int n)
      {
    	  if(n % 2 == 0)
    	  {
    		  System.out.println("Given NUmber is Even Number");
    	  }else {
    		  System.out.println("Given number is Odd number");
    	  }
      }
      public void printNo()
      {
    	  System.out.println("Even Number : ");
    	  for(int i=1;i<=20;i++)
    	  {
    		  if(i % 2 == 0)
    		  {
    			  System.out.println(i);
    		  }
    	  }
    	  System.out.println("Odd Numbers : ");
    	  for(int i=1;i<=20;i++)
    	  {
    		  if(i % 2 != 0)
    		  {
    			  System.out.println(i);
    		  }
    	  }
      }
      public static void main(String args[])
      {
    	  check(20);
    	  EvenOdd e=new EvenOdd();
    	  e.printNo();
      }
}
