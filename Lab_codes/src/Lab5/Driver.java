package Lab5;

/**
 * Driver class to complement the tragets of lab5
 * @author H9
 * @version 1.0
 */
public class Driver {
	/**
	 * Complements the tragets of lab5
	 * @param args A reference to a string array containing command-line arguments
	 */
    public static void main(String[] args){
      String[] values = { "Jujube", "Orange", "Logan", "Pomegranate", "Raspberry", "Cantaloupe", "Carambola", 
    		  "Date palm", "Coconut"};// An array with the given strings
      int binaryResult; // Store the value of binary search
      int sequentialResult;// Store the value of sequential search
      
      // Display the array's contents.
      System.out.println("Original order: ");
      for (String element : values){
         System.out.print(element + "  ");
      }
      System.out.println();
      
      // Sort the array by quick sort
      QuickSorter.quickSort(values);

      // Display the array sorted by quick sort
      System.out.println("\nAfter quick sort, the order is: ");
      for (String element : values){
         System.out.print(element + "  ");
      }
      System.out.println();
      
      // Sort the array by merge sort
      MergeSorter.mergesort(values);
      // Display the array sorted by merge sort
      System.out.println("\nAfter using merge sort to sort the list again, the order is: ");
      for (String element : values){
         System.out.print(element + "  ");
      }
      System.out.println();
      
      // Use binary search to search "Logan"
      binaryResult = BinarySearcher.search(values, "Logan");
      // Display the results.
      if (binaryResult == -1){
         System.out.println("\nBy using binary search, \"Logan\"" + " was not found.");
      }else{
          System.out.println("\nBy using binary search, \"Logan\" was found at element " + binaryResult);
      }
      
      // Use sequential search to search "Apple"
      sequentialResult = SequentialSearcher.search(values, "Apple");
      // Display the results.
      if (sequentialResult == -1){
         System.out.println("\nBy using sequential search, \"Apple\"" + " was not found.");
      }else{
          System.out.println("\nBy using sequential search, \"Apple\" was found at element " + binaryResult);
      }
   }
}
