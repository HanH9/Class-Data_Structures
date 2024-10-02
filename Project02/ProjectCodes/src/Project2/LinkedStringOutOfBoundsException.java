package Project2;

/**
 * Defines an exception that the index out of range
 */
public class LinkedStringOutOfBoundsException extends IndexOutOfBoundsException
{
    /**
     * Constructs an object with specific message
     * @param message A string literal specifying the details of this exception
     */
    public LinkedStringOutOfBoundsException(String message)
    {
        super(message);
    }
}
