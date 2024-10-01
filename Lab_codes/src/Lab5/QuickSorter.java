package Lab5;

/**
 * Quick sort on a a list of strings
 * @author H9
 * @version 1.0
 */
public class QuickSorter{
	/**
	 * Invokes the doQuickSort method to sort an array.
	 * @param array The array to sort.
     */
    public static void quickSort(String array[]){
      doQuickSort(array, 0, array.length - 1);
    }

    /**
     * Uses the QuickSort algorithm to sort an array.
     * @param array The array to sort
     * @param start The starting subscript of the list to sort
     * @param end The ending subscript of the list to sort
     */
    private static void doQuickSort(String array[], int start, int end){
      int pivotPoint;
      
      if (start < end){
         // Get the pivot point.
         pivotPoint = partition(array, start, end);
         
         // Sort the first sub list.
         doQuickSort(array, start, pivotPoint - 1);
         
         // Sort the second sub list.
         doQuickSort(array, pivotPoint + 1, end);
      }
    }

   /**
    * Selects a pivot value in an array and arranges the array into two sub lists.
    * @param array The array to partition
    * @param start The starting subscript of the area to partition
    * @param end The ending subscript of the area to partition
    * @return The subscript of the pivot value
    */
   private static int partition(String array[], int start, int end){
	  String pivotValue;    // pivot value
      int endOfLeftList; // last element in the left sub list.
      int mid;           // mid-point subscript

      // Find the subscript of the middle element
      mid = (start + end) / 2;
      
      // Swap the middle element with the first element.
      swap(array, start, mid);

      // Save the pivot value for comparisons.
      pivotValue = array[start];
      
      // For now, the end of the left sub list is the first element.
      endOfLeftList = start;
      
      // Scan the entire list and move any values that
      // are less than the pivot value to the left sub list.
      for (int scan = start + 1; scan <= end; scan++){
         if (array[scan].compareTo(pivotValue)<0) 
         {
            endOfLeftList++;
            swap(array, endOfLeftList, scan);
         }
      }
      
      // Move the pivot value to end of the left sub list.
      swap(array, start, endOfLeftList);
      
      // Return the subscript of the pivot value.
      return endOfLeftList;
   }

   /**
    * Swaps the contents of two elements in an array.
    * @param The array containing the two elements
    * @param a The subscript of the first element
    * @param b The subscript of the second element
    */
   private static void swap(String[] array, int a, int b){
	   String temp;
      
      temp = array[a];
      array[a] = array[b];
      array[b] = temp;
   }
   
	
}

