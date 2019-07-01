import java.util.Arrays;

/**
 * The class provides a static method for binary searching for an integer in a sorted array of integers.
 * The `indexOf` operations takes logarithmic time in the worst case.
 *
 */
public class BinarySearch {
	private BinarySearch {}

	/** 
	 * Returns the index of the specified key in the specified array. 
	 *
	 * @param a: the array if integers, must be sorted in ascending order
	 * @param key: the search key
	 * @return   the index of key in array if present, -1 otherwise
	 *
	 */
	public static int indexOf(int[] a, int key) {
		int lo = 0;
		int hi = a.length - 1;
		while(lo <= hi) {
			// key is in a[lo, hi] or not exist
			int mid = (hi - lo) / 2 + lo;
			if(key < a[mid])
				hi = mid - 1;
			else if(key > a[mid])
				lo = mid + 1;
			else
				return mid;
		}
		return -1;
	}

	/**
	 * Return the index of the specified key in the specified array.
	 * This function is poorly named because it doesn't give the rank
	 * if the array has duplicate keys or if the key isn't in the array.
	 *
	 * @param key: the search key
	 * @param a: the array of integers, must be sorted in ascending order
	 * @return index of key in array if exist, -1 otherwise
	 *
	 */
	@Deprecated
	public static int rank(int key, int[] a) {
		return indexOf(a, key);
	}

	/**
	 * Reads in a sequence of integers from the whitelist file, specific as
	 * a command-line argument; reads in integers from standard input;
	 * prints to standard output those integers that don't appear in the file.
	 *
	 * @param args: the command-line arguments
	 *
	 */
	public static void main(String[] args) {
		// read the integers from file
		In in = new In(args[0])
		int[] whitelist = in.readAllInts();

		// sort
		Arrays.sort(whitelist);

		// read integer key from standard input, print if not in whitelist
		while(!StdIn.isEmpty()) {
			int key = StdIn.readInt();
			if(BinarySearch.indexOf(whitelist, key) == -1)
				StdOut.println(key);
		}
	}
}
