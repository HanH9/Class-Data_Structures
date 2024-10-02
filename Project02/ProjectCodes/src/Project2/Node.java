package Project2;

public class Node<E> {
	/**
	 * The reference to the last node of this queue
	 */	
	private E item;
	
	/**
	 * The link to next node
	 */	
	private Node<E> nextNode;
	
	/**
	 * The link to previous node
	 */
	private Node<E> preNode;
	
	/**
	 * Constructs a null node.
	 */
	public Node(){
		this(null, null, null);
	} 
	
	/**
	 * Constructs a node with an item.
	 * @param item A reference to this data of this node
	 */
	public Node(E item) {
		this(item, null, null);
	}  
	
	/**
	 * Constructs a node with an item and link to predecessor node
	 * @param item A reference to this data of this node
	 * @param pre A reference to the predecessor node
	 */
	public Node(E item, Node<E> pre) {
		this(item, pre, null);
	} 
	
	/**
	 * Constructs a node with an item, link to predecessor and successor node
	 * @param item A reference to this data of this node
	 * @param pre A reference to the predecessor node
	 * @param next A referenece to the next node
	 */
	public Node(E item, Node<E> pre, Node<E> next) {
		this.item = item;
		this.preNode = pre;
		this.nextNode = next;
	}

	
	/**
	 * Returns the value of this node.
	 * @return the item of this node
	 */
	public E getItem() {
		return item;
	}
	
	/**
	 * Changes the item of this node.
	 * @param item the item to set
	 */
	public void setItem(E item) {
		this.item = item;
	}
	
	/**
	 * Returns the reference to the next node.
	 * @return A reference to the next node
	 */
	public Node<E> getNextNode() {
		return nextNode;
	}
	
	/**
	 * Changes the next node of this node.
	 * @param nextNode A reference to the next to set
	 */
	public void setNextNode(Node<E> nextNode) {
		this.nextNode = nextNode;
	}
	
	/**
	 * Returns the reference to the previous node.
	 * @return A reference to the previous node
	 */
	public Node<E> getPreNode() {
		return preNode;
	}
	
	/**
	 * Changes the previous node of this node.
	 * @param nextNode A reference to the previous to set
	 */
	public void setPreNode(Node<E> preNode) {
		this.preNode = preNode;
	} 
	
    /**
     * Overrides the toString()
     * @return the information in node
     */
    @Override
    public String toString()
    {
    	return this.item.toString();
    }
}
