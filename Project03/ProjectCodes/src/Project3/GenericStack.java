package Project3;

import java.util.ArrayList;

/**
 * A generic ADT Stack implemented by an array list
 * @author H9
 * @version 1.0
 */
public class GenericStack<E> implements GenericStackInterface<E> 
{
	private ArrayList<E> arrayList = new ArrayList<>();
	
    /**
     * Pushes a element into the stack
     * @param element The element
     */
    public void push(E element)
    {
        this.arrayList.add(element);
    }
    
    /**
     * Get the top element in stack and delete it
     * @return The element
     */
    public E pop () throws StackException
    {
        E  element;
        if(!this.isEmpty())
        {
        	int size = this.size();
            element = arrayList.get(size - 1);
            arrayList.remove(size - 1);
        }
        else
        {
            throw new StackException("StackException on pop: stack empty");
        }
        return element;
    }
    
    /**
     * Deletes all elements and print them
     */
    public void popAll() throws StackException
    {
        while(!this.isEmpty())
        {
            this.pop();
        }
    }
    
    /**
     * Gets the top element
     * @return The top element
     */
    public E peek() throws StackException
    {
        if(!this.isEmpty())
        {
        	return arrayList.get(this.size()-1);
        }
        else
        {
            throw new StackException("StackException on pop: stack empty");
        }
    }
   
    /**
     * Determines whether the stack is empty
     * @return If stack is empty that it returns true else it returns false
     */
    public boolean isEmpty()
    {
        return arrayList.isEmpty();
    }
    
    /**
     * Gets the size of stack
     * @return The size of stack
     */
    public int size()
    {
        return arrayList.size();
    }
}
