// Name: Madison Brandt
// StudentID:193
//Assignment 2
// Description: SimpleList implements a list. Integers can be added, removed, searched, 
//and the elements in the list can be counted or returned.   

 import java.util.*;

 public class SimpleList
 {
 	
 	int[] list;
 	int count;
 	
 	// create an array to hold 10 integers and set count to 0
 	public SimpleList()
 	{
 		list = new int[10];
 		count = 0;
 	}
 	
 // Add parameter to the list at the beginning and move all other integers over
 	public void add(int addNewNumber)
 	{
		
		if (count == list.length - 1) 
		{
			int[] newList = new int [(int) (list.length * 1.5)];
			for(int i = 0; i < list.length; i++) 
			{
				newList[i] = list[i];
			}
			list = newList;
			
		}
		
		for(int i = list.length - 1; i > 0; i--) 
		{
			list[i] = list[i - 1];
		}
		list[0] = addNewNumber;
		count ++;
 	}
	
 	// If a given parameter is in the list, then remove it and shift others
 	public void remove(int removeNumber)
 	{
 		int index = search(removeNumber);
	
 		if(index != -1) 
 		{
 			//shift elements to the left
 			for(int i = index; i < list.length - 1; i++) 
 			{
 				list[i] = list[i + 1];
 			}
 			list[list.length - 1] = 0;
 			count = count - 1;
 		}
 		if (count < (int) (list.length * 0.75) ) 
 		{
 			int[] newList = new int [count + 1];
 			for(int i = 0; i < count; i++) 
 			{
 				newList[i] = list[i];
 			}
 			list = newList;}	
 		}
	
 	//returns the number of integers in the list
 	public int count() 
 	{
 		return count;		
 	}

 	//append an integer to the list
 	public void append(int number) 
 	{
 		if(count == list.length - 1) 
 		{		
 			int size = (int)Math.floor(list.length * 1.5);
 			int temp[] = new int[size];
		
 			for (int i = 0; i < list.length; i++)
 			{
 				temp[i] = list[i];
 			}
		   list = temp;
 		}
 		list[count] = number;
 		count++;
 	}

 	//returns the string
 	public String toString()
 	{
 		String string = "";
		
 		if(count != 0) 
 		{
			
 			for(int i = 0; i < count; i++) 
 			{
 				string = string + list[i];

 				if(i < count - 1) 
 				{
 					string = string + " ";
 				}
 			}
 		}
 		return string;
 	}

 	//finds the first time a number appears in the list
 	public int search(int number)
 	{
 		for(int i = 0; i < count; i++)
 		{
	 		if(list[i] == number) 
		{
			return i;
		}
	}
	return -1;
	}
 	//return the first element of the list
 	public int first()
 	{
 		return list[0];
 	}
	
 	//return the last element of the list
 	public int last()
 	{
 		return list[count - 1];
 	}
	
 	//returns the size of the string
 	public int size() 
 	{
 		return list.length;
	} 
}