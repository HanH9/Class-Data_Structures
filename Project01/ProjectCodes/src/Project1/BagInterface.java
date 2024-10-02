package Project1;

/**
 * Specifications on the design of operations of a bag. 
 * @author H9
 * @version 1.0 
 */
public interface BagInterface {

   /**
   * Adds an item to the end of the list of this bag.
   * @param data A reference to this added data
   * @throws ArrayException If bag is full
   */
  public void insert(Object data) throws ArrayException;
  
  /**
   * Removes the item at the end of this bag.
   * @throws ArrayException If bag is empty
   */
  public void removeLast() throws ArrayException;
  
  /**
   * Removes an item at a random index from this bag.
   * @param index An integer specifying the position of the removed item
   * @throws ArrayIndexOutOfBoundsException If index < 0 or index > size()
   * @throws ArrayException If bag is empty
   */
  public void removeRandom(int index)  throws ArrayIndexOutOfBoundsException, ArrayException;
 
  /**
   * Gets the index of the first occurrence of an item from this bag.
   * @param object the item to search
   * @return the index of the frist occurence of item
   */
  public int get(Object object);
  
  /**
   * Gets a reference to an item at position index of this bag.
   * @param index An integer specifying the position of the data
   * @return The reference of item 
   * @throws ArrayIndexOutOfBoundsException If index < 0 or index > size()
   * @throws ArrayException If bag is empty
   */
  public Object get(int index) throws ArrayIndexOutOfBoundsException,ArrayException;
  
  /**
   * Returns the number of items in this bag 
   * @return An integer specifying the length of a bag
   */
  public int size();
  
  /**
   * Determines whether a bag is empty. 
   * @return A boolean value specifying if this bag is empty or not
   */
   public boolean isEmpty();
   
   /**
    * Removes all items in a bag.
    */
   public void makeEmpty() throws ArrayException;
} 




