package Project4;

/**
 * Represents a binary search tree with additional operations
 * @author H9
 * @version 1.0
 */
public class BinarySearchTree<E extends Comparable<E>> extends BaseBinarySearchTree<E> {

	  /**
	   * Creates an empty  binary tree.
	   */
	  public BinarySearchTree() {
		  super();  
	  }

	  /**
	   * Creates a one node binary tree.
	   * @param rootItem The root of this tree
	   */
	  public BinarySearchTree(E rootItem) {
		  super(rootItem);
	  }

	   /**
	   * Search an element in this tree.
	   * @param key node's element
	   * @return if the search success or not
	   */
	  public boolean search(E key)
	   {
		  TreeNode<E> cur = root;
	       while(cur != null)
	       {
	           if(cur.element.compareTo(key)<0)
	           {
	               cur=cur.right;
	           }
	           else if(cur.element == key)
	           {
	                return true;
	           }
	           else
	           {
	                cur=cur.left;
	           }
	        }
	        return false;
	    }
	  
	  /**
      * Insert an element into this tree.
      * @param value value of new node
      * @return if the insertion success or not
      */
	  public boolean insert(E value)
      {
		  if(root == null)
        {
            root = new TreeNode<E>(value);
            return true;
        }

        TreeNode<E> newNode = new TreeNode<E>(value);// new node
        TreeNode<E> cur = root;// point node
        TreeNode<E> parent = null;

        while(cur != null)
        {
            if(cur.element.compareTo(value) < 0)
            {
                parent = cur;
                cur = cur.right;
            }
            else if(cur.element.compareTo(value) > 0)
            {
                parent = cur;
                cur = cur.left;
            }
            else
            {
                return false;
            }
        }
        if(parent.element.compareTo(value) < 0){
            parent.right=newNode;
        }else if(parent.element.compareTo(value) > 0){
            parent.left=newNode;
        }
        return true;
      }

     /**
      * Delete an element from this tree.
      * @param key the element of deleted node
      */
      public void remove(E key)
      {
    	  TreeNode<E> cur = root;
    	  TreeNode<E> parent = null;
    	  while(cur != null)
    	  {
    		  if(cur.element == key)
    		  {
    			  removeNode(cur,parent);
    			  break;
    		  }
    		  else if(cur.element.compareTo(key) < 0)
    		  {
    			  parent = cur;
    			  cur = cur.right;
    		  }
    		  else
              {
                parent =cur;
                cur=cur.left;
              }
    	  }
      }

      /**
      * Helper function of remove(E)
      * @param cur deleted node
      * @param parent deleted node's parent
      */
      public void removeNode(TreeNode<E> cur, TreeNode<E> parent)
    {
        if(cur.left == null)
        {
            if(cur == root)
            {
                root = cur.right;
            }
            else if(cur == parent.left)
            {
                parent.left = cur.right;
            }
            else if(cur == parent.right)
            {
                parent.right = cur.right;
            }
        }
        else if(cur.right == null)
        {
            if(cur == root)
            {
                root = cur.left;
            }
            else if(cur == parent.left)
            {
                parent.left = cur.left;
            }
            else if(cur == parent.right)
            {
                parent.right = cur.left;
            }
        }
        else
        {
            // find the min in deleted node's right child tree
        	TreeNode<E> targetParent = cur;
        	TreeNode<E> target = cur.right;
            while(target.left!=null)
            {
                // search in left side
                targetParent=target;
                target=target.left;
            }
            cur.element = target.element;
            if(target == targetParent.left)
            {
                targetParent.left = target.right;
            }
            else if(target == targetParent.right)
            {
                targetParent.right = target.right;
            }
        }
    }

      /**
       * Construct and return an iterator of this tree
       * @return an iterator of this tree
       */
      public TreeIterator<E> getIterator()
      {
    	  TreeIterator<E> iterator = new TreeIterator<E>(this.root);
    	  return iterator;
      }
}
