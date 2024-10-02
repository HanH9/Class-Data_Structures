package Project1;

/**
 * Implementations of operations of a bag.
 * @author H9
 * @version 1.0
 */
public class Bag implements BagInterface{
	/**
	 * the instance of data struct
	 */
	private Object[] elementData;
	
    /**
     * The size of the bag
     */
    private int size = 0;

    /**
     * Creates an empty bag that can hold up to 100 items
     */
    public Bag() {
        this.elementData = new Object[100];
    }

    /**
     * Adds an item to the end of the list of this bag.
     * @param data A reference to this added data
     * @throws ArrayException If bag is full
     */
	public void insert(Object object) throws ArrayException
	{
		// full bag
		if(this.size >= 99)
		{
			throw new ArrayException("The bag is full!");
		}
	    elementData[size++] = object;
	}

	/**
	 * Removes the item at the end of this bag.
	 * @throws ArrayException If bag is empty
	 */
	public void removeLast() throws ArrayException
	{
		// empty bag
		if(this.size() == 0)
	    {
			throw new ArrayException("The bag is empty, and no elements can be removed!");
	    }
		this.elementData[--size] = null;
	}
	
	 /**
	  * Removes an item at a random index from this bag.
	  * @param index An integer specifying the position of the removed item
	  * @throws ArrayIndexOutOfBoundsException If index < 0 or index > size()
	  * @throws ArrayException If bag is empty
	  */
	public void removeRandom(int index) throws ArrayIndexOutOfBoundsException, ArrayException 
	{
		  // empty bag
	      if(this.size() == 0)
	      {
	    	  throw new ArrayException("The bag is empty, and no elements can be removed!");
	      }
	      // index out of bound
		  else if (index < 0 || index > size) 
		  {
			  throw new ArrayIndexOutOfBoundsException("Index out of Bounds!");
	      }
	      System.arraycopy(elementData, index + 1, elementData, index, size - index - 1);
	      size--;
	 }

	/**
	 * Gets the index of the first occurrence of an item from this bag.
	 * @param object The item to search
	 * @return The index of the frist occurence of item
	 */
	public int get(Object object)
	{
		for(int i = 0; i < size;i++)
		{
			if(elementData[i] == object)
			{
				return i;
			}
		}
		return 0;
	}
	
	/**
	 * Gets a reference to an item at position index of this bag.
	 * @param index An integer specifying the position of the data
	 * @return The reference of item 
	 * @throws ArrayIndexOutOfBoundsException If index < 0 or index > size()
	 * @throws ArrayException If bag is empty
	 */
	public Object get(int index) throws ArrayIndexOutOfBoundsException, ArrayException
	 {
		  if(this.size() == 0)
		  {
				  throw new ArrayException("The array is empty!");
		  }
		  else if(index < 0 || index > this.size())
		  {
				  throw new ArrayIndexOutOfBoundsException("The index value must be between 0 and " + (this.size()-1));
		  }
		  else{
				  // return an items at index from this list.
				  return this.elementData[index];
			  }
			  
		  }

	/**
	 * Returns the number of items in this bag 
	 * @return An integer specifying the length of a bag
	 */
	public int size()
	{
		 return this.size;
	}
	
	/**
	 * Determines whether a bag is empty. 
	 * @return this.size()==0 specifying if this bag is empty or not
	 */
	public boolean isEmpty()
	{
		  return this.size() == 0;
	}
	
	 /**
	  * Removes all items in a bag.
	  */
	public void makeEmpty() throws ArrayException
	{
		  // empty bag
		  if(this.size == 0)
		  {
			  throw new ArrayException("The bag is empty!");
		  }
		  else
		  {
			  while(size > 0)
			  {
				  this.elementData[--size] = null;
			  }
		  }
	}
}
