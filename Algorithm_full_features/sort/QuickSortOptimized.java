/**
 * Using the Hoare's 2-way partitioning scheme, chooses the partitioning element
 * using median-of-3, and cuts off to insertion sort.
 * The `QuickSortOptimized` class provides static methods for sorting an array using an optimized version of quicksort (using Hoare's 2-way partitioning algorithm, median-of-3 to choose the partitioning element, and cutoff to insertion sort).
 *
 */
public class QuickSortOptimized {
	private static final int INSERTION_SORT_CUTOFF = 8;

	private QuickSortOptimized () {}

	// rearranges the array in ascending order, using the natural order.
	public static void sort(Comparable[] a) {
		sort(a, 0, a.length - 1);
		assert isSorted(a);
	}

	private static void sort(Comparable[] a, int low, int high) {
		if(high <= low)
			return;
		int n = high - low + 1;
		if(n <= INSERTION_SORT_CUTOFF) {
			Insertion.sort(a, low, high + 1);
			return;
		}

		int j = partition(a, low, high);
		sort(a, low, j - 1);
		sort(a, j + 1, high);
	}

	// partition the subarray a[low, high] so that a[low, j - 1] <= a[j] <= a[j + 1, high] and return the index j.
	private static int partition(Comparable[] a, int low, int high) {
		int n = high - low + 1;
		int m = median3(a, low, low + n / 2, high);
		exchange(a, m, low);

		int i = low, j = high + 1;
		Comparable v = a[low];

		// a[low] is unique largest element
		while(less(a[++i], v)) {
			if(i == high) {
				exchange(a, low, high);
				return high;
			}
		}

		// a[low] is unique smallest element
		while(less(v, a[--j])) {
			if(j == low + 1)
				return low;
		}

		// the main loop
		while(i < j) {
			exchange(a, i, j);
			while(less(a[++i], v));
			while(less(v, a[--j]));
		}

		// put partitioning item v at a[j]
		exchange(a, low, j);

		return j;
	}

	// return the index of the median element among a[i], a[j], and a[k]
	private static int median3(Comparable[] a, int i, int j, int k) {
		return (less(a[i], a[j]) ? (less(a[j], a[k]) ? j : less(a[i], a[k]) ? k : i) : (less(a[k], a[j]) ? j : less(a[k], a[i]) ? k : i));
	}


	private static boolean less(Comparable v, Comparable w) {
		return v.compareTo(w) < 0;
	}

	// swap a[i] and a[j]
	private static void exchange(Object[] a, int i, int j) {
		Object swap = a[i];
		a[i] = a[j];
		a[j] = swap;
	}

	private static boolean isSorted(Comparable[] a) {
		for(int i = 1; i < a.length; i++) {
			if(less(a[i], a[i - 1]))
				return false;
		}

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

		QuickSortOptimized.sort(a);
		
		assert isSorted(a);
		show(a);
	}
}
