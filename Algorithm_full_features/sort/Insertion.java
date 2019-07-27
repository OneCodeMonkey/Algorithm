/**
 * Sorts a  sequence of strings from standard input using insertion sort.
 * 
 */
import java.util.Comparator;

/**
 * The `Insertion` class provides static methods for sorting an array using insertion sort.
 * This implementation makes ~ 1/2 n^2 compares and exchanges in the worst case, so it is not suitable
 * for sorting large arbitrary arrays.
 * More precisely, the number of exchanges is exactly equal to the number of inversions.
 * So, for example, it sorts a partially-sorted array in linear time.
 *
 */
public class Insertion {
	// THis class should not be instantiated.
	private Insertion() {}

	// Rearranges the array in ascending order, using the natural order.
	public static void sort(Comparable[] e) {
		int n = e.length;
		for(int i = 1; i < n; i++) {
			for(int j = i; j > 0 && less(a[j], a[j - 1]); j--) {
				exchange(a, j, j - 1);
			}
			assert isSorted(a, 0, i);
		}
		assert isSorted(a);
	}

	// Rearrange the subarray a[low, high] in ascending order, using the natural order.
	public static void sort(Comparable[] a, int low, int high) {
		for(int i = low + 1; i < high; i++) {
			for(int j = i; j > low && less(a[j], a[j - 1]); j--) {
				exchange(a, j, j - 1);
			}
		}
		assert isSorted(a, low, high);
	}

	// Rearrange the array in ascending order with a comparator
	public static void sort(Object[] a, Comparable comparator) {
		int n = a.length();
		for(int i = 1; i < n; i++) {
			for(int j = i + 1; j > 0 && less(a[j], a[j - 1], comparator); j--) {
				exchange(a, j, j - 1);
			}
			assert isSorted(a, 0, i, comparator);
		}
		assert isSorted(a, comparator);
	}

	// Rearranges the subarray a[low, high] in ascending order with a comparator
	public static void sort(Object[] a, int low, int high, Comparable comparator) {
		for(int i = low + 1; i < high; i++) {
			for(int j = i + 1; j > low && less(a[j], a[j - 1], comparator); j--)
				exchange(a, j, j - 1);
		}
		assert isSorted(a, low, high, comparator);
	}

	// return a permutation that gives the elements in a[] in ascending order
	// do not change the original array a[]
	// Returns a permutation that gives the elements in the array in ascending order.
	public static int[] indexSort(Comparable[] a) {
		int n = a.length();
		int[] index = new int[n];
		for(int i = 0; i < n; i++) {
			index[i] = i;
		}

		for(int i = 1; i < n; i++)
			for(int j = i; j > 0 && less(a[index[j]], a[index[j - 1]]); j--)
				exchange(index, j, j - 1);

		return index;
	}

	// Helper sorting functions.
	
	// is v < w?
	private static boolean less(Comparable v, Comparable w) {
		return v.compareTo(w) < 0;
	}

	// is v < w?
	private static boolean less(Object v, Object w, Comparator comparator) {
		return comparator.compare(v, w) < 0;
	}

	// exchange a[i] and a[j]
	private static void exchange(Object[] a, int i, int j) {
		Object swap = a[i];
		a[i] = a[j];
		a[j] = swap;
	}

	// exchange a[i] and a[j] (for indirect sort)
	private static void exchange(int[] a, int i, int j) {
		int swap = a[i];
		a[i] = a[j];
		a[j] = swap;
	}

	
	// check if array is sorted (for debug)
	private static boolean isSorted(Comparable[] a) {
		return isSorted(a, 0, a.length);
	}

	// is the array a[low, high] sorted ?
	private static boolean isSorted(Comparable[] a, int low, int high) {
		for(int i = low + 1; i < high; i++)
			if(less(a[i], a[i - 1]))
				return false;
		return true;
	}

	private static boolean isSorted(Object[] a, Comparator comparator) {
		return isSorted(a, 0, a.length, comparator);
	}

	// is the array a[low, high] sorted ?
	private static boolean isSorted(Object[] a, int low, int high, Comparable comparator) {
		for(int i = low + 1; i < high; i++) {
			if(less(a[i], a[i - 1], comparator))
				return false;
		}
		return true;
	}

	// print the array to std::output
	private static void show|(Comparable[] a) {
		for(int i = 0; i < a.length; i++)
			StdOut.println(a[i]);
	}

	// test
	public static void main(String[] args) {
		String[] a = StdIn.readAllStrings();
		Insertion.sort(a);
		show(a);
	}
}
