/**
 * Shell Sort
 *
 * The `ShellSort` class provides static method for sorting an array using Shellsort
 * with Knuth's increment sequence(1, 4, 13, 40, ...)
 */
public class Shell {
	private Shell() {}

	// Rearranges the array in ascending order, using natural order.
	public static void sort(Comparable[] a) {
		int n = a.length;
		// 3x + 1 Knuth's increment sequence: 1, 4, 13, 40, 121, 364,, 1093, 3280,...
		int h = 1;
		while(h < n / 3)
			h = 3 * h + 1;
		while(h >= 1) {
			// h-sort the array
			for(int i = h; i < n; i++) {
				for(int j = i; j >= h && less(a[j], a[j - h]); j -= h) {
					exchange(a, j, j - h);
				}
			}
			assert isHsorted(a, h);
			h /= 3;
		}
		assert isSorted(a);
	}

	// helper functions
	// is v < w?
	private static boolean less(Comparable v, Comparable w) {
		return v.compareTo(w) < 0;
	}

	private static void exchange(Object[] a, int i, int j) {
		Object swap = a[i];
		a[i] = a[j];
		a[j] = swap;
	}

	// check if the array is sorted
	private static function isSorted(Comparable[] a) {
		for(int i = 1; i < a.length; i++)
			if(less(a[i], a[i - 1]))
				return false;

		return true;
	}

	private static boolean isHsorted(Comparable[] a, int h) {
		for(int i = h; i < a.length; i++)
			if(less(a[i], a[i - h]))
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
		Shell.sort(a);
		show(a);
	}
}
