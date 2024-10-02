package Project2;

/**
 * Implementations of operations of a linked string.
 * @author H9
 * @version 1.0
 */
public class LinkedString implements LinkedStringInterface
{
	//Head node
    private Node<Character> head = null;
    //Records the length of linked string
    private int count=0;
    
    /**
     * Creates an empty LinkedString instance.
     */
    public LinkedString()
    {
    	this(new char[0]);
    }
    
    /**
     * Creates a LinkedString instance from a sequence of characters.
     * @param charArray A sequence of characters
     */
    public LinkedString(char[] charArray)
    {
    	//For empty linked string
    	if(charArray.length == 0)
    	{
    		this.head = new Node<Character>();
    	}
    	//For no empty linked strig
    	else if(charArray.length > 0)
    	{
	    	this.head = new Node<>(charArray[0]);
	    	Node<Character> pointNode = head;
	    	Node<Character> tempNode;
	    	count++;
	    	for(int i = 1; i < charArray.length; i++)
	    	{
	    		tempNode = new Node<Character>(charArray[i], pointNode);
	    		pointNode.setNextNode(tempNode);
	    		pointNode = tempNode;
	    		count++;
	    	}
    	}
    
    }
    
    /**
     * create a LinkedString instance from a String object.
     * @param string A String object
     */
    public LinkedString(String string)
    {
        this(string.toCharArray());
    }

    /**
     * Gets the char at the specified index.
     * @param a A index 
     * @return The char value in the specified index
     */
    public char charAt(int index) throws LinkedStringOutOfBoundsException
    {
    	if (index < 0 || index > this.length()) 
    	{
    		throw new LinkedStringOutOfBoundsException("Out of index!");
		}
    	else {
	    	Node<Character> pointNode = head;
	    	for(int i = 0; i < index; i++)
	        {
	            pointNode = pointNode.getNextNode();
	        }
	        return pointNode.getItem();
    	}
    }
    
    /**
     * Concatenate a specified linked string to the end of this linked string
     * @param string The specified linked string
     * @return The reference to the linked string that completes the connection
     */
 	public LinkedString concat(LinkedString string)
 	{
 		//Create a new linked string to store
 		int currentLength = this.length();
 		int addLength = string.length();
 		char[] newString = new char[currentLength + addLength];
 		
 		//Store the item in frist linked string
 		Node<Character> pointNode1 = head;
 		for(int i = 0; i < currentLength; i++)
 		{
 			newString[i] = pointNode1.getItem();
 			pointNode1 = pointNode1.getNextNode();
 		}
 		
 		//Store the item in second linked string
 		Node<Character> pointNode2 = string.head;
 		for(int i = 0; i < addLength; i++)
 		{
 			newString[currentLength + i] = pointNode2.getItem();
 			pointNode2 = pointNode2.getNextNode();
 		}
 		return new LinkedString(newString);
 	}

 	/**
     * Determine if the linked string is empty
     * @return Returns true if the length of this linked string is 0£¬else return false
     */
    public boolean isEmpty()
    {
    	if(count == 0)
    	{
    		return true;
    	}
    	else {
			return false;
		}
    }

    /**
     * Gets the length of linked string
     * @return Return the length of linked string
     */
    public int length()
    {
    	return count;
    }
    
    /**
     * Return a substring of linked string
     * @param start The start position
     * @param end The end position
     * @return The reference to the substring
     */
    public LinkedString substring(int start, int end)throws LinkedStringOutOfBoundsException
    {
    	if(end <= start)
    	{
    		throw new LinkedStringOutOfBoundsException("The end index must less tha start index!");
    	}
    	else if (start < 0 || end > this.length())
    	{
			throw new LinkedStringOutOfBoundsException("Out of index!");
		}
    	else 
    	{
    		Node<Character> pointNode = this.head;
    		//Create a new linked string to store
    		char[] newString = new char[end - start];
    		
    		for(int i = 0; i < end; i++)
    		{
    			if(i >= start)
    			{
    				newString[i-start] = pointNode.getItem();
    			}
    			pointNode = pointNode.getNextNode();
    		}
    		return new LinkedString(newString);
    		//for(int j = 0; j < end - start; j++)
    		//{
    		//	newString[j] = pointNode.getItem();
    		//	pointNode = pointNode.getNextNode();
    		//}
		}
    }
    
    /**
     * Overrides the toString()
     * @return the information in linked string
     */
    @Override
    public String toString()
    {
    	//Converts the chars to a string
        Node<Character> pointNode = head;
        StringBuilder stringBuffer = new StringBuilder();
        for(int i = 0;i < count;i++)
        {
            stringBuffer.append(pointNode.getItem());
            pointNode = pointNode.getNextNode();
        }
        return stringBuffer.toString();
    }
}

