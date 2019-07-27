/**
 * Reads in a list of strings and prints them in random order.
 * The Knuth shuffling algorithm guarantees to rearrange the elements
 * in uniformly random order, under the assumption that Math.random()
 * generates independent and uniformly distributed numbers between 0 and
 * 1.
 *
 */

public class KnuthShuffle {
	private KnuthShuffle {}

	public static void shuffle(Object[] a) {
		int n = a.length;
		// n 轮洗牌
		for(int i = 0; i < n; i++) {
			int r = (int)(Math.random() * (i + 1));
			Object swap = a[r];
			a[r] = a[i];
			a[i] = swap;
		}
	}

	/**
	 * Rearranges an array of objects in uniformly random order
	 *
	 * @param a: the array to be shuffled
	 *
	 */
	public static shuffleAlternative(Object[] a) {
		int n = a.length;
		for(int i = 0; i < n; i++) {
			int r = i + (int)(Math.random() * (n - i));
			Object swap = a[r];
			a[r] = a[i];
			a[i] = swap;
		}
	}

	public static void main(String[] args) {
		String[] a = StdIn.readAllStrings();

		KnuthShuffle.shuffle(a);

		for(int i = 0; i < a.length; i++)
			StdOut.println(a[i]);
	}
}
