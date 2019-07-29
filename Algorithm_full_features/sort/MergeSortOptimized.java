/**
 * an optimized version of mergesort
 * The `MergeSortOptimized` class provides static method for sorting an array using an optimized version of mergesort.
 *
 */
improt java.util.Comparator;

public class MergeSortOptimized {
	private MergeSortOptimized() {}

	private static final int CUTOFF = 7;

	private static void merge(Comparable[] src, Comparable[] dst, int low, int mid, int high) {
		// precondition: src[low, mid] and src[mid + 1,  high] is already sorted.
		assert isSorted(src, low, mid);
		assert isSorted(src, mid + 1, high);

		int i = low, j = mid + 1;
		for(int k = low; k <= high; k++) {
			if(i > mid)
				dst[k] = src[j++];
			else if(j > high)
				dst[k] = src[i++];
			else if(less(src[j], src[i]))
				dst[k] = src[j++];
			else
				dst[k] = src[i++];
		}

		assert isSorted(dst, low, high);
	}

	private static void sort(Comparable[] src, Comparable[] dst, int low, int high) {
		if(high <= low + CUTOFF) {
			insertionSort(dst, low, high);
			return;
		}
		int mid = low + (high - low) / 2;
		sort(dst, src, low, mid);
		sort(dst, src, mid + 1, high);

		if(!less(src[mid + 1], src[mid])) {
			System.arraycopy(src, low, dst, low, high - low + 1);
			return;
		}

		merge(src, dst, low, mid, high);
	}

	// rearrange the array in ascending order, using the natural order.
	public static void sort(Comparable[] a) {
		Comparable[] aux = a.clone();
		sort(aux, a, 0, a.length - 1);
		assert isSorted(a);
	}

	// sort from a[low] to a[high] using insertion sort
	private static void insertionSort(Comparable[] a, int low, int high) {
		for(int i = low; i <= high; i++)
			for(int j = i; j > low && less(a[j], a[j - 1]); j--) {
				exchange(a, j, j - 1);
			}
	}

	// utility methods
	// exchange a[i] and a[j]
	private static void exchange(Object[] a, int i, int j) {
		Object swap = a[i];
		a[i] = a[j];
		a[j] = swap;
	}

	// is a[i] < a[j] ?
	private static boolean less(Comparable a, Comparable b) {
		return a.compareTo(b) < 0;
	}

	// is a[i] < a[j] ?
	private static boolean less(Object a, Object b, Comparator comparator) {
		return comparator.compare(a, b) < 0;
	}


	// version that takes Comparator as argument.
	// rearrange the array in ascending order, using the provided order.
	public static void sort(Object[] a, Comparator comparator) {
		Object[] aux = a.clone();
		sort(aux, a, 0, a.length - 1, comparator);
		assert isSorted(a, comparator);
	}

	private static void merge(Object[] src, Object[] dst, int low ,int mid, int high, Comparator comparator) {
		assert isSorted(src, low, mid, comparator);
		assert isSorted(src, mid + 1, high, comparator);

		int i = low, j = mid + 1;
		for(int k = low; k <= high; k++) {
			if(i > mid)
				dst[k] = src[j++];
			else if(j > high)
				dst[k] = src[i++];
			else if(less(src[i], src[j], comparator))
				dst[k] = src[j++];
			else
				dst[k] = src[i++];
		}

		assert isSorted(dst, low, high, comparator);
	}

	private static void sort(Object[] src, Object[] dst, int low, int high, Comparator comparator) {
		if(high <= low + CUTOFF) {
			insertionSort(dst, low, high, comparator);
			return;
		}
		int mid = low + (high - low) / 2;
		sort(dst, src, low, mid, comparator);
		sort(dst, src, mid + 1, high, comparator);

		if(!less(src[mid + 1], src[mid], comparator)) {
			System.arraycopy(src, low, dst, low, high - low + 1);
			return;
		}

		merge(src, dst, low, mid, high, comparator);
	}

	// sort from a[low] to a[high] using insertion sort.
	private static void insertionSort(Object[] a, int low, int high, Comparator comparator) {
		for(int i = low; i <= high; i++)
			for(int j = i; j > low && less(a[j], a[j - 1], comparator); j--)
				exchange(a, j, j - 1);
	}


	// check if the array is already sorted.
	private static boolean isSorted(Comparable[] a) {
		return isSorted(a, 0, a.length - 1);
	}

	private static boolean isSorted(Comparable[] a, int low, int high) {
		for(int i = low + 1; i <= high; i++)
			if(less(a[i], a[i - 1]))
				return false;

		return true;
	}

	private static boolean isSorted(Object[] a, Comparator comparator) {
		return isSorted(a, 0, a.length - 1, comparator);
	}

	private static boolean isSorted(Object[] a, int low, int high, Comparator comparator) {
		for(int i = low + 1; i <= high; i++)
			if(less(a[i], a[i - 1]))
				return false;

		return true;
	}

	// print
	private static void show(Object[] a) {
		for(int i = 0; i < a.length; i++)
			StdOut.println(a[i]);
	}

	// test
	public static void main(String[] args) {
		String[] a = StdIn.readAllStrings();
		MergeSortOptimized.sort(a);
		show(a);
	}
}

