/**
 * Read in a list of words from standard input and print out the most frequently
 * occurring word that has length greater than a given threshold
 * The `FrequencyCounter` class provides a client for reading in a sequence
 * of words and printing a word(exceeding a given length) that occurs most
 * frequently. It is useful as a test client for various symbol table
 * implementation.
 *
 */
public class FrequencyCounter {
	private FrequencyCounter() {}

	// reads in a cli integer and sequence of words from standard input and prints
	// out a word(whose length exceeds the threshold) that occurs most frequently
	// standard output. It also prints out the number of words whose length exceeds
	// the threshold and the number of distinct such words.
	public static void main(String[] args) {
		int distinct = 0, words = 0;
		int minLen = Integer.parseInt(args[0]);
		ST<String, Integer>st = new ST<String, Integer>();

		while(!StdIn.isEmpty()) {
			String key = StdIn.readString();
			if(key.length() < minLen)
				continue;
			words++;
			if(st.contains(key))
				st.put(key, st.get(key) + 1);
			else {
				st.put(key, 1);
				distinct++;
			}
		}	

		// find a key with the highest frequency count
		String max = "";
		st.put(max, 0);
		for(String word : st.keys()) {
			if(st.get(word) > st.get(max))
				max = word;
		}

		StdOut.println(max + " " + st.get(max));
		StdOut.println("distinct = " + distinct);
		StdOut.println("words = " + words);
	}
}
