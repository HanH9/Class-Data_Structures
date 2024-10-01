package Lab4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
/**
* Program for lab4
* @author H9
* @version 1.0
*/
public class lab4 
{
	/**
	* Create an array list and use it to store a list of Integer objects.
	* Create an iterator over the elements of the array list.
	* Iterate through the list, print each object. Optionally, you can remove the object after it is printed.
	* Check the size of the array list. If no objects were removed, the size should remain the same. Otherwise, the size should be changed.
	* @param array The array to store integers
	*/
	public static void main(String[] args)
	{
		List<Integer> list = new ArrayList<>();
	 
		// use random to generate integer
		Random random = new Random();
	 
		// Add ten random integers into the array list.
		for(int i = 0; i < 10;i++)
		{
			list.add(random.nextInt(100));
		}
	 
		// Get the iterator of the array list.
		Iterator<Integer> iterator = list.iterator();
	 
		// Iterate the list and display the elements.
		while (iterator.hasNext())
		{
			System.out.println(iterator.next());
			// The most recently returned element from next call is removed. 
			iterator.remove();
		}
	 
		//No more elements. 
		System.out.println("If has the next item:" + iterator.hasNext());
	 
		//The size of the array list is 0 if remove is called. 
		System.out.println("The size of array is:" + list.size());
	}
}