/**
 * Symbol table implementation with sequential search in an unordered linked
 * list of key-value pairs.
 * The `SequentialSearchST` class represents an (unordered) symbol table of 
 * generic key-value pairs.
 * It supports the usual `put`, `get`, `contains`, `delete`, `size`, and `is-empty`
 * methods.
 * It also provides a `keys` method for iterating over all of the keys.
 * A symbol table implements the `associative array` abstraction: when associating
 * a value with a key that is already in the symbol table, the convention is to 
 * replace the old value with the new value.
 * The class also uses the convention that values can't be `null`. Setting the value 
 * associated with a key to `null` is equivalent to deleting the key from the symbol
 * table.
 *
 * This implementation uses a singly-linked list and sequential search.
 * It relies on the `equals()` method to test whether two keys are equal. It does not
 * call either the `compareTo` or `hashCode()` method.
 * The `put` and `delete` operations take linear time; The `get` and `contains` operation
 * takes linear time in the worst case. The `size` and `is-empty` operation take constant
 * time. Construction takes constant time.
 *
 */
public class SequentialSearchST<Key, Value> {
	private int n;			// number of key-value pairs
	private Node first;		// the linked list of key-value pairs

	// helper linked list data type
	private class Node{
		private Key key;
		private Value val;
		private Node next;

		public Node(Key key, Value val, Node next) {
			this.key = key;
			this.val = val;
			this.next = next;
		}
	}

	// Initializes an empty symbol table
	public SequentialSearchST() {
		//
	}

	// Returns the number of key-value pairs in this symbol table.
	public int size() {
		return n;
	}

	// Returns true if this symbol table is empty.
	public boolean isEmpty() {
		return size() == 0;
	}

	// Returns true if this symbol table contains the specified key.
	public boolean contains(Key key) {
		if(key == null)
			throw new IllegalArgumentException("argument to contains() is null");
		return get(key) != null;
	}

	// Returns the value associated with the given key in this symbol table.
	public Value get(Key key) {
		if(key == null)
			throw new IllegalArgumentException("argument to get() is null");
		for(Node x = first; x != null; x = x.next) {
			if(key.equals(x.key))
				return x.val;
		}

		return null;
	}

	// Inserts the specified key-value pairs into the symbol table, overwriting 
	// the old value with the new value if the symbol table already contains the
	// specified key. Deletes the specified key(and its associated value) from this
	// symbol table if the specified value is `null`
	public void put(Key key, Value val) {
		if(key == null)
			throw new IllegalArgumentException("first argument to put() is null");
		if(val == null) {
			delete(key);
			return;
		}

		for(Node x = first; x != null; x = x.next) {
			if(key.equals(x.key)) {
				x.val = val;
				return;
			}
		}
		first = new Node(key, val, first);
		n++;
	}

	// Removes the specified key and its associated value from this symbol table(if 
	// the key is in this symbol table).
	public void delete(Key key) {
		if(key == null)
			throw new IllegalArgumentException("argument to delete() is null");
		first = delete(first, key);	
	}

	// delete key in linked list beginning at Node x
	// warning: function call stack too large if table is large
	private Noed delete(Node x, Key key) {
		if(x == null)
			return null;
		if(key.equals(x.key)) {
			n--;
			return x.next;
		}
		x.next = delete(x.next, key);
		return x;
	}

	// Returns all keys in the symbol table as an `Iterable`.
	// To iterate over all of the keys in the symbol table named `st`
	// use the foreach notation: `for(Key key: st.keys())`.
	public Iterable<Key> keys() {
		Queue<Key> queue = new Queue<Key>();
		for(Node x = first; x != null; x = x.next)
			queue.enqueue(x.key);
		return queue;
	}

	// test
	public static void main(String[] args) {
		SequentialSearchST<String, Integer> st = new SequentialSearchST<String, Integer>();
		for(int i = 0; !StdIn.isEmpty(); i++) {
			String key = StdIn.readString();
			st.put(key, i);
		}

		for(String s : st.keys()) {
			StdOut.println(s + " " + st.get(s));
		}
	}
}
