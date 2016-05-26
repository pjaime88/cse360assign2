package cse360assign2;

import java.util.Scanner;

public class TestAnalytics {
	
	public static void main (String[] args)
	   {
		
		OrderedIntList OrderedIntList = new OrderedIntList();
		
		Analytics Analytics = new Analytics();
		
		Scanner scan = new Scanner(System.in);
		
		do{
			System.out.println("Please Enter an Integer");
			
			int num = scan.nextInt();
			
			Analytics.insertList(num);
		}
		while(scan.hasNextInt()== true);
		
		
		Analytics.printAllValues();
		
		System.out.println("Mean Value: "+ Analytics.mean());
		
		System.out.println("Median Value: "+ Analytics.median());
		
		System.out.println("High Value: "+ Analytics.high());
		
		System.out.println("Low Value: "+ Analytics.low());
		
		System.out.println("The number of integers in the list is: "+ Analytics.numInts()) ;
		
	   }
}
