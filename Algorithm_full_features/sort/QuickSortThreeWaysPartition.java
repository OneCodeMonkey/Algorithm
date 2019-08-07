/**
 * sorts a sequence of strings from standard input using 3-way quicksort
 * The `QuickSortThreeWays` class provides static method for sorting an array using quicksort
 * with 3-way partitioning.
 *
 */
public class QuickSortThreeWaysPartition {
	private QuickSortThreeWaysPartition() {}

	public static void sort(Comparable[] a) {
		StdRandom.shuffle(a);
		sort(a, 0, a.length - 1);
		assert isSorted(a);
	}

	private static void sort(Comparable[] a, int low, int high) {
		if(high <= low)
			return;
		int lt = low, gt = high;
		Comparable v = a[low];
		int i = low + 1;
		while(i <= gt) {
			int cmp = a[i].compareTo(v);
			if(cmp < 0)
				exchange(a, lt++, i++);
			else if(cmp > 0)
				exchange(a, i, gt--);
			else
				i++;
		}

		sort(a, low, lt - 1);
		sort(a, lt + 1, high);
		assert isSorted(a, low, high);
	}

	// is v < w ?
	private static boolean less(Comparable v, Comparable w) {
		return v.compareTo(w) < 0;
	}

	// exchange a[i] and a[j]
	private static void exchange(Object[] a, int i, int j) {
		Object swap = a[i];
		a[i] = a[j];
		a[j] = swap;
	}

	private static boolean isSorted(Comparable[] a) {
		return isSorted(a, 0, a.length - 1);
	}

	private static boolean isSorted(Comparable[] a, int low, int high) {
		for(int i = low + 1; i <= high; i++)
			if(less(a[i], a[i - 1]))
				return false;

		return true;
	}

	private static void show(Comparable[] a) {
		for(int i = 0; i < a.length; i++)
			StdOut.println(a[i]);
	}

	// test
	public static void main(String[] args) {
		String[] a = StdIn.readAllStrings();
		QuickSortThreeWaysPartition.sort(a);
		show(a);
	}
}
