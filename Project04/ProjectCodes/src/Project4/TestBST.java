package Project4;

/**
 * Test class for BST
 * @author H9
 * @version 1.0
 */
public class TestBST {
	public static <E> void main(String[] args) 
	{
		BinarySearchTree<ClassSection> binarySearchTree = new BinarySearchTree<ClassSection>();
		ClassSection classSection1 = new ClassSection("7111", "ICSI", "213", "Data Structures", "Undergraduate");
		ClassSection classSection2 = new ClassSection("8111", "ICSI", "213", "Data Structures", "Undergraduate");
		ClassSection classSection3 = new ClassSection("5111", "ICSI", "213", "Data Structures", "Undergraduate");
		ClassSection classSection4 = new ClassSection("4111", "ICSI", "213", "Data Structures", "Undergraduate");
		ClassSection classSection5 = new ClassSection("6111", "ICSI", "213", "Data Structures", "Undergraduate");
		binarySearchTree.insert(classSection1);
		binarySearchTree.insert(classSection2);
		binarySearchTree.insert(classSection3);
		binarySearchTree.insert(classSection4);
		binarySearchTree.insert(classSection5);
		
		TreeIterator<ClassSection> iterator = binarySearchTree.getIterator();
		iterator.setPreorder();
		while(iterator.hasNext())
		{
			  System.out.println(iterator.next());
			  iterator.remove();
			  
		}
	}
}
