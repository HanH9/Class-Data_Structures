package Lab5;

/**
 * Merge sort a string array
 * @author H9
 * @version 1.0
 */
public class MergeSorter {
	/**
	 * Sorts an array and creates a temporary array used for merge.
	 * @param array The array of items to be sorted
	 */
	public static void mergesort(String array[]) 
	{
		String[] tempArray = new String[array.length];
		mergesort(array, tempArray, 0, array.length - 1 );
	} 
	
	/**
	 * Merges two sorted array segments first..mid and mid+1..last into one sorted array. 
	 * @param array The array of items to be sorted
	 * @param tempArray An array to contain sorted items
	 * @param first The first index of the array
	 * @param mid The mid index of the array
	 * @param last The last index of the array
	 */
	private static void merge(String[] array, String[] tempArray, int first, int mid, int last) {
		// initialize the local indexes to indicate the subarrays
		int first1 = first;
		int last1  = mid;  
		int first2 = mid + 1; 
		int last2  = last;     
	
		// next available location in tempArray
		int index = first1;    
		
		// Sort two array segments and store them into tempArray
		while ((first1 <= last1) && (first2 <= last2)) {
			 if (array[first1].compareTo(array[first2])<0) {
			   tempArray[index] = array[first1];
			   first1++;
			 }
			 else {
			   tempArray[index] = array[first2];
			   first2++;
			 }  
			 index++;
		} 
		
		// finish off the nonempty subarray
		while (first1 <= last1) {
			 tempArray[index] = array[first1];
			 first1++;
			 index++;
		} 
		while (first2 <= last2) {
			 tempArray[index] = array[first2];
			 first2++;
			 index++;
		} 
		
		// copy the result back into the original array
		for (index = first; index <= last; ++index) {
			array[index] = tempArray[index];
		} 
	}
	
	/**
	 * Sorts the items in an array into ascending order.
	 * @param array The array of items to be sorted
	 * @param tempArray An array to contained sorted items
	 * @param first The first index of the array
	 * @param last The last index of the array
	 */
	public static void mergesort(String[] array, String[] tempArray,  int first, int last) {
		if (first < last)
		{
		 int mid = (first + last)/2;   
		 // sort left half
		 mergesort(array, tempArray, first, mid);
		 // sort right half
		 mergesort(array, tempArray, mid+1, last);
		 // merge the two halves
		 merge(array, tempArray, first, mid, last);
		}
	} 
}
