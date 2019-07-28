/**
 * Top to Down MergeSort
 *
 * The `TopDownMergeSort` class provides static methods for sorting an array using meregsort.
 *
 */
public class TopDownMergeSort {
	private TopDownMergeSort() {}

	// stably merge a[low, high] with a[mid + 1, high] using aux[low, high]
	private static void merge(Comparable[] a, Comparable[] aux, int low, int mid, int high) {
		// precondition: a[low, mid] and a[mid + 1, high] are already well sorted.
		assert isSorted(a, low, mid);
		assert isSorted(a, mid + 1, high);

		// copy to aux[]
		for(int k = low; k <= high; k++)
			aux[k] = a[k];

		// merge back to a[]
		int i = low;
		int j = mid + 1;
		for(int k = low; k <= high; k++) {
			if(i > mid)
				a[k] = aux[j++];
			else if(j > high)
				a[k] = aux[i++];
			else if(less(aux[j], aux[i]))
				a[k] = aux[j++];
			else
				a[k] = aux[i++];
		}

		// postcondition: a[low, high] is sorted
		assert isSorted(a, low, high);
	}

	// mergesort a[low, high] using auxiliary array aux[low, high]
	private static void sort(Comparable[] a, Comparable[] aux, int low, int high) {
		if(high <= low)
			return;
		int mid = low + (high - low) / 2;
		sort(a, aux, low, mid);
		sort(a, aux, mid + 1, high);
		merge(a, aux, low, mid, high);
	}

	// rearranges the array in ascending order, using the natural order.
	public static void sort(Comparable[] a) {
		Comparable[] aux = new Comparable[a.length];
		sort(a, aux, 0, a.length - 1);
		assert isSorted(a);
	}

	// helper functions.
	// is v < w ?
	private static boolean less(Comparable v, Comparable w) {
		return v.compareTo(w) < 0;
	}

	// check if the array is already sorted ?
	private static boolean isSorted(Comparable[] a) {
		return isSorted(a, 0, a.length - 1);
	}

	private static boolean isSorted(Comparable[] a, int low, int high) {
		for(int i = low + 1; i <= high; i++) {
			if(less(a[i], a[i - 1]))
				return false;

		}
		return true;
	}

	// index merge sort
	// stably merge a[low, mid] with a[mid + 1, high] using aux[low, high]
	private static void merge(Comparable[] a, int[] index, int[] aux, int low, int mid ,int high) {
		// copy to aux[]
		for(int k = low; k <= high; k++)
			aux[k] = index[k];
		// merge back to a[]
		int i = low;
		int j = mid + 1;
		for(int k = low; k <= high; k++) {
			if(i > mid)
				index[k] = aux[j++];
			else if(j > high)
				index[k] = aux[i++];
			else if(less(a[aux[j]], a[aux[i]]))
				index[k] = aux[j++];
			else
				index[k] = aux[i++];
		}
	}

	// Returns a permutation that gives the elements in the array in ascending order.
	public static int[] indexSort(Comparable[] a) {
		int n = a.length;
		int[] index = new int[n];
		for(int i = 0; i < n; i++)
			index[i] = i;

		int[] aux = new int[n];
		sort(a, index, aux, 0, n - 1);
		return index;
	}

	// mergesort a[low, high] using auxiliary array aux[low, high]
	private static void sort(Comparable[] a, int[] index, int[] aux, int low, int high) {
		if(high <= low)
			return;
		int mid = low + (high - low) / 2;
		sort(a, index, aux, low, mid);
		sort(a, index, aux, mid + 1, high);
		merge(a, index, aux, low, mid, high);
	}

	// print
	private static void show(Comparable[] a) {
		for(int i = 0; i < a.length; i++)
			StdOut.println(a[i]);
	}

	// test
	public static void main(String[] args) {
		String[] a = StdIn.readAllStrings();
		TopDownMergeSort.sort(a);
		show(a);
	}
}