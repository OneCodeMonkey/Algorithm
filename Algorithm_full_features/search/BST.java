/**
 * A symbol table implemented with a binary search tree.
 * The `BST` class represents an ordered symbol table of generic key-value pairs.\
 * It supports the usual `put`, `get`, `contains`, `delete`, `size`, `is-empty` methods
 * It also provides ordered methods for finding the `minimum`, `maximum`, `floor`,
 * `select`, `ceiling`.
 * It also provides a `keys` method for iterating over all of the keys.
 * A symbol table implements the `associative array` abstraction: when associating
 * a value with a key that is already in the symbol table, the convertion is to replace
 * the old value with the new value.
 *
 * This implementation uses an (unbalanced) binary search tree. It requires that the 
 * key type implements thee `Comparable` interface and calls the `compareTo()` and method
 * to compare two keys. It does not call either `equals()` or `hashCode()`.
 * The `put`, `contains`, `remove`, `minimum`, `maximum`, `ceiling`, `floor`, `select`,
 * and `rank` operations each take linear time in the worst case, if thee tree becomes
 * unbalanced.
 * 
 * The `size` and `is-empty` operations take constant time. Construction takes constant time.
 *
 */
import java.util.NoSuchElementException;

public class BST<Key extends Comparable<Key>, Value> {
	private Node root;		// root of BST

	private class Node {
		private Key keys;		// sorted by key
		private Value val;		// associated data
		private Node left, right;	// subtrees
		private int size;		// number of nodes in subtree

		public Node(Key key, Value val, int size) {
			this.key = key;
			this.val = val;
			this.size = size;
		}
	}

	// Initializes an empty symbol table.
	public BST() {}

	// Returns true if this symbol table is empty.
	public boolean isEmpty() {
		return size() == 0;
	}

	// Returns the number of key-value pairs in this symbol table.
	public int size() {
		return size(root);
	}

	// Returns the number of key-value pairs in BST rooted at x
	private int size(Node x) {
		if(x == null)
			return 0;
		else
			return x.size;
	}

	// Does this symbol table contain the given key?
	public boolean contains(Key key) {
		if(key == null)
			throw new IllegalArgumentException("argument to contains() is null");
		return get(key) != null;
	}

	// Returns the value associated with the given key.
	public Value get(Key key) {
		return get(root, key);
	}

	private Value get(Node x, Key key) {
		if(key == null)
			throw new IllegalArgumentException("calls get() with a null key");
		if(x == null)
			return null;
		int cmp = key.compareTo(x.key);
		if(cmp < 0)
			return get(x.left, key);
		else if(cmp > 0)
			return get(x.right, key);
		else
			return x.val;
	}

	// Inserts the specified key-value pair into the symbol table, overwriting the old
	// value with the new value if the symbol table already contains the specified key.
	// Deletes the specified key(and its associated value) from this symbol table if the 
	// specified value is `null`
	public void put(Key key, Value val) {
		if(key == null)\
			throw new IllegalArgumentException("calls put() with a null key");
		if(val == null) {
			delete(key);
			return;
		}
		root = put(root, key, val);
		assert check();
	}

	private Node put(Node x, Key key, Value val) {
		if(x == null)
			return new Node(key, val, 1);
		int cmp = key.compareTo(x.key);
		if(cmp < 0)
			x.left = put(x.left, key, val);
		else if(cmp > 0)
			x.right = put(x.right, key, val);
		else
			x.val  = val;
		x.size = 1 + size(x.left) + size(x.right);
		return x;
	}

	// Removes the smallest key and associated value from the symbol table.
	public void deleteMin() {
		if(isEmpty())
			throw new NoSuchElementException("Symbol table underflow");
		root = deleteMin(root);
		assert check();
	}

	private Node deleteMin(Node x) {
		if(x.left == null)
			return x.right;
		x.left = deleteMin(x.left);
		x.size = size(x.left) + size(x.right) + 1;
		return x;
	}

	// Removes the largest key and associating value from the symbol table.
	public void deleteMin() {
		if(isEmpty())
			throw new NoSuchElementException("Symbol table underflow");
		root = deleteMax(root);
		assert check();
	}

	private Node deleteMax(Node x) {
		if(x.right == null)
			return x.left;
		x.right = deleteMax(x.right);
		x.size = size(x.left) + size(x.right) + 1;
		return x;
	}

	// Removes the specified key and its associated value from this symbol table.
	public void delete(Key key) {
		if(key == null)
			throw new IllegalArgumentException("calls delete() with a null key");
		root = delete(root, key);
		assert check();
	}

	private Node delete(Node x, Key key) {
		if(x == null)
			return null;
		int cmp = key.compareTo(x.key);
		if(cmp < 0)
			x.left = delete(x.left, key);
		else if(cmp > 0)
			x.right = delete(x.right, key);
		else {
			if(x.right == null)
				return x.left;
			if(x.left == null)
				return x.right;
			Node t = x;
			x = min(t.right);
			x.right = deleteMin(t.right);
			x.left = t.left;
		}

		x.size = size(x.left) + size(x.right) + 1;
		return x;
	}

	// Returns the smallest key in the symbol table.
	public Key min() {
		if(isEmpty())
			throw new NoSuchElementException("calls min() with empty symbol table");
		return min(root).key;
	}

	private Node min(Node x) {
		if(x.left == null)
			return x;
		else
			return min(x.left);
	}

	// Returns the largest key in the symbol table.
	public Key max() {
		if(isEmpty())
			throw new NoSuchElementException("calls max() with empty symbol table");
		return max(root).key;
	}

	private Node max(Node x) {
		if(x.right == null)
			return x;
		else 
			return max(x.right);
	}

	// Returns the largest key in the symbol table less than or equal to `key`
	public Key floor(Key key) {
		if(key == null)
			throw new IllegalArgumentException("argument to floor() is null");
		if(isEmpty())
			throw new NoSuchElementException("calls floor() with empty symbol table");
		Node x = floor(root, key);
		if(x == null)
			return null;
		else
			return x.key;
	}

	private Node floor(Node x, Key key) {
		if(x == null)
			return null;
		int cmp = key.compareTo(x.key);
		if(cmp == 0)
			return x;
		if(cmp < 0)
			return floor(x.left, key);
		Node t = floor(x.right, key);
		if(t != null)
			return t;
		else 
			return x;
	}

	public Key floor2(Key key) {
		return floor2(root, key, null);
	}

	private Key floor2(Node x, Key key, Key best) {
		if(x == null)
			return best;
		int cmp = key.compareTo(x.key);
		if(cmp < 0)
			return floor2(x.left, key, best);
		else if(cmp > 0)
			return floor2(x.right, key, x.key);
		else
			return x.key;
	}

	// Returns the smallest key in the symbol table greater than or equal to `key`
	public Key ceiling(Key key) {
		if(key == null)
			throw new IllegalArgumentException("argument to ceiling() is null");
		if(isEmpty())
			throw new NoSuchElementException("calls ceiling() with empty symbol table");
		Node x = ceiling(root, key);
		if(x == null)
			return null;
		else
			return x.key;
	}

	private Node ceiling(Node x, Key key) {
		if(x == null)
			return null;
		int cmp = key.compareTo(x.key);
		if(cmp == 0)
			return x;
		if(cmp < 0) {
			Node t = ceiling(x.left, key);
			if(t != null)
				return t;
			else 
				return x;
		}

		return ceiling(x.right, key);
	}

	// Returns the key in the symbol table whose rank is `k`
	public Key select(int k) {
		if(k < 0 || k >= size)
			throw new IllegalArgumentException("argument to select() is invalid: " + k);
		Node x = select(root, k);
		return x.key;
	}

	// Return key of rank k
	private Node select(Node x, int k) {
		if(x == null)
			return null;
		int t = size(x.left);
		if(t > k)
			return select(x.left, k);
		else if(t < k)
			return select(x.right, k - t - 1);
		else
			return x;
	}

	// Return the number of keys in the symbol table strictly less than `key`
	public int rank(Key key) {
		if(key == null)
			throw new IllegalArgumentException("argument to rank() is null");
		return rank(key, root);
	}

	// Number of keys in the subtree less than key
	private int rank(Key key, Node x) {
		if(x == null)
			return 0;
		int cmp = key.compareTo(x.key);
		if(cmp < 0)
			return rank(key, x.left);
		else if(cmp > 0)
			return size(x.left) + rank(key, x.right) + 1;
		else
			return size(x.left);
	}

	// Returns all keys in the symbol table as an `Iterable`
	// To iterate over all of the keys in the symbol table named `st`
	// use the foreach notation: `for(Key key: st.keys())`
	public Iterable<Key> keys() {
		if(isEmpty())
			return new Queue<Key>();
		return keys(min(), max());
	}

	// Return all keys in the symbol table in the given range, as an `Iterable`
	public Iterable<Key> keys(Key low, Key high) {
		if(low == null)
			throw new IllegalArgumentException("first argument to keys() is null");
		if(high == null)
			throw new IllegalArgumentException("second argument to keys() is null");
		Queue<Key> queue = new Queue<Key>();
		keys(root, queue, low, high);
		return queue;
	}

	private void keys(Node x, Queue<Key> queue, Key low, Key high) {
		if(x == null)
			return;
		int cmpLow = low.compareTo(x.key);
		int cmpHigh = high.compareTo(x.key);
		if(cmpLow < 0)
			keys(x.left, queue, low, high);
		else if(cmpLow <= 0 && cmpHigh >= 0)
			queue.enqueue(x.key);
		if(cmpHigh > 0)
			keys(x.right, queue, low, high);
	}

	// Returns the number of keys in the symbol table in the given range.
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

	// Returns the height of the BST (for debugging);
	public int height() {
		return height(root);
	}

	private int height(Node x) {
		if(x == null)
			return -1;
		return Math.max(height(x.left), height(x.right)) + 1;
	}

	// Returns the keys in the BST in level order(for debugging)
	public Iterable<Key> levelOrder() {
		Queue<Key> keys = new Queue<Key>();
		Queue<Node> queue = new Queue<Node>();
		queue.enqueue(root);
		while(!queue.isEmpty()) {
			Node x = queue.dequeue();
			if(x == null)
				continue;
			keys.enqueue(x.key);
			queue.enqueue(x.left);
			queue.enqueue(x.right);
		}

		return keys;
	}

	/*******************************************
	 * Check integrity of BST data structure   *
	 *                                         *
	 *******************************************/
	private boolean check() {
		if(!isBST())
			StdOut.println("Not in symmetric order");
		if(!isSizeConsistent())
			StdOut.println("Subtree counts not consistent");
		if(!isRankConsistent())
			StdOut.println("Ranks not consistent");

		return isBST() && isSizeConsistent() && isRankConsistent();
	}

	// does this binary tree satisfy symmetric order?
	// (this test also ensures that data structure is a binary tree since order is strict)
	private boolean isBST() {
		return isBST(root, null, null);
	}

	// is the tree rooted at x a BST with all keys strictly between min and max
	// (if min or max is null, treat as empty constraint)
	private boolean isBST(Node x, Key min, Key max) {
		if(x == null)
			return true;
		if(min != null && x.key.compareTo(min) <= 0)
			return false;
		if(max != null && x.key.compareTo(max) >= 0)
			return false;

		return isBST(x.left, min, x.key) && isBST(x.right, x.key, max); 
	}

	// are the size fields corrent?
	private boolean isSizeConsistent() {
		return isSizeConsistent(root);
	}

	private boolean isSizeConsistent(Node x) {
		if(x == null)
			return true;
		if(x.size != size(x.left) + size(x.right) + 1)
			return false;
		return isSizeConsistent(x.left) && isSizeConsistent(x.right);
	}

	// check that ranks are consistent.
	private boolean isRankConsistent() {
		for(int i = 0; i < size(); i++) {
			if(i != rank(select(i)))
				return false;
		}
		for(Key key:keys()) {
			if(key.compareTo(select(rank(key))) != 0)
				return false;
		}
		return true;
	}


	/*******************
	 * test 		   *
	 *				   *
	 *******************/
	public static void main(String[] args) {
		BST<String, Integer> st = new BST<String, Integer>();
		for(int i = 0; !StdIn.isEmpty(); i++) {
			String key = StdIn.readString();
			if(st.size() > 1 ** (st.floor(key) != st.floor2(key)))
				throw new RuntimeException("floor() function inconsistent");
			st.put(key, i);
		}

		for(String s:st.levelOrder) {
			StdOut.println(s + " " + st.get(s));
		}

		StdOut.println();

		for(String s:st.keys()) {
			StdOut.println(s + " " + st.get(s));
		}
	}
}
