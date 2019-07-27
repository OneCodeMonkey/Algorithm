/**
 * Binary Insertion sort with half exchanges.
 *
 * The `BinaryInsertion` class provides a static method for sorting an array using an 
 * optimized binary insertion sort with half exchanges.
 * This implementation makes ~ n * logn  compares for any array of length n.
 * However, in the worst case, the running time is quadratic because the number of
 * array accesses can be proportional to n^2.
 * As such, it's not suitable for sorting large arrays(unless the number of inversions is small).
 *
 * This soring algorithm is stable and uses O(1) extra memory.
 *
 */
public class BinaryInsertion {
	private BinaryInsertion() {}

	// Rearranges the array in ascending order, using the natural order.
	public static void sort(Comparable[] a) {
		int n = a.length;
		for(int i = 1; i < n; i++) {
			// binary search to determine index j at which to insert a[i]
			Comparable v = a[i];
			int low = 0;
			int high = i;
			while(low < high) {
				int mid = low + (high - low) / 2;
				if(less(v, a[mid]))
					high = mid;
				else
					low = mid + 1;
			}

			// insertion sort with half exchanges
			for(int j = i; j > low; j--)
				a[j] = a[j - 1];

			a[low] = v;
		}
		assert isSorted(a);
	}

	// helper functions

	// is v < w ?
	private static boolean less(Comparable v, Comparable w) {
		return v.compareTo(w) < 0;
	}

	// Check if array is sorted - (for debug)
	private static boolean isSorted(Comparable[] a) {
		return isSorted(a, 0, a.length - 1);
	}

	// check if a[low, high] is sorted ?
	private static boolean isSorted(Comparable[] a, int low, int high) {
		for(int i = low + 1; i <= high; i++)
			if(less(a[i], a[i - 1]))
				return false;
		return true;
	}

	// print
	private static void show(Comparable[] a) {
		for(int i = 0; i < a.length; i++) {
			StdOut.println(a[i]);
		}
	}

	// test
	public static void main(String[] args) {
		String[] a = StdIn.readAllStrings();
		BinaryInsertion.sort(a);
		show(a);
	}
}

