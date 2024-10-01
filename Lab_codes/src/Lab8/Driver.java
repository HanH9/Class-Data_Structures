package Lab8;

public class Driver {
	public static void main(String[] args)
	{
		BinaryTree<Integer> tree, tree1, tree2, tree3;
		
		// Get the binary search tree provided in lab6
		tree1 = new BinaryTree<Integer>();
		tree1.setRoot(40);
		tree1.attachLeft(30);
		tree1.attachRight(50);
		
		tree2 = new BinaryTree<Integer>();
		tree2.setRoot(20);
		tree2.attachLeft(10);
		tree2.attachRightSubtree(tree1);
		
		tree3 = new BinaryTree<Integer>(70);
		tree =  new BinaryTree<Integer>(60, tree2, tree3);
		
		// Get iterator
		TreeIterator<Integer> iterator = new TreeIterator<Integer>(tree);
		
		// Test all the methods in given program
		System.out.println("Test setPreorder(), preorder(), remove() and next():");
		iterator.setPreorder();
		while(iterator.hasNext())
		{
			  System.out.print(iterator.next() + " ");
			  iterator.remove();
			  
		}
		System.out.println("");
		
		System.out.println("Test setIneorder(), inorder(), remove() and next():");
		iterator.setInorder();;
		while(iterator.hasNext())
		{
			  System.out.print(iterator.next() + " ");
			  iterator.remove();
			  
		}
		System.out.println("");
		
		System.out.println("Test postIneorder(), postorder(), remove() and next():");
		iterator.setPostorder();
		while(iterator.hasNext())
		{
			  System.out.print(iterator.next() + " ");
			  iterator.remove();
			  
		}
		System.out.println("");
		
		System.out.println("hasNext():");
		System.out.print(iterator.hasNext());
		
		
	}
}
