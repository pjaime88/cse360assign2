package cse360assign2;
import java.util.Comparator;
import java.util.Scanner;

public class Analytics extends OrderedIntList{
	
	protected double intMean;
	protected int intMedian;
	protected int intHigh;
	protected int intLow;
	protected int intNumInts;
	
	public Analytics()
	{
		intMean = 0;
		intMedian = 0;
		intHigh = 0;
		intLow = 0;
		intNumInts = 0;
	}
	
	public double mean() 
	{
		if (numOfElemtsInList == 0)
		{
			intMean = -1;
		}
		else
		{
			double sum = 0;
			for(int index = 0; index < numOfElemtsInList ; index++)
			{
				sum = sum + listOfIntegers[index];
			}
			intMean = sum / numOfElemtsInList;
		}
		
		return intMean;
	}
	
	public int median() 
	{	
		if (numOfElemtsInList == 0)
		{
			intMedian = -1;
		}
		else
		{
			if(numOfElemtsInList % 2 == 1)
				intMedian = listOfIntegers[(numOfElemtsInList)/2];
			else
				intMedian = (listOfIntegers[numOfElemtsInList/2]+listOfIntegers[(numOfElemtsInList/2)-1])/2;
				
		}
		return intMedian;
		
	}
	
	
	public int high()
	{	
		
		if (numOfElemtsInList == 0)
		{
			intHigh = -1;
		}
		else
		{
			intHigh = listOfIntegers[0];
			
			for(int index = 0; index < numOfElemtsInList ; index++)
			{
				if(listOfIntegers[index]>intHigh)
					intHigh = listOfIntegers[index];
			}
		}
		return intHigh;
	}
	
	
	public int low() 
	{
		if (numOfElemtsInList == 0)
		{
			intLow = -1;
		}
		else
		{
			intLow = listOfIntegers[0];
			
			for(int index = 0; index < numOfElemtsInList ; index++)
			{
				if(listOfIntegers[index] < intLow)
				{
					intLow = listOfIntegers[index];
				}
					
			}
		}
		
		return intLow;
	}
	
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
		return intNumInts;
	}
}
