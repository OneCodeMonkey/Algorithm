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
	
}