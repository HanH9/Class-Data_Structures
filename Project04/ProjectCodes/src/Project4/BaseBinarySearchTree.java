package Project4;

/**
 * Represents a binary search tree with operations on the root
 * @author H9
 * @version 1.0
 */
public class BaseBinarySearchTree<E> {
	  /**
	   * The root of this tree
	   */
	  protected TreeNode<E> root;

	  /**
	   * Creates an empty binary search tree.
	   */
	  public BaseBinarySearchTree() {
		  this.root = null;
	  }
      
	  /**
	   * Creates a one-node binary search tree whose root contains a root item.
	   * @param rootItem The item of the root
	   */
	  public BaseBinarySearchTree(E rootItem) {
	     this.root = new TreeNode<E>(rootItem, null, null);
	  } 
	  

	  /**
	   * Check if this tree is empty
	   * @return A value specifying if the tree is empty
	   */
	  public boolean isEmpty() {
		  return this.root == null;
	  } 

	  /**
	   * Make this tree empty
	   */
	  public void makeEmpty() {
	    this.root = null;
	  }

	  /**
	   * Retrieve the root item of this tree
	   * @return A reference to the item of the root
	   * @throws TreeException if the tree is empty
	   */
	  public E getRoot() throws TreeException {
	    if (this.root == null) {
	      throw new TreeException("TreeException: Empty tree");
	    }else {
	      return this.root.getElement();
	    }
	  }

      /**
       * Change the root item of this tree if supported.
       * @param newItem A reference to a new root item
       */
	  public void changeRoot(E newItem) 
	  {
	    if (this.root != null) 
	    {
	       this.root.setElement(newItem);
	    }
	    else
	    {
	       this.root = new TreeNode<E>(newItem, null, null);
	    }
	  }
	}   
