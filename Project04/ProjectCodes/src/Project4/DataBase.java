package Project4;

import java.util.LinkedList;

/**
 * An ADT class database maintains a list of class sections in a binary search tree. 
 * @author H9
 * @version 1.0
 */
public class DataBase {
	// The BST to store class sections
	public BinarySearchTree<ClassSection> tree;
	
	public DataBase()
	{
		this.tree = new BinarySearchTree<ClassSection>();
	}
	 /**
     * Insert a class section  into a class database
     * @param value value of class section
     * @return if the insertion success or not
     */
	public boolean insert(ClassSection classSection)
	{
		return tree.insert(classSection);
	}
	
	/**
	 * Delete a class section from this class database
	 * @param classSection the class to delete
	 */
	public void delete(ClassSection classSection)
	{
		tree.remove(classSection);
	}
	
	 /**
	 * Search an element in this tree.
	 * @param key node's element
	 * @return if the search success or not
	 */
	public boolean search(ClassSection classSection)
	{
		return tree.search(classSection);
	}

	/**
	 * Check if the tree is empty
	 * @return A value specifying if the database is empty
	 */
	public boolean isEmpty()
	{
		return tree.isEmpty();
	}
	
	/**
	 * Make database empty
	 */
	public void makeEmpty()
	{
		tree.makeEmpty();
	}

	/**
	 * Traverse this class database in an inorder traversal,
	 * @return a linked list that store classes
	 */
	public LinkedList <TreeNode<ClassSection>> sortInorder()
	{
		return tree.getIterator().setInorder();
	}

	/**
	 * Return the total number of class sections
	 * @return the number of class sections
	 */
	public int getNumber()
	{
		return tree.getIterator().setInorder().size();
	}
}
