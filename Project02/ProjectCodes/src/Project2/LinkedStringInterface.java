package Project2;

/**
 * Specifications on the design of operations of a linked string. 
 * @author H9
 * @version 1.0 
 */
public interface LinkedStringInterface {
   /**
    * Gets the char at the specified index.
    * @param a A index 
    * @return The char value in the specified index
    */
	public char charAt(int a) throws LinkedStringOutOfBoundsException;
	
   /**
    * Concatenate a specified linked string to the end of this linked string
    * @param string The specified linked string
    * @return The reference to the linked string that completes the connection
    */
	public LinkedString concat(LinkedString string);

   /**
    * Determine if the linked string is empty
    * @return Returns true if the length of this linked string is 0£¬else return false
    */
   public boolean isEmpty();
   
   /**
    * Gets the length of linked string
    * @return Return the length of linked string
    */
   public int length();
   
   /**
    * Return a substring of linked string
    * @param start The start position
    * @param end The end position
    * @return The reference to the substring
    */
   public LinkedString substring(int start, int end)throws LinkedStringOutOfBoundsException;
}
