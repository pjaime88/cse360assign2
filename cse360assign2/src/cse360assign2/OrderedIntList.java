package cse360assign2;
import java.util.*;


public class OrderedIntList {
	
	protected int[] listOfIntegers;  //Array of integers that will store all the numbers
	protected int numOfElemtsInList; //number of integers in the array
	
	
	/**
	 * Constructor
	 */
	OrderedIntList ()
	{
		listOfIntegers = new int[10];
	}
	
	
	/**
	 * This Method takes a new int value, and insert it into the list. 
	 */
	public void insertList(int intToInsertInList) 									//begin of insertList method
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
			int positionToInsert = 0; //This variable tell in which position to insert the new element
			boolean done = false;     //this variable tells us when a position available is found
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
	}																				//end of insertList method																				
	
	/**
	 * This method grows the List making it bigger as we add more elements to it.
	 */
	private void growList() 														//begin of growList method
	{
		int []newListOfIntegers = new int[numOfElemtsInList * 2];
		
		for (int index = 0; index < numOfElemtsInList; index++ )
		{
			newListOfIntegers[index] = listOfIntegers[index];
		}
		
		listOfIntegers = newListOfIntegers;
	}																				//end of growList method
	
	
	/**
	 * This method Prints on the screen all the numbers in the list
	 */
	public void printAllValues() 													//begin of printAllValues method
	{
		for (int index = 0; index < numOfElemtsInList; )
		{
			if (index % 5 == 0) 
				System.out.println();
			
			System.out.print(listOfIntegers[index++] + "\t");	
		}
		
		System.out.println();;
	} 								
}
