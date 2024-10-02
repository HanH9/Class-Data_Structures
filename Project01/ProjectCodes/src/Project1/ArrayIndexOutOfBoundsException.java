package Project1;

/**
 * Defines an exception that the index out of range
 */
public class ArrayIndexOutOfBoundsException extends IndexOutOfBoundsException {
	
	/**
	 * Constructs an object with specific message
	 * @param message A string literal specifying the details of this exception
	 */
	public ArrayIndexOutOfBoundsException(String message) {
		super(message);
	}
}
