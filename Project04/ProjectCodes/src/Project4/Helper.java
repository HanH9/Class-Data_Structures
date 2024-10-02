package Project4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Helper class for the driver program. 
 * @author H9
 * @version 1.0
 */
public class Helper {
	/**
	 * Tests the ClassSection, BST and DataBase
	 */
	public static void start() throws FileNotFoundException
	{
		DataBase dataBase = new DataBase();
		LinkedList <ClassSection> list = new LinkedList<ClassSection>();
		
		create(list);
		
		System.out.println("Display list:");
		display(list);
		
		System.out.println("\nTest other methods:");
		otherMethods(list, dataBase);
	}
	
	/**
	 * Pass list to create that fills list with class sections
	 * @param list A linklist that store class sections
	 * @throws FileNotFoundException File can't found
	 */
	public static void create(LinkedList <ClassSection> list) throws FileNotFoundException
	{
		Scanner input = new Scanner(new File("project4_data.txt"));
		while(input.hasNext())
		{
			ClassSection classSection = new ClassSection();
			input.useDelimiter(" ");
			classSection.setClassNumber(input.next());
			classSection.setSubject(input.next());
			classSection.setCatalogNumber(input.next());
			// Use double spaces to distinguish between two strings
			input.useDelimiter("  ");
			// Ignore the next specified delimiter " "
			input.findInLine(" ");
			classSection.setTitle(input.next());
			// Ignore the next specified delimiter-"  "
			input.findInLine("  ");
			classSection.setLevel(input.nextLine());
			list.add(classSection);
	    }
		input.close();
	}
	
	/**
	 * Pass list to display that prints the class sections in list
	 * @param expressions A linklist that store class sections
	 */
	public static void display(LinkedList <ClassSection> list)
    {
		// Print class sections
        for (ClassSection classSection : list)
        {
        	System.out.println(classSection);
        }
    }

	/**
	 * Test other methods such as equals(Object)
	 * @param expressions A linklist that store class sections
	 * @param databasae A database that store class sections in a BST
	 */
	public static void otherMethods(LinkedList <ClassSection> list, DataBase dataBase)
	{
		System.out.println("\nDatabase in inorder:");
		// add class to database
        for (ClassSection classSection : list)
        {
        	dataBase.insert(classSection);
        }
        // sort database
        LinkedList <TreeNode<ClassSection>> newList = dataBase.sortInorder();
        for (TreeNode<ClassSection> treeNode : newList)
        {
        	System.out.println(treeNode.getElement());
        }
        
        // test getNumber()
        System.out.println("\nThe number of the class sections:");
        System.out.println(dataBase.getNumber());
        
        // test makeEmpty(), isEmpty()
        System.out.println("\nMake the database empty:");
        dataBase.makeEmpty();
        System.out.println("Is empty: " + dataBase.isEmpty());
	}
}
