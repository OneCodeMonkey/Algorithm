/**
 * A symbol table implemented using a left-leaning red-black BST.
 * 
 */
import java.util.NoSuchElememtException;

public class RedBlackBST<Key extends Comparable<Key>, value> {
	private static final boolean RED = true;
	private static final boolean BLACK = false;

	private Node root;		// root of the BST

	// BST helper node data type
	private class Node {
		private Key key;		// key
		private Value val;		// associated data
		private Node left, right;	// links to left and right subtrees
		private boolean color;		// color of parent link
		private int size;		// subtree count

		public Node(Key key, Value val, boolean color, int size) {
			this.key = key;
			this.val = val;
			this.color = color;
			this.size = size;
		}
	}

	// Initializes an empty symbol table.
	public RedBlackBST() {
		//
	}

	/***********************
	 * Node helper methods *
	 *					   *
	 ***********************/

	// is node x red
	private boolean isRed(Node x) {
		if(x == null)
			return false;
		return x.color == RED;
	}

	// number of node in subtree rooted at x; 0 if x is null
	private int size(Node x) {
		if(x == null)
			return 0;
		return x.size;
	}

	// Returns the number of key-value pairs in this symbol table.
	public int size() {
		return size(root);
	}

	public boolean isEmpty() {
		return root == null;
	}

	/************************
	 * Standard BST search. *
	 * 						*
	 ************************/
	
	// returns the value associated with the given key.
	public Value get(Key key) {
		if(key == null)
			throw new IllegalArgumentException("argument to get() is null");
		return get(root, key);
	}

	private Value get(Node x, Key key) {
		while(x != null) {
			int cmp = key.compareTo(x.key);
			if(cmp < 0)
				x = x.left;
			else if(cmp > 0)
				x = x.right;
			else 
				return x.val;
		}
		return null;
	}

	// Does this symbol table contain the given key?
	public boolean contains(Key key) {
		return get(key) != null;
	}

	/*****************************
	 * Red-Black tree insertion. *
	 * 						     *
	 *****************************/

	// Inserts the specified key-value pair into the symbol table, overwriting the 
	// old value with the new value if the symbol table already contains the specified
	// key.
	// Deletes the specified key(and its associated key) from this symbol table if
	// the specified value is `null`
	public void put(Key key, Value val) {
		if(key == null)
			throw new IllegalArgumentException("first argument to put() is null");
		if(val == null) {
			delete(key);
			return;
		}

		root = put(root, key, val);
		root.color = BLACK;
	}

	// inserts the key-value pair in the subtree rooted at h
	private Node put(Node h, Key key, Value val) {
		if(h == null)
			return new Node(key, val, RED, 1);
		int cmp = key.compareTo(h.key);
		if(cmp < 0)
			h.left = put(h.left, key, val);
		else if(cmp > 0)
			h.right = put(h.right, key, val);
		else
			h.val = val;

		// fix-up any right-leaning links
		if(isRed(h.right) && !isRed(h.left))
			h = rotateLeft(h);
		if(isRed(h.left) && isRed(h.left.left))
			h = rotateRight(h);
		if(isRed(h.left) && isRed(h.right))
			flipColors(h);

		h.size = size(h.left) + size(h.right) + 1;

		return h;
	}

	/*****************************
	 * Red-Black tree deletion. *
	 * 						     *
	 *****************************/

	// Removes the smallest key and associated value from the symbol table.
	public void deleteMin() {
		if(isEmpty())
			throw new NoSuchElememtException("BST underflow");
		// if both children of root are black, set root to red
		if(!isRed(root.left) && !isRed(root.right))
			root.color = RED;

		root = deleteMin(root);
		if(!isEmpty())
			root.color = BLACK;
	}

	// delete the key-value pair with the minimum key rooted at h
	private Node deleteMin(Node h) {
		if(h.left == null)
			return null;
		if(!isRed(h.left) && !isRed(h.left.left))
			h = moveRedLeft(h);
		h.left = deleteMin(h.left);

		return balance(h);
	}

	// Removes the largest key and associated value from the symbol table.
	public void deleteMax() {
		if(isEmpty())
			throw new NoSuchElememtException("BST underflow");
		if(!isRed(root.left) && !isRed(root.right))
			root.color = RED;
		root = deleteMax(root);
		if(!isEmpty())
			root.color = BLACK;
	}

	// delete the key-value pair with the maximum key rooted at h
	private Node deleteMax(Node h) {
		if(isRed(h.left))
			h = rotateRight(h);
		if(h.right == null)
			return null;
		if(!isRed(h.right) && !isRed(h.right.left))
			h = moveRedRight(h);

		h.right = deleteMax(h.right);

		return balance(h);
	}

	// Removes the specified key and its associated value from this symbol table
	public void delete(Key key) {
		if(key == null)
			throw new IllegalArgumentException("argument to delete() is null");
		if(!contains(key))
			return;
		if(!isRed(root.left) && !isRed(root.right))
			root.color = RED;
		root = delete(root, key);
		if(!isEmpty())
			root.color = BLACK;
	}

	// delete the key-value pair with the given key rooted at h
	private Node delete(Node h, Key key) {
		if(key.compareTo(h.key) < 0) {
			if(!isRed(h.left) && !isRed(h.left.left))
				h = moveRedLeft(h);
			h.left = delete(h.left, key);
		} else {
			if(isRed(h.left))
				h = rotateRight(h);
			if(key.compareTo(h.key) == 0 && (h.right == null))
				return null;
			if(!isRed(h.right) && !isRed(h.right.left))
				h = moveRedRight(h);
			if(key.compareTo(h.key) == 0) {
				Node x = min(h.right);
				h.key = x.key;
				h.val = x.val;
				h.right = deleteMin(h.right);
			} else {
				h.right = delete(h.right, key);
			}
		}

		return balance(h);
	}


	/*******************************
	 * Red-Black helper functions. *
	 * 						       *
	 *******************************/

	// make a left-leaning link lean to the right
	private Node rotateRight(Node h) {
		Node x = h.left;
		h.left = x.right;
		x.right = h;
		x.color = x.right.color;
		x.right.color = RED;
		x.size = h.size;
		h.size = size(h.left) + size(h.right) + 1;

		return x;
	}

	// make a right-leaning link lean to the left
	private Node rotateLeft(Node h) {
		Node x = h.right;
		h.right = x.left;
		x.left = h;
		x.color = x.left.color;
		x.left.color = RED;
		x.size = h.size;
		h.size = size(h.left) + size(h.right) + 1;

		return x;
	}

	// flip the colors of a node and its two children
	private void flipColors(Node h) {
		h.color = !h.color;
		h.left.color = !h.left.color;
		h.right.color = !h.right.color;
	}

	// Assuming that h is red and both h.left and h.left.left are black, make h.left
	// or one of its children red.
	private Node moveRedLeft(Node h) {
		flipColors(h);
		if(isRed(h.right.left)) {
			h.right = rotateRight(h.right);
			h = rotateLeft(h);
			flipColors(h);
		}

		return h;
	}

	// Assuming that h is red and both h.right and h.right.left are black, make h.right
	// or one of its children red.
	private Node moveRedRight(Node h) {
		flipColors(h);
		if(isRed(h.left.left)) {
			h = rotateRight(h);
			flipColors(h);
		}

		return h;
	}

	// restore red-black tree invariant
	private Node balance(Node h) {
		if(isRed(h.right))
			h = rotateLeft(h);
		if(isRed(h.left) && isRed(h.left.left))
			h = rotateRight(h);
		if(isRed(h.left) && isRed(h.right))
			flipColors(h);

		h.size = size(h.left) + size(h.right) + 1;

		return h;
	}


	/**********************
	 * Utility functions  *
	 *					  *
	 **********************/

	// Returns the height of the BST
	public int height() {
		return height(root);
	}
	private int height(Node x) {
		if(x == null)
			return -1;
		return Math.max(height(x.left), height(x.right)) + 1;
	}

	/*********************************
	 * Ordered symbol tqble methods  *
	 *					  			 *
	 *********************************/

	// Returns the smallest key in the symbol table.
	public Key min() {
		if(isEmpty())
			trow new NoSuchElememtException("calls min() with empty symbol table");
		return min(root).key;
	}

	// the smallest key in subtree rooted at x;
	private Node min(Node x) {
		if(x.left == null)
			return x;
		else
			return min(x.left);
	}

	// Returns the largest key in the symbol table.
	public Key max() {
		if(isEmpty())
			throw new NoSuchElememtException("calls max() with empty symbol table");
		return max(root).key;
	}

	// the largest key in the subtree rooted at x;
	private Node max(Node x) {
		if(x.right == null)\
			return x;
		else
			return max(x.right);
	}

	// Returns the largest key in the symbol table less than or equal to `key`
	public Key floor(Key key) {
		if(key == null)
			throw new IllegalArgumentException("argument to floor() is null");
		if(isEmpty())
			throw new NoSuchElememtException("calls floor() with empty symbol table");
		Node x = floor(root, key);
		if(x == null)
			return null;
		else
			return x.key;
	}

	// the largest key in the subtree rooted at x less than or equal to the given key
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

	// Returns the smallest key in the symbol table greater than or equal to `key`
	public Key ceiling(Key key) {
		if(key == null)
			throw new IllegalArgumentException("argument to ceiling() is null");
		if(isEmpty())
			throw new NoSuchElememtException("calls ceiling() with empty symbol table");
		Node x = ceiling(root, key);
		if(x == null)
			return null;
		else
			return x.key;
	}

	// the smallest key in the subtree rooted at x greater than or equal to the given key.
	private Node ceiling(Node x, Key key) {
		if(x == null)
			return null;
		int cmp = key.compareTo(x.key);
		if(cmp == 0)
			return x
		if(cmp > 0)
			return ceiling(x.right, key);
		Node t = ceiling(x.left, key);
		if(t != null)
			return t;
		else
			return x;
	}

	// Return the key in the symbol table whose rank is `k`
	public Key select(int k) {
		if(k < 0 || k >= size)
			throw new IllegalArgumentException("argument to select() is invalid: " + k);
		Node x = select(root, k);
		return x.key;
	}

	// the key of  rank k in the subtree rooted at x
	private Node select(Node x, int k) {
		int t = size(x.left);
		if(t > k)
			return select(x.left, k);
		else if(t < k)
			return select(x.right, k - t - 1);
		else
			return x;
	}

	// Returns the number of keys in the symbol table strictly less than `key`
	public int rank(Key key) {
		if(key == null)
			throw new IllegalArgumentException("argument to rank() is null");
		return rank(key, root);
	}

	// number of keys less than key in the subtree rooted at x.
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

	/*********************************
	 * Range count and range search  *
	 *					  			 *
	 *********************************/
	// Returns all keys in the symbol table as an `Iterable`
	// To iterate over all of the keys in the symbol table named `st`
	public Iterable<Key> keys() {
		if(isEmpty())
			return new Queue<Key>();

		return keys(min(), max());
	}

	// Returns all keys in the symbol table in the given range, as an `Iterable`
	public Iterable<Key> keys(Key low, Key high) {
		if(low == null)
			throw new IllegalArgumentException("first argument to keys() is null");
		if(high == null)
			throw new IllegalArgumentException("second argument to keys() is null");
		Queue<Key> queue = new Queue<Key>();

		keys(root, queue, low, high);

		return queue;
	}

	// add the keys bewteen low and high in the subtree rooted at x.
	private void keys(Node x, Queue<Key> queue, Key low, Key high) {
		if(x == null)
			return;
		int cmpLow = low.compareTo(x.key);
		int cmpHigh = high.compareTo(x.key);
		if(cmpLow < 0 && cmpHigh >= 0)
			queue.enqueue(x.key);
		if(cmpHigh > 0)
			keys(x.right, queue, low, high);
	}

	// Returns the number of keys in the symbol table in the given range
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

	
	// check integrity of red-black tree data structure.
	private boolean check() {
		if(!isBST())
			StdOut.println("Not in symmetric order!");
		if(!isSizeConsistent)
			StdOut.println("Subtree counts not consistent");
		if(!isRankConsistent)
			StdOut.println("Ranks not consistent");
		if(!is23())
			StdOut.println("Not a 2-3 tree");
		if(!isBalanced())
			StdOut.println("Not balanced");
		return isBST() && isSizeConsistent() && isRankConsistent() && is23() && isBalanced();
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

	// are the size fields correct?
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

	// check that ranks are consistent
	private boolean isRankConsistent() {
		for(int i = 0; i < size(); i++) {
			if(i != rank(select(i)))
				return false;
		}
		for(Key key: keys()) {
			if(key.compareTo(select(rank(key))) != 0)
				return false;
		}
		return true;
	}

	// Does the tree have no red right links, and at most one(left) red links in a 
	// row on any path?
	private boolean is23() {
		return is23(root);
	}

	private boolean is23(Node x) {
		if(x == null)
			return true;
		if(isRed(x.right))
			return false;
		if(x != root && isRed(x) && isRed(x.left))
			return false;
		return is23(x.left) && is23(x.right);
	}

	// do all paths from root to leaf have some number of black edges?
	private boolean isBalanced() {
		int black = 0;
		Node x = root;
		while(x != null) {
			if(!isRed(x))
				black++;
			x = x.left;
		}
		return isBalanced(root, black);
	}

	// does every path from the root to a leaf have the given number of black links?
	private boolean isBalanced(Node x, int black) {
		if(x == null)
			return black == 0;
		if(!isRed(x))
			black--;
		return isBalanced(x.left, black) && isBalanced(x.right, black);
	}

	// test
	public static void main(String[] args) {
		RedBlackBST<String, Integer> st = new RedBlackBST<String, Integer>();
		for(int i = 0; !StdIn.isEmpty(); i++) {
			String key = StdIn.readString();
			st.put(key, i);
		}
		for(String s:st.keys()) {
			StdOut.println(s + " " + st.get(s));
		}

		StdOut.println();
	}
}
