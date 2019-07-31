/**
 * Sorts a sequence of strings from standard input using Quicksort
 *
 * The `QuickSort` class provides static methods for sorting an array and selecting the ith smallest
 * element in an array using quicksort.
 *
 */
public class QuickSort {
	private QuickSort() {}

	// Rearranges the array in ascending order, using the natural order.
	public static void sort(Comparable[] a) {
		StdRandom.shuffle(a);
		sort(a, 0, a.length - 1);
		assert isSort(a);
	}

	// quicksort the subarray from a[low] to a[high]
	private static void sort(Comparable[] a, int low, int high) {
		if(high <= low)
			return;
		int j = partition(a, low, high);
		sort(a, low, j - 1);
		sort(a, j + 1, high);
		assert isSorted(a, low, high);
	}

	// partition the subarray a[low, high] so that a[low, ... j - 1] <= a[j] <= a[j + 1, ... high]
	// and return the index j
	private static int partition(Comparable[] a, int low, int high) {
		int i = low;
		int j = high + 1;
		Comparable v = a[low];
		while(1) {
			while(less(a[++i], v)) {
				if(i == high)
					break;
			}
			// find item on high to swap
			while(less(v, a[--j]))
				if(j == low)
					break;
			if(i >= j)
				break;

			exchange(a, i, j);
		}

		exchange(a, low, j);

		return j;
	}

	// rearranges the array so that a[k] contains the kth smallest key;
	// a[0] through a[k - 1] are less than (or equal to) a[k]; and a[k + 1] through a[n - 1] are greater
	// than (or equal to) a[k]
	public static Comparable select(Comparable[] a, int k) {
		if(k < 0 || k >= a.length)
			throw new IllegalArgumentException("index is not between 0 and " + a.length + ": " + k);
		StdRandom.shuffle(a);
		int low = 0, high = a.length - 1;
		while(high >= low) {
			int i = partition(a, low, high);
			if(i > k)
				high = i - 1;
			else if(i < k)
				low = i + 1;
			else 
				return a[i];
		}

		return a[low];
	}

	// is v < w ?
	private static boolean less(Comparable v, Comparable w) {
		if(v == w)
			return false;
		return v.compareTo(w) < 0;
	}

	// exchange a[i] and a[j]
	private static void exchange(Object[] a, int i, int j) {
		Object swap = a[i];
		a[i] = a[j];
		a[j] = swap;
	}

	// check if the array is sorted ?
	private static boolean isSorted(Comparable[] a) {
		return isSorted(a, 0, a.length - 1);
	}

	private static boolean isSorted(Comparable[] a, int low, int high) {
		for(int i = low + 1; i <= high; i++)
			if(less(a[i], a[i - 1]))
				return false;

		return true;
	}

	// print the array
	private static void show(Comparable[] a) {
		for(int i = 0; i < a.length; i++)
			StdOut.println(a[i]);
	}

	// test
	public static void main(String[] args) {
		String[] a = StdIn.readAllStrings();
		QuickSort.sort(a);
		show(a);

		assert isSorted(a);

		StdRandom.shuffle(a);

		StdOut.println();
		for(int i = 0; i < a.length; i++) {
			String ith = (String)QuickSort.select(a, i);
			StdOut.println(ith);
		}
	}
}

