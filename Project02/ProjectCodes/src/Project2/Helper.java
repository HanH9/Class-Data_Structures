package Project2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Helper class for the driver program. 
 * @author H9
 * @version 1.0
 */
public class Helper {
	/**
	 * Tests the linked string.
	 */
	public static void start() throws FileNotFoundException, LinkedStringOutOfBoundsException
	{
		//test constructors
		System.out.println("Test constructors........");
		ArrayList<LinkedString> list = new ArrayList<>();
		create(list);
		display(list);
		System.out.println("The number of linked list:"+list.size());
		
		//test other methods
		System.out.println("\nTest other methods........");
		otherMethods(list);
		
	}
	
	/**
	 * Creat a arraylist which contents linked string and the data from file
	 * @param list A arraylist
	 * @throws FileNotFoundException File can't found
	 */
	public static void create(ArrayList<LinkedString> list) throws FileNotFoundException
	{
		LinkedString string;
		// test constructor
		Scanner input = new Scanner(new File("project2_data.txt"));
		while(input.hasNext())
		{
			string = new LinkedString(input.next());
			list.add(string);
	    }
		input.close();
		
		//test constructor with empty linked string
		list.add(new LinkedString());
		list.add(new LinkedString());
	}
	
	/**
	 * Displays linked strings in arraylist
	 * @param list A arraylist
	 */
	public static void display(ArrayList<LinkedString> list)
    {
        for (LinkedString linkedString : list)
        {
        	System.out.println(linkedString);
        }
    }
	
	/**
	 * Test other methods in linked string
	 * @param list A array list of linked string objects
	 * @throws LinkedStringOutOfBoundsException The index of linked list out of bounds
	 */
	public static void otherMethods(ArrayList<LinkedString> list) throws LinkedStringOutOfBoundsException
	{	
		//For evey linked string in arraylist,print isEmpty, charAt(0),length, substring(0,1), concat(predecessor)
		System.out.println("For every linked string in list:");
		System.out.println("isEmpty" + "  " + "index(0)" + "  " + "length" + "  " + "substring(0-1)" + "  " + "Concatenate");
		
		for(int i = 0;i < list.size();i++)
	    {		
				//For no empty linked string
			 	if(!(list.get(i).isEmpty()))
			 	{
		        	System.out.print(list.get(i).isEmpty() + "    "
		        + list.get(i).charAt(0) + "         "
		        + list.get(i).length() + "       " 
		        + list.get(i).substring(0, 1)+"               ");
		        	//For not the frist linked string
		        	if (i>0) 
		        	{
		        		System.out.println(list.get(i).concat(list.get(i-1)));
					}
		        	//For the frist linked string
		        	else 
		        	{
		        		System.out.println(list.get(i).concat(new LinkedString()));
					}
			 	}
			 	//for empty linked string
			 	else 
			 	{
			 		System.out.println(list.get(i).isEmpty() + "     "
					        + "          "
					        + list.get(i).length() + "       " 
					        + "                "
					        + list.get(i).concat(list.get(i-1)));
			 	}
	    }
	}
	
	
}
