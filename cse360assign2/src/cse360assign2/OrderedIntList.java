/**
 * @author Paulo Jaime
 * PIN# 28
 * CSE 360
 * Assignment 2 
 * OrderedIntList is a class with three methods, insertIntoList, doubleSizeOfArray and printAllValuesInList.
 * The goal of this class is to insert Integers into an array an then put then in ascending order
 */
package cse360assign2;
import java.util.*;


public class OrderedIntList {
	
	protected int[] listOfIntegers;  
	protected int numOfElemtsInList; 
    protected boolean debug = false;
	
	
	/**
	 * OrderedIntList Constructor
	 */
	public OrderedIntList (boolean debugger)
	{
		listOfIntegers = new int[10];
		debug = debugger;
	}
		
	
	/** insertList Method
	 * This method takes in an integer, and inserts it in the listOfIntegers
	 * @param intToInsertInList is an integer that is to be inserted into listOfIntegers
	 */
	public void insertList(int intToInsertInList) 									
	{
		if(numOfElemtsInList == listOfIntegers.length) 
		{
			growList();
		}
		
		if(numOfElemtsInList == 0)
		{
			listOfIntegers[0] = intToInsertInList;
			numOfElemtsInList++;
		}
		
		else {
			int positionToInsert = 0; 
			boolean done = false;     
			int count = 0;
			
			while (!done && count < numOfElemtsInList)
			{
				if (intToInsertInList < listOfIntegers[count])
				{
					done = true;
				}
				
				else
				{
					count++;
					positionToInsert++;
				}	
			}
			
			for (int index = numOfElemtsInList; index > positionToInsert; index--) 
			{
				listOfIntegers[index] = listOfIntegers[index - 1];
			}
			
			listOfIntegers[positionToInsert] = intToInsertInList; 
			numOfElemtsInList++;
		
		}
		
		//debugging
		if (debug == true)
		{
			System.out.println("debug - insertList function ");
			System.out.println("debug - Number Of Elements In the List: " + numOfElemtsInList);
			System.out.print("debug - Array of Numbers is:");
			
			for (int index = 0; index < numOfElemtsInList; index++)
			{
				System.out.print(" "+ listOfIntegers[index]); 
			}
			System.out.println();
		}
	}		
	
	
	/** growList Method
	 * Doubles the size of the listOfIntegers array and then copies it to a new array
	 */
	private void growList() 														
	{
		int []newListOfIntegers = new int[numOfElemtsInList * 2];
		
		for (int index = 0; index < numOfElemtsInList; index++ )
		{
			newListOfIntegers[index] = listOfIntegers[index];
		}
		
		//debugging
		if (debug == true)
		{
			System.out.println("debug - growList function ");
			System.out.println("debug - Number Of Elements In the List: " + numOfElemtsInList);
			System.out.print("debug - The New List of Numbers is:");
			
			for (int index = 0; index < numOfElemtsInList; index++)
			{
				System.out.print(" "+ listOfIntegers[index]); 
			}
			System.out.println();
		}
		
		listOfIntegers = newListOfIntegers;
	}																				
	
	
	/** printAllValues method
	 * This method Prints on the screen all the numbers in the list
	 */
	public void printAllValues() 													
	{
		//debugging
		if (debug == true)
		{
			System.out.println("debug - printAllValues function ");
			System.out.println("debug - Number Of Elements In the List: " + numOfElemtsInList);
			System.out.print("debug - The Numbers in the listOfIntegers of Numbers are:");
			
			for (int index = 0; index < numOfElemtsInList; index++)
			{
				System.out.print(" "+ listOfIntegers[index]); 
			}
			System.out.println();
		}		
		
		
		for (int index = 0; index < numOfElemtsInList; )
		{
			if (index % 5 == 0) 
				System.out.println();
			
			System.out.print(listOfIntegers[index++] + "\t");	
		}
		
		System.out.println();;
	} 								
}
