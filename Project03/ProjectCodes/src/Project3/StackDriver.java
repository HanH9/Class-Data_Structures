package Project3;

/**
 * Driver class for the GenericStack class. 
 * @author H9
 * @version 1.0
 */
public class StackDriver {
	
	/**
	 * Test methods of stack
	 */
	public static void testStack() {
		// a instance of GenericStack to test
		GenericStack<String> tempGenericStack = new GenericStack<>();
		
		System.out.print("After pushing Apple,Banana:");
		tempGenericStack.push("Apple");
		tempGenericStack.push("Banana");
		System.out.println("size¡ª¡ª"+tempGenericStack.size());
		
		System.out.println("Test pop():");
		System.out.println("Pop:"+tempGenericStack.pop());
		
		System.out.println("Test peek():");
		System.out.println("Peek:"+tempGenericStack.peek());
		
		System.out.print("Test popAll():");
		tempGenericStack.popAll();
		System.out.println("After popAll(), the size of stack is " + tempGenericStack.size());
	}
}
