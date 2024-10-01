package lab2;

/**
 * Specifications on the design of operations of an ADT list. 
 * @author H9
 * @version 1.0 
 */
public interface ListInterface {
 /**
  * Determines whether a list is empty. 
  * @return A boolean value specifying if this list is empty or not
  */
  public boolean isEmpty();
  
  /**
   * Returns the length of a list. 
   * @return An integer specifying the length of a list
   */
  public int size();
  
  /**
   * Adds a data to the list at position index.
   * @param index The position of this added data
   * @param data A reference to this added data
   * @throws ListIndexOutOfBoundsException If index < 0 or index > size()
   */
  public void add(int index, Object data) throws ListIndexOutOfBoundsException;
  
 
  /**
   * Removes a data by position.
   * @param index An integer specifying the position of the removed data
   * @throws ListIndexOutOfBoundsException If index < 0 or index > size()
   * @throws ListException If size() is 0
   */
  public void remove(int index)  throws ListIndexOutOfBoundsException, ListException;
 
} 




