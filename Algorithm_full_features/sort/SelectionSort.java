/**
 * Selection sort.
 *
 */
import java.util.Comparator;

/**
 * The `SelectionSort` class provides static methods for sorting an array using 
 * selection sort.
 *
 */
public class Selection {
	private Selection() {}

	// Rearranges the array in ascending order, using the natural order.
	public static void sort(Comparable[] a) {
		int n = a.length;
		for(int i = 0; i < n; i++) {
			int min = i;
			for(int j = i + 1; j < n; j++) {
				if(less(a[j], a[min]))
					min = j;
			}
			exchange(a, i, min);
			assert isSorted(a, 0, i);
		}
		assert isSorted(a);
	}

	// Rearranges the array in ascending order, using a comparator.
	public static void sort(Object[] a, Comparable comparator) {
		int n = a.length;
		for(int i = 0; i < n; i++) {
			int min = i;
			for(int j = i + 1; j < n; j++) {
				if(less(comparator, a[j], a[min]))
					min = j;
			}
			exchange(a, i, min);
			assert isSorted(a, comparator, 0, i);
		}
		assert isSorted(a, comparator);
	}

	// helper functions

	// is v < w ?
	private static boolean less(Comparable v, Comparable w) {
		return v.compareTo(w) < 0;
	}

	// is v < w ?
	private static boolean less(Comparator comparator, Object v, Object w) {
		return comparator.compare(v, w) < 0;
	}

	// exchange a[i] and a[j]
	private static void exchange(Object[] a, int i, int j) {
		Object swap = a[i];
		a[i] = a[j];
		a[j] = swap;
	}

	// check if array is sorted(for debug)
	private static boolean isSorted(Comparable[] a) {
		return isSorted(a, 0, a.length - 1);
	}

	private static boolean isSorted(Comparable[] a, int low, int high) {
		for(int i = low + 1; i <= high; i++)
			if(less(a[i], a[i - 1]))
				return false;
		return true;
	}

	private static boolean isSorted(Object[] a, Comparator comparator, int low, int high) {
		for(int i = low + 1; i <= high; i++)
			if(less(comparator, a[i], a[i - 1]))
				return false;
		return true;
	}

	// print
	private static void show(Comparable[] a) {
		for(int i = 0; i < a.length; i++)
			StdOut.println(a[i]);
	}

	// test
	public static void main(String[] args) {
		String[] a = StdIn.readAllStrings();
		SelectionSort.sort(a);
		show(a);
	}
}

