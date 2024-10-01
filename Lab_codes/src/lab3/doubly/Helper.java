package lab3.doubly;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * Helper class for the driver program. 
 * @author Qi Wang
 * @version 1.0
 */
public class Helper {
	/**
	 * Tests the reference-based linked list.
	 */
	public static void start() throws FileNotFoundException{
		DoubleList list = new DoubleList();
	   //Create a list
		fillList(list);

	   //Display a list
		displayList(list);
	
		//Remove first data
		System.out.println("\nfinding ...");
		System.out.println(list.find(2).getElement());
		
		System.out.println("\nTest double link...");
		System.out.println(list.find(1).getPrevious().getElement());
		
		System.out.println("\nTest adding...");
		list.add(1, "$888");
		displayList(list);
		
		/*//Remove all of the data
		list.removeAll();
		displayList(list);*/
		System.out.println("\nTest size method...");
		System.out.println(list.size());
	}
	
	/**
	 * Creates a list of charges.
	 * @param list A reference to a list of data
	 */
	private static void fillList(DoubleList list) throws FileNotFoundException{
		Scanner input = new Scanner(new File("F:/HHH/数据结构2022/Lab/src/lab3/doubly/datalist.txt"));
		//$4.50 $23.56 $2000.98 $0.34
		int i = 0;
		while(input.hasNext()){
			list.add(i,input.next()); 
			i++;
	    }
		input.close();
	}
	
	/**
	 * Displays data in order. 
	 * @param list A reference to a list of data
	 */
	private static void displayList(DoubleList list){
	   for(int i = 0; i < list.size(); i++){
		   System.out.println(list.get(i));
	   }
	}

}
