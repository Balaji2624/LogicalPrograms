package NumbersLogicalPrograms;

import java.util.Scanner;

public class LeapYearOrNot {
       public static boolean Leap(int year)
       {
    	   boolean isLeap=false;
    	   if(year % 4 == 0)
    	   {
    		   if(year % 100 == 0)
    		   {
    			   if(year % 400 == 0)
    			   {
    				   isLeap=true;
    			   }else {
    				   isLeap=false;
    			   }
    						   
    		   }else {
    			   isLeap=true;
    		   }
    	   }else {
    		   isLeap=false;
    	   }
    	   return isLeap;
       }
       public static void main(String args[])
       {
    	   Scanner scan=new Scanner(System.in);
    	   System.out.println("Enter a Year : ");
    	   int year=scan.nextInt();
    	   scan.close();
    	   if(Leap(year))
    	   {
    		   System.out.println("Given Year is Leap year");
    	   }else {
    		   System.out.println("Given Year is NOT Leap Year");
    	   }
       }
}
