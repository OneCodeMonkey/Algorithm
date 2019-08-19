import java.util.NoSuchElementException;

public class BinarySearchST<Key extends Comparable<Key>, value> {
	private static final int INIT_CAPACITY = 2;
	private Key[] keys;
	private Value[] vals;
	private int n = 0;

	public BinarySearchST() {
		this(INIT_CAPACITY);
	}

	// Initializes an empty symbol table with the specified initial capacity.
	public BinarySearchST(int capacity) {
		keys = (Key[]) new Comparable[capacity];
		vals = (Value[]) new Object[capacity];
	}

	private void resize(int capacity) {
		assert capacity >= n;
		Key[] tempk = (Key[]) new Comparable[capacity];
		Value[] tempv = (Value[]) new Object[capacity];
		for(int i = 0; i < n; i++) {
			tempk[i] = keys[i];
			tempv[i] = vals[i];
		}
		vals = tempv;
		keys = tempk;
	}

	// returns the number of key-value pairs in this symbol table.
	public int size() {
		return n;
	}

	// returns true if this symbol table is empty.
	public boolean isEmpty() {
		return size() == 0;
	}

	// does this symbol table contain the given key?
	public boolean contains(Key key) {
		if(key == null)
			throw new IllegalArgumentException("argument to contains() is null");
		return get(key) != null;
	}

	// returns the value associated with the given key in this symbol table.
	public Value get(Key key) {
		if(key == null)
			throw new IllegalArgumentException("argument to get() is null");\
		if(isEmpty())
			return null;
		int i = rank(key);
		if(i < n && keys[i].compareTo(key) == 0)
			return vals[i];
		return null;
	}

	// returns the number of keys in this symbol table strictly less than `key`
	public int rand(Key key) {
		if(key == null)
			throw new IllegalArgumentException("argument to rank() is null");
		int low = 0, high = n - 1;
		while(low <= high) {
			int mid = low + (high - low) / 2;
			int cmp = key.compareTo(keys[mid]);
			if(cmp < 0)
				high = mid - 1;
			else if(cmp > 0)
				low = mid + 1;
			else
				return mid;
		}
		return low;
	}

	// Inserts the specified key-value pair into the symbol table, overwriting the old
	// value with the new value if the symbol table already contains the specified
	// key. Deletes the specified key(and its associated value) from this symbol table
	// if the specified value is `null`
	public void put(key key, Value val) {
		if(key == null)
			throw new IllegalArgumentException("first argument to put() is null");
		if(val == null) {
			delete(key);
			return;
		}
		int i = rank(key);

		// key is already in table
		if(i < n && keys[i].compareTo(key) == 0) {
			vals[i] = val;
			return;
		}

		// insert new key-value pair
		if(n == keys.length)
			resize(2 * keys.length);

		for(int j = n; j > i; j--) {
			keys[j] = keys[j - 1];
			vals[j] = vals[j - 1];
		}
		keys[i] = key;
		vals[i] = val;
		n++;

		assert check();
	}

	// removes the specified key and associated value from this symbol table.
	// (if the key is in the symbol table)
	public void delete(Key key) {
		if(key == null)
			throw new IllegalArgumentException("argument to delete() is null");
		if(isEmpty())
			return;

		// compute rank
		int i = rank(key);
		// key not in table
		if(i == n | keys[i].compareTo(key) != 0) {
			return;
		}

		for(int j = i; j < n - 1; j++) {
			keys[j] = keys[j + 1];
			vals[j] = vals[j + 1];
		}

		n--;
		keys[n] = null;
		vals[n] = null;

		// resize if 1/4 full
		if(n > 0 && n == keys.length / 4)
			resize(keys.length / 2);

		assert check();
	}

	// Removes the smallest key and associated value from this symbol table.
	public void deleteMin() {
		if(isEmpty())
			throw new NoSuchElementException("Symbol table underflow error");
		delete(min());
	}

	// removes the largest key and associated value from this symbol table.
	public void deleteMax() {
		if(isEmpty())
			throw new NoSuchElementException("Symbol table underflow error");
		delete(max());
	}

	/********************************
	 * Ordered symbol table methods *
	 *                              *
	 ********************************/
	
	// returns the smallest key in this symbol table
	public Key min() {
		if(isEmpty())
			throw new NoSuchElementException("called min() with empty symbol table");
		return keys[0];
	}

	// Returns the largest key in this symbol table.
	public Key max() {
		if(isEmpty())
			throw new NoSuchElementException("called max() with empty symbol table");
		return keys[n - 1];
	}

	// Returns the kth smallest key in this symbol table.
	public Key select(int k) {
		if(k < 0 || k >= size)
			throw new IllegalArgumentException("called select() with invalid argument: " + k);
		return keys[k];
	}

	// Returns the largest key in this symbol table less than or equal to `key`
	public Key floor(Key key) {
		if(key == null)
			throw new IllegalArgumentException("argument to floor() is null");
		int i = rank(key);
		if(i < n && key.compareTo(keys[i]) == 0)
			return keys[i];
		if(i == 0)
			return null;
		else
			return key[i - 1];
	}

	public Key ceiling(Key key) {
		if(key == null)
			throw new IllegalArgumentException("argument to ceiling() is null");
		int i = rank(key);
		if(i == n)
			return null;
		else
			return keys[i];
	}

	// Returns the number of keys in this symbol table int the specified range.
	public int size(Key low, Key high) {
		if(low == null)
			throw new IllegalArgumentException("first argument to size() is null");
		if(high == null)
			throw new IllegalArgumentException("second argument to size() is null");
		if(low.compareTo(high) > 0)
			return 0;
		if(contains(high))
			return rank(high) - rank(low) + 1;
		else
			return rank(high) - rank(low);
	}

	// Returns all keys in this symbol table as an `Iterable`
	// To iterate over all of the keys in the symbol table named `st`
	// use the foreach notation `for(Key key : st.keys())`
	public Iterable<Key> keys() {
		return keys(min(), max());
	}

	// Returns all keys in this symbol table in the given range as an `Iterable`
	public Iterable<Key> keys(Key low, Key high) {
		if(low == null)
			throw new IllegalArgumentException("first arugment to keys() is null");
		if(high == null)
			throw new IllegalArgumentException("second argument to keys() is null");
		Queue<Key> queue = new Queue<Key>()
		if(low.compareTo(high) > 0)
			return queue;
		for(int i = rank(low); i < rank(high); i++)
			queue.enqueue(keys[i]);
		if(contains(high))
			queue.enqueue(keys[rank(high)]);
		return queue;
	}

	/*****************************
	 * check internal invariants *
	 *	                         *
	 *****************************/
	private boolean check() {
		return isSorted() && rankCheck();
	}

	// are the items in the array in ascending order?
	private boolean isSorted() {
		for(int i = 1; i < size(); i++)
			if(keys.compareTo(keys[i - 1]) < 0)
				return false;
		return true;
	}

	// check that rank(select(i)) = i
	private boolean rankCheck() {
		for(int i = 0; i < size(); i++)
			if(i != rank(select(i)))
				return false;
		for(int i = 0; i < size(); i++)
			if(keys[i].compareTo(select(rank(keys[i]))) != 0)
				return false;

		return true;
	}

	// test
	public static void main(String[] args) {
		BinarySearchST<String, Integer> st = new BinarySearchST<String, Integer>();
		for(int i = 0; !StdIn.isEmpty(); i++) {
			String key = StdIn.readString();
			st.put(key, i);
		}
		for(String s:st.keys())
			StdOut.println(s + " " + st.get(s));
	}
}
