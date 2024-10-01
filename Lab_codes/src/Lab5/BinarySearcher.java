package Lab5;

/**
 * Binary search on a a list of Strings. 
 * @author H9
 * @version 1.0
 */
public class BinarySearcher{
   /**
    * Searches an array for the string passed to value. If the number is found, its array subscript is
    * returned. Otherwise, -1 is returned indicating the value was not found in the array.
    * @param array The array to search.
    * @param value The string to search for.
    */
   public static int search(String[] array, String value) {
      int first;       // First array element
      int last;        // Last array element
      int middle;      // Mid point of search
      int position;    // Position of search value
      boolean found;   // Found or not

      first = 0;
      last = array.length - 1;
      position = -1;
      found = false;

      // Search for the string.
      while (!found && first <= last) {
         middle = (first + last) / 2;
         
         // If value is found at midpoint
         if (array[middle] == value) {
            found = true;
            position = middle;
         }else if (array[middle].compareTo(value) > 0){
        	// else if value is in lower half
            last = middle - 1;
         }else{
             // else if value is in upper half
            first = middle + 1;
         }
      }

      // Return the position of the string, or -1 if it was not found.
      return position;
   }
}
