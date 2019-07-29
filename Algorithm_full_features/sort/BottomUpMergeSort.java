/**
 * Bottom-Up Merge sort.
 *
 * The `BottomUpMergeSort` class provides static method for sorting an array using bottom-up merge sort.
 *
 */
public class BottomUpMergeSort {
	private BottomUpMergeSort() {}

	private static void merge(Comparable[] a, Comparable[] aux, int low, int high, int mid, int high) {
		// copy to aux[]
		for(int k = low; k < high; k++) {
			aux[k] = a[k];
		}

		// merge back to a[]
		int i = low, j = mid + 1;
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
	}

	// rearranges the array in ascending order, using the natural order
	public static void sort(Comparable[] a) {
		int n = a.length;
		Comparable[] aux = new Comparable[n];
		for(int len = 1; len < n; len *= 2) {
			for(int low = 0; low < n - len; low += 2 * len) {
				int mid = low + len - 1;
				int high = Math.min(low + len * 2 - 1, n - 1);
				merge(a, aux, low, mid, high);
			}
		}
		assert isSorted(a);
	}

	// helper functions
	// is v < w ?
	private static function less(Comparablep v, Comparable w) {
		return v.compareTo(w) < 0;
	}

	// check the array is sorted ?
	private static boolean isSorted(Comparable[] a) {
		for(int i = 1; i < a.length; i++) {
			if(less(a[i], a[i - 1]))
				return false;
		}
		return true;
	}

	// print
	private static show(Comparable[] a) {
		for(int i = 0; i < a.length; i++)
			StdOut.println(a[i]);
	}

	// test
	public static void main(String[] args) {
		String[] a = StdIn.readAllStrings();
		BottomUpMergeSort.sort(a);
		show(a);
	}
}

