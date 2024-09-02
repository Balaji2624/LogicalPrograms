package NumbersLogicalPrograms;

import java.util.Scanner;

public class flipCoin {
     public static void main(String args[])
     {
    	 Scanner scan=new Scanner(System.in);
    	 System.out.println("enter a how many time to flip the coin : ");
    	 int coinFlip=scan.nextInt();
    	 scan.close();
    	 if(coinFlip <=0)
    	 {
    		 System.out.println("enter a valid input how many time to flip the coin in positive Integer");
    	 }
    	 double head=0;
    	 double tail=0;
    	 for(int i=1;i<=coinFlip;i++)
    	 {
    		 if(Math.random() < 0.5)
    		 {
    			 head++;
    		 }else {
    			 tail++;
    		 }
    	 }
    	 double headPercentage=(head / (double)coinFlip)*100;
    	 double tailPercentage=(tail / (double)coinFlip)*100;
    	 System.out.println("Head percentage : "+headPercentage);
    	 System.out.println("Tail percentage : "+tailPercentage);
     }
}
