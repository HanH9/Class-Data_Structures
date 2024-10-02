package Project3;

/**
 * A generic ADT Stack interface
 * @author H9
 * @version 1.0
 */
public interface GenericStackInterface<E> {
    /**
     * Pushes a element into the stack
     * @param element The element
     */
    public void push(E element);
    
    /**
     * Get the top element in stack and delete it
     * @return The element
     */
    public E pop () throws StackException;
    
    /**
     * Deletes all elements and print them
     */
    public void popAll() throws StackException;
    
    /**
     * Gets the top element
     * @return The top element
     */
    public E peek() throws StackException;
    
    /**
     * Determines whether the stack is empty
     * @return If stack is empty that it returns true else it returns false
     */
    public boolean isEmpty();
    
    /**
     * Gets the size of stack
     * @return The size of stack
     */
    public int size();
}
