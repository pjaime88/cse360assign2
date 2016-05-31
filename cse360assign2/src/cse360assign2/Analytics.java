/**
 * @author Paulo Jaime
 * PIN: 28
 * Assign #2 
 * CSE 360
 * Analytics is a child class of OrderedIntlist with 5 methods: mean, median, high, low, and numInt
 */

package cse360assign2;
import java.util.Comparator;
import java.util.Scanner;

public class Analytics extends OrderedIntList{
	
	protected double intMean;
	protected int intMedian;
	protected int intHigh;
	protected int intLow;
	protected int intNumInts;
	
	//private boolean debug = false;
	
	/** Analytics() constructor
	 * This constructor initializes the debug variable to true or false
	 * it also sets intMean = 0, intMedian = 0, intHigh = 0, intLow = 0, and intNumInts = 0;
	 * @param debuging
	 * is a parameter that sets debugging to true or false
	 */
	public Analytics(boolean debuging)
	{
		super(debuging);
		intMean = 0;
		intMedian = 0;
		intHigh = 0;
		intLow = 0;
		intNumInts = 0;
	}
	
	
	/** Mean() Method
	 * This method adds up all the values in listOfIntegers and divides that number by 
	 * the total number of integers in the listOfIntegers
	 * @return
	 * In case the listOfIntegers is empty, it returns '-1'
	 */
	public double mean() 
	{
		double sum = 0;
		
		//debugging
		if (debug == true)
		{
			System.out.println("debug - mean function ");
			System.out.println("debug - Number Of Elements In the List: " + numOfElemtsInList);
			System.out.println("debug - At this Point sum should be Zero: " + sum);
		}
		
		if (numOfElemtsInList == 0)
		{	
			//debugging
			if(debug == true)
			{
				System.out.println("debug - Number Of Elements In the List: " + numOfElemtsInList);
				System.out.println("debug - if there is no Number In the List, should return '-1'");
			}
			
			intMean = -1;
		}

		else
		{
			for(int index = 0; index < numOfElemtsInList ; index++)
			{
				sum = sum + listOfIntegers[index];
				
				//debugging
				if(debug == true)
				{
					System.out.println("debug - Sum = " + sum  );
				}
			}
			
			intMean = sum / numOfElemtsInList;
		}
		
		return intMean;
	}
	
	
	
	/** Median() Method
	 * This method  returns the median in the listOfIntegers
	 * @return
	 * In case the listOfIntegers is empty, it returns '-1'
	 * In case the listOfIntegers has an odd number of elements, it returns the middle number in the list
	 * In case the listOfIntegers has an even number of elements, it returns the mean of the middle elements
	 */
	public int median() 
	{	
		intMedian = 0;
		
		//debugging
		if(debug== true)
		{
			System.out.println("\ndebug - The Median function ");
			System.out.println("debug - Median Should be Zero: " + intMedian);
			System.out.println("debug - Number Of Elements In the List: " + numOfElemtsInList);
		}

		
		if (numOfElemtsInList == 0)
		{
			intMedian = -1;
			
			//debugging
			if(debug== true)
			{
				System.out.println("debug - Number Of Elements In the List is: " + numOfElemtsInList);
				System.out.println("debug - The Median should be '-1': " + intMedian);
			}
		}
		
		else
		{
			if(numOfElemtsInList % 2 == 1)
			{
				intMedian = listOfIntegers[(numOfElemtsInList)/2];
				
				//debugging
				if(debug== true)
				{
					System.out.println("debug - Number Of Elements In the List is an odd number");
					System.out.println("debug - Median: " + intMedian);
					
				}
			}
				
			else
			{
				intMedian = (listOfIntegers[numOfElemtsInList / 2] + listOfIntegers[(numOfElemtsInList / 2) - 1]) / 2;
			    
				//debugging
				if(debug== true)
				{
					System.out.println("debug - Number Of Elements In the List is an even number");
					System.out.println("debug - Median: " + intMedian);	
				}
			}
		}
		
		return intMedian;
	}
	
	
	/** High() Method
	 * This method finds the largest number in the listOfIntegers
	 * @return
	 * In case the list is empty it returns '-1'
	 * In case the list has at least one element it returns the last element in the listOfIntegers 
	 */
	public int high()
	{	
		//debugging
		if(debug== true)
		{
			System.out.println("\ndebug - Debugging The High function");
			
			try{
				System.out.println("debug - Last Number in the listOfIntegers: " + listOfIntegers[numOfElemtsInList - 1]);
			}
			catch(java.lang.ArrayIndexOutOfBoundsException e)
			{
				System.out.println("debug - The listOfIntegers is empty, High should be '-1'");
			}
			
			
		}
		
		if (numOfElemtsInList == 0)
		{
			intHigh = -1;
			
			//debugging
			if(debug == true)
			{
				System.out.println("debug - Number Of Elements In the List is '0'");
				System.out.println("debug - High should be '-1': " + intHigh);
			}
		}
		else
		{
			intHigh = listOfIntegers[numOfElemtsInList - 1]; 
			
			//debugging
			if(debug == true)
			{
				System.out.println("debug - Number Of Elements In the List is more than '0'");
				System.out.println("debug - High() should not return '-1': " + intHigh);
			}
		}
		return intHigh;
	}
	
	
	/** Low() Method
	 * This method  finds the smallest number in the listOfIntegers
	 * @return
	 * In case the list is empty it returns '-1'
	 * In case the list has at least one element it returns the first element in the listOfIntegers 
	 */
	public int low() 
	{
		//debugging
		if(debug == true)
		{
			System.out.println("debug - Low() Function");
		}
		
		if (numOfElemtsInList == 0)
		{
			intLow = -1;
			
			//debugging
			if(debug == true)
			{
				System.out.println("debug - The listOfIntegers is empty ");
				System.out.println("debug - Low() should return '-1': " + intLow);
			}
		}
		
		else
		{
			intLow = listOfIntegers[0];
			
			//debugging
			if(debug== true)
			{
				System.out.println("debug - The listOfIntegers is NOT empty ");
				System.out.println("debug - Low() should return the the first element in the listOfIntegers: " + listOfIntegers[0]);
			}
		}
		
		return intLow;
	}
	
	
	/** numInt() Method
	 * This a method finds the number of integers in the listOfIntegers
	 * @return
	 * In case the list is empty it returns '-1'
	 */
	public int numInts() 
	{
		intNumInts = 0;
		
		for(int index = 0; index < numOfElemtsInList ; index++)
		{
			if(listOfIntegers[index] % 1 == 0)
			{
				intNumInts++;
			}	
		}
		
		//debugging
		if(debug == true)
		{
			System.out.println("\ndebug - numInts Function");
			System.out.println("debug - At this Point numInt should be: " + intNumInts);
		}
		
		return intNumInts;
	}
}
