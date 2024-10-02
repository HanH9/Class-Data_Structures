package Project4;
import java.util.LinkedList;

/**
* An iterator over a binary search tree.
* @author H9
* @version 1.0
*/
public class TreeIterator<E> implements java.util.Iterator<E> {
	/**
	 * The collection traversed by this iterator
	 */
	 private TreeNode<E> treeNode;
	 
	 /**
	 * An ordered list of nodes traversed by this iterator. 
	 * Empty list indicates no traversal type currently selected or 
	 * end of current traversal has been reached
	 */
	 public LinkedList <TreeNode<E>> list;
	 
	 /**
	 * Constructs an iterator over a binary tree. 
	 * @param tree A reference to a binary tree
	 */
	 public TreeIterator(TreeNode<E> treeNode) 
	 {
		 this.treeNode = treeNode;
		 // empty queue indicates no traversal type currently
		 // selected or end of current traversal has been reached
		 this.list = new LinkedList<TreeNode<E>>();
	 }
	
	 /**
	 * Returns true if the iteration has more elements. 
	 * @return A boolean value specifying if there is an element to be returned
	 */
	 public boolean hasNext() {
	 return !this.list.isEmpty();
	 }
	 
	 /**
	 * Returns the next element in the iteration.
	 * @return the next element in the iteration
	 * @throws NoSuchElementException if the iteration has no more elements
	 */
	 public E next() throws java.util.NoSuchElementException
	 {
		 return this.list.getFirst().getElement();
	 }
	 
	 /**
	 * Removes from the underlying binary tree the last element returned by this iterator (optional operation). 
	 */
	 public void remove()
	 {
		 this.list.remove();
	 }
	 
	 /**
	 * Sets the traversal type to be preorder.
	 */
	 public LinkedList <TreeNode<E>> setPreorder()
	 {
		 this.list.clear();
		 this.preorder(this.treeNode);
		 return list;
	 }
	 
	 /**
	 * Sets the traversal type to be inorder.
	 */
	 public LinkedList <TreeNode<E>> setInorder()
	 {
		 this.list.clear();
		 this.inorder(this.treeNode);
		 return list;
	 }
	 
	 /**
	 * Sets the traversal type to be postorder.
	 */
	 public LinkedList <TreeNode<E>> setPostorder()
	 {
		 this.list.clear();
		 this.postorder(this.treeNode);
		 return list;
	 }
	 
	 /**
	 * Traverses in preorder. 
	 * @param treeNode A reference to a tree node
	 */
	 private void preorder(TreeNode<E> treeNode) 
	 {
		 if(treeNode != null)
		 {
			 this.list.add(treeNode);
			 preorder(treeNode.getLeft());
			 preorder(treeNode.getRight());
		 }
	 }
	 
	 /**
	 * Traverses in inorder. 
	 * @param treeNode A reference to a tree node
	 */
	 private void inorder(TreeNode<E> treeNode)
	 {
		 if(treeNode != null)
		 {
			 inorder(treeNode.getLeft());
			 this.list.add(treeNode);
			 inorder(treeNode.getRight());
		 }
	 }
	 
	 /**
	 * Traverses in postorder. 
	 * @param treeNode A reference to a tree node
	 */
	 private void postorder(TreeNode<E> treeNode)
	 {
		 if(treeNode != null)
		 {
			 postorder(treeNode.getLeft());
			 postorder(treeNode.getRight());
			 this.list.add(treeNode);
		 }
	 }
}
