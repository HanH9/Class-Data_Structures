package Project3;

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
	 * Tests the Expression
	 */
	public static void start() throws FileNotFoundException
	{
		// Test with examples
		System.out.println("Test with examples........");
		
		// Create an empty array list that will be used to store a list of Expression objects.
		ArrayList<Expression> expressions = new ArrayList<>();
		
		// Call create method with a reference to the list so that create will add expression objects into the list.
		create(expressions);
		
		// Call display method with a reference to the list so that display will print the list of expression objects
		display(expressions);
		
		// Test other methods
		System.out.println("\nTest other methods........");
		otherMethods(expressions);
		
	}
	
	/**
	 * Add expression objects into a arraylist
	 * @param list A arraylist to store expressions
	 * @throws FileNotFoundException File can't found
	 */
	public static void create(ArrayList<Expression> list) throws FileNotFoundException
	{
		Scanner input = new Scanner(new File("project3_data.txt"));
		// Read the next line from the input file as a string, create an expression and add it to the list.
		while(input.hasNextLine())
		{
			list.add(new Expression(input.nextLine()));
	    }
		input.close();
	}
	
	/**
	 * Print the list of expressions as infix, postfix and the value of expression.
	 * @param expressions A arraylist storing expressions
	 */
	public static void display(ArrayList<Expression> expressions)
    {
		// Print expressions as infix, postfix and the value of expressions
        for (Expression expression : expressions)
        {
        	System.out.println(expression);
        }
    }

	/**
	 * Test other methods such as equals(Object)
	 * @param expressions A arraylist storing expressions
	 */
	public static void otherMethods(ArrayList<Expression> expressions)
	{
		System.out.println("\nTest equals method:");
		System.out.println("If 2*((3+4)+5) equals to 22 * ((3 + 4) + 5):" + expressions.get(0).equals(expressions.get(6)));
		
		System.out.println("\nUsing (3+2  )*5/ (1+4) to test convertion and calculation separately:");
		Expression temp = new Expression("(3+2  )*5/ (1+4)");
		System.out.println("Convertion:"+ temp.toPostfix());
		System.out.println("Calculation:"+ temp.getValue());
		
		System.out.println("\nTest methods in class GenericStack:");
		StackDriver.testStack();
		
	}
}
