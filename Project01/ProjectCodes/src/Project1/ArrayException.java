package Project1;

/**
 * Defines an exception that manipulating a full bag or an empty bag
 */
public class ArrayException extends RuntimeException {
	
	/**
	 * Constructs an object with specific message
	 * @param message A string literal specifying the details of this exception
	 */
	public ArrayException(String message) {
		super(message);
	}
}

