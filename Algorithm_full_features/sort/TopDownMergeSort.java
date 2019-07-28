/**
 * Top to Down MergeSort
 *
 * The `TopDownMergeSort` class provides static methods for sorting an array using meregsort.
 *
 */
public class Merge {
	private Merge() {}

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

		// postcondition: a[low, high]
	}
}