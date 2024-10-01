package Lab8;
import java.util.LinkedList;

/**
* An iterator over a binary tree.
* @author Qi Wang
* @version 1.0
*/
public class TreeIterator<T> implements java.util.Iterator<T> {
	/**
	 * The collection traversed by this iterator
	 */
	 private BaseBinaryTree<T> tree;
	 
	 /**
	 * An ordered list of nodes traversed by this iterator. 
	 * Empty list indicates no traversal type currently selected or 
	 * end of current traversal has been reached
	 */
	 private LinkedList <TreeNode<T>> list;
	 
	 /**
	 * Constructs an iterator over a binary tree. 
	 * @param tree A reference to a binary tree
	 */
	 public TreeIterator(BaseBinaryTree<T> tree) 
	 {
		 this.tree = tree;
		 // empty queue indicates no traversal type currently
		 // selected or end of current traversal has been reached
		 this.list = new LinkedList<TreeNode<T>>();
	 }
	
	 /**
	 * Returns true if the iteration has more elements. 
	 * (In other words, returns true if next() would return an element rather than throwing an exception.)
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
	 public T next() throws java.util.NoSuchElementException
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
	 public void setPreorder()
	 {
		 this.list.clear();
		 this.preorder(this.tree.root);
	 }
	 
	 /**
	 * Sets the traversal type to be inorder.
	 */
	 public void setInorder()
	 {
		 this.list.clear();
		 this.inorder(this.tree.root);
	 }
	 
	 /**
	 * Sets the traversal type to be postorder.
	 */
	 public void setPostorder()
	 {
		 this.list.clear();
		 this.postorder(this.tree.root);
	 }
	 
	 /**
	 * Traverses in preorder. 
	 * @param treeNode A reference to a tree node
	 */
	 private void preorder(TreeNode<T> treeNode) 
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
	 private void inorder(TreeNode<T> treeNode)
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
	 private void postorder(TreeNode<T> treeNode)
	 {
		 if(treeNode != null)
		 {
			 postorder(treeNode.getLeft());
			 postorder(treeNode.getRight());
			 this.list.add(treeNode);
		 }
	 } 
}
