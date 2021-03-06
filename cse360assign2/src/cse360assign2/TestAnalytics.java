/**
 * @author Paulo Jaime
 * PIN: 28
 * Assign #2 
 * CSE 360
 * TestAnalytics The class contains a main method 
 * and adequately test all methods in Analytics, both local and inherited
 */

package cse360assign2;

import java.util.Scanner;

public class TestAnalytics {
	

	
	public static void main (String[] args)
	   {
		
		boolean debugging = false;
		int debug;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter 1 if you want to debug or 0 if not: ");
		debug = scan.nextInt();
		
		if (debug == 1)
			debugging = true;
		
		if (debug == 0)
			debugging = false;
		
		Analytics Analytics = new Analytics(debugging);
		
		try
		{
			do{
				System.out.println("Please Enter an Integer ");
				
				int num = scan.nextInt();
				
				Analytics.insertList(num);
			}
			while(scan.hasNextInt()== true);
		}
		catch(java.util.InputMismatchException a)
		{
			
		}
		
		//calling the printAllValues
		Analytics.printAllValues();
		
		//printing the Mean Value
		System.out.println("\nMean Value: "+ Analytics.mean());
		
		//printing the Median Value
		System.out.println("\nMedian Value: "+ Analytics.median());
		
		//printing the High Value
		System.out.println("\nHigh Value: "+ Analytics.high());
		
		//printing the Low Value
		System.out.println("\nLow Value: "+ Analytics.low());
		
		//printing the The number of integers in the list
		System.out.println("\nThe number of integers in the list is: "+ Analytics.numInts()) ;
		
	   }
}
