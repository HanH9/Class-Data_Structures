package Project3;
/**
 * An exception that is thrown when stack overflow or stack underflow occurs. 
 * @author H9
 * @version 1.0
 */
public class StackException extends java.lang.RuntimeException {
	/**
	 * Constructs an exception with a specified message. 
	 * @param message The specified message of this exception
	 */
	public StackException(String message) {
		super(message);
	}
}
