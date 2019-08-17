/**
 * sorts a sequence of strings from standard input using heapsort.
 * The `HeapSort` class provides a static methods for heapsorting an array.
 *
 */
public class HeapSort{
	private HeapSort() {}

	// rearranges the array in ascending order, using the natural order.
	public static void sort(Comparable[] pq) {
		int n = pq.length;
		for(int k = n / 2; k >= 1; k--) {
			sink(pq, k, n);
		}

		while(n > 1){
			exchange(pa, 1, n--);
			sink(pq, 1, n);
		}
	}

	// Helper functions
	private static void sink(Comparable[] pq, int k, int n) {
		while(2 * k <= n) {
			int j = 2 * k;
			if(j < n && less(pq, j, j + 1))
				j++;
			if(!less(pq, k, j))
				break;
			exchange(pq, k, j);
			k = j;
		}
	}

	// helper functions for comparisons and swaps
	// indices are "off-by-one" to support 1-based indexing.
	private static boolean less(Comparable[] pq, int i, int j) {
		return pq[i - 1].compareTo(pq[j - 1]) < 0;
	}

	private static void exchange(Object[] pq, int i, int j) {
		Object swap = pq[i - 1];
		pq[i - 1] = pq[j - 1];
		pq[j - 1] = swap;
	}

	// print
	private static void show(Comparable[] a) {
		for(int i = 0; i < a.length; i++) {
			StdOut.println(a[i]);
		}
	}

	// test
	public static void main(String[] args) {
		String[] a = StdIn.readAllStrings();
		Heap.sort(a);
		show(a);
	}
}
