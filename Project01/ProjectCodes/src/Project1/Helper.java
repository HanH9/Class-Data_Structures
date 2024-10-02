package Project1;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * Helper class for the driver program. 
 * @author H9
 * @version 1.0
 */
public class Helper {
	/**
	 * Tests the reference-based linked list.
	 */
	public static void start() throws FileNotFoundException{
		//Create a bag
		Bag bag = new Bag();

		//Add goods into bag
		create(bag);

	    //Display the bag
		displayList(bag);
		
		//Test insert()
		testInsert(bag);
		displayList(bag);
		
		//Test removeLast()
		testRemoveLast(bag);
		displayList(bag);
		
		//Test removeRandom()
		testRemoveRandom(bag);
		displayList(bag);
		
		//Test get()
		testGetIndex(bag);
		
		//Test get()
		testGetItem(bag);
		
		//Test size(), isEmpty(), makeEmpty()
		testOthers(bag);
	}


	/**
	 * Creates a bag of charges.
	 * @param bag A reference to a bag of data
	 */
	private static void create(Bag bag) throws FileNotFoundException{
		Scanner input = new Scanner(new File("src/Project1/data.txt"));
		while(input.hasNext()){
			bag.insert(input.next()); 
	    }
		input.close();
	}
	
	/**
	 * Displays data in order. 
	 * @param bag A reference to a bag of data
	 */
	private static void displayList(Bag bag){
	   for(int i = 0; i < bag.size(); i++){
		   System.out.println(bag.get(i));
	   }
	}

	/**
	 * Test insert()
	 * @param bag reference of bag
	 */
	private static void testInsert(Bag bag)
	{
		System.out.println("\nTest insert()......");
		bag.insert("Humburger");
	}
	
	/**
	 * Test removeLast()
	 * @param bag reference of bag
	 */
	private static void testRemoveLast(Bag bag)
	{
		System.out.println("\nTest removeLast()......");
		bag.removeLast();
	}
	
	/**
	 * Test removeRandom()
	 * @param bag reference of bag
	 */
	private static void testRemoveRandom(Bag bag)
	{
		System.out.println("\nTest reomveRandom() (index 1) ......");
		bag.removeRandom(1);
	}

	/**
	 * Test get() (index)
	 * @param bag reference of bag
	 */
	private static void testGetIndex(Bag bag)
	{
		System.out.println("\nTest get index of element ......");
		System.out.printf("Apple:%d\n", bag.get("Apple"));
	}

	/**
	 * Test get() (item)
	 * @param bag reference of bag
	 */
	private static void testGetItem(Bag bag)
	{
		System.out.println("\nTest get element at position index ......");
		System.out.printf("Index 0:%s\n", bag.get(0));
	}

	/**
	 * Test size(), isEmpty(), makeEmpty()
	 * @param bag reference of bag
	 */
	private static void testOthers(Bag bag)
	{
		System.out.println("\nTest size(), isEmpty(), makeEmpty() ......");
		System.out.printf("The size of bag is %d\n", bag.size());
		bag.makeEmpty();
		System.out.println("After making the bag empty......");
		System.out.printf("The size of bag is %d\n", bag.size());
		System.out.printf("If the bag is empty:" + bag.isEmpty());
	}
}
