/**
 * Sorts a sequence of strings from standard input using an optimized version of insertion
 * sort that uses half exchanges instead of full exchanges to reduce data movement.
 *
 */

/**
 * The `InsertionOptimized` class provides static methods for sorting an 
 * array using an optimized version of insertion sort(with half exchanges and a 
 * sentinel)
 *
 */
public class InsertionOptimized {
	private InsertionOptimized() {}

	// Rearranges the array in ascending order, using the natural order.
	public static void sort(Comparable[] a) {
		int n = a.length;
		// put smallest element in position to serve as sentinel.
		int exchanges = 0;
		for(int i = n - 1; i > 0; i--) {
			if(less(a[i], a[i - 1])) {
				exchange(a, i, i - 1);
				exchanges++;
			}
		}
		if(exchanges == 0)
			return;

		// insertion sort with half exchanges.
		for(int i = 2; i < n; i++) {
			Comparable v = a[i];
			int j = i;
			while(less(v, a[j - 1])) {
				a[j] = a[j - 1];
				j--;
			}
			a[j] = v;
		}
		assert isSorted(a);
	}

	// Helper sorting functions

	// is v < w ?
	private static boolean less(Comparable v, Comparable w) {
		return v.compareTo(w) < 0;
	}

	// exchanges a[i] and a[j]
	private static void exchange(Object[] a, int i, int j) {
		Object swap = a[i];
		a[i] = a[j];
		a[j] = swap;
	}

	// Check if array is sorted (for debug)
	private static boolean isSorted(Comparable[] a) {
		for(int i = 1; i < a.length; i++)
			if(less(a[i], a[i - 1]))
				return false;
		return true;
	}

	// print the array to standard output
	private static void show(Comparable[] a) {
		for(int i = 0; i < a.length; i++)
			StdOut.println(a[i]);
	}

	// test
	public static void main(String[] args) {
		String[] a = StdIn.readAllStrings();
		InsertionOptimized.sort(a);
		show(a);
	}
}

