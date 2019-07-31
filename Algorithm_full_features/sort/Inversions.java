/**
 * Read array of n integers and count number of inversions in O(nlogn)
 * The `Inversions` class provides static methods to count the number of inversions in either an array or comparables.
 * An inversion in an array a[] is a pair of indices i and j (i < j), such that a[i] > a[j]
 * This implementation uses a generalization of mergesort. The `count` operation takes time proportional to O(nlogn)
 * where n is the number of keys in this array(of comparables)
 *
 */
public class Inversions {
	private Inversions() {}

	private static long merge(int[] a, int[] aux, int low, int mid, int high) {
		long inversions = 0;
		for(int k = low; k <= high; k++)
			aux[k] = a[k];

		int i = low, j = mid + 1;
		for(int k = low; k <= high; k++) {
			if(i > mid)
				a[k] = aux[j++];
			else if(j > high)
				a[k] = aux[i++];
			else if(aux[j] < aux[i]) {
				a[k] = aux[j++];
				inversions += (mid - i + 1);
			} else {
				a[k] = aux[i++];
			}
		}
		return inversions;
	}

	// return the number of inversions in the subarray b[low, high]
	// side effect b[low, high] is rearranged in ascending order.
	private static long count(int[] a, int[] b, int[] aux, int low, int high) {
		long inversions = 0;
		if(high <= low)
			return 0;
		int mid = low + (high - low) / 2;
		inversions += count(a, b, aux, low, mid);
		inversions += count(a, b, aux, mid + 1, high);
		inversions += merge(b, aux, low, mid, high);
		assert inversions == brute(a, low, high);

		return inversions;
	}

	// returns the number of inversions in the integer array.
	public static long count(int[] a) {
		int[] b = new int[a.length];
		int[] aux = new int[a.length];
		for(int i = 0; i < a.length; i++)
			b[i] = a[i];
		long inversions = count(a, b, aux, 0, a.length - 1);

		return inversions;
	}

	// merge and count (Comparable version)
	private static <Key extends Comparable<Key>> long merge(Key[] a, Key[] aux, int low, int mid, int high) {
		long inversions = 0;
		for(int k = low; k <= high; k++)
			aux[k] = a[k];

		int i = low, j = mid + 1;
		for(int k = low; k <= high; k++) {
			if(i > mid)
				a[k] = aux[j++];
			else if(j > high)
				a[k] = aux[i++];
			else if(less(aux[j], aux[i])) {
				a[k] = aux[j++];
				inversions += (mid - i + 1);
			} else {
				a[k] = aux[i++];
			}
		}
		return inversions;
	}

	// return the number of inversions in the subarray b[low, high]
	// side effect b[low, high] is rearranged in ascending order.
	private static <Key extends Comparable<Key>> long count(Key[] a, Key[] b, Key[] aux, int low, int high) {
		long inversions = 0;
		if(high <= low)
			return 0;
		int mid = low + (high - low) / 2;
		inversions += count(a, b, aux, low, mid);
		inversions += count(a, b, aux, mid + 1, high);
		inversions += merge(b, aux, low, mid, high);
		assert inversions == brute(a, low, high);

		return inversions;
	}

	// return the number of inversions in the comparable array.
	// the argument array will not be modified
	public static <Key extends Comparable<Key>> long count(Key[] a) {
		Key[] b = a.clone();
		Key[] aux = a.clone();
		long inversions = count(a, b, aux, 0, a.length - 1);

		return inversions;
	}

	// is v < w ?
	private static <Key extends Comparable<Key>> boolean less(Key v, Key w) {
		return (v.compareTo(w) < 0);
	}

	// count number of inversions in a[low, high] via brute force (for debug)
	private static <Key extends Comparable<Key>> long brute(Key[] a, int low, int high) {
		long inversions = 0;
		for(int i = low; i <= high; i++)
			for(int j = i + 1; j <= high; j++)
				if(less(a[j], a[i]))
					inversions++;

		return inversions;
	}

	// count number of inversions in a[low, high] via brute force (for debug)
	private static long brute(int[] a, int low, int high) {
		long inversions = 0;
		for(int i = low; i <= high; i++)
			for(int j = i + 1; j <= high; j++)
				if(a[j] < a[i])
					inversions++;

		return inversions;
	}

	// test
	public static void main(String[] args) {
		int[] a = StdIn.readAllInts();
		int n = a.length;
		Integer[] b = new Integer[n];
		for(int i = 0; i < n; i++)
			b[i] = a[i];

		StdOut.println(Inversions.count(a));
		StdOut.println(Inversions.count(b));
	}
}

