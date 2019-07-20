/**
 * Stack implementation with a resizing array.
 *
 */
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * The class represents a last-in-first-out(LIFO) stack of generic items.
 *
 * It supports the usual `push` and `pop` operations, along with methods for
 * peeking at the top item, testing if the stack is empty, and iterating through
 * the items in LIFO order.
 *
 * This implementation uses a resizing array, which double the underlying array
 * when it is full and halves the underlying array when it is one-quarter full.
 * The `push` and `pop` operations take constant amortized(分摊的) time.
 * The `size`, `peek` and `isEmpty` operations takes constant time in the worst
 * case.
 *
 */
public class ResizingArrayStack<Item> implements Iterable<Item> {
	private Item[] a;		// array of items
	private int n;			// number of elements on stack

	// Initializes an empty stack.
	public ResizingArrayStack() {
		a = (Item[]) new Object[2];
		n = 0;
	}

	// Is this stack empty?
	public boolean isEmpty() {
		return n == 0;
	}

	// Returns the number of items in the stack.
	public int size() {
		return n;
	}

	// resize the underlying array holding the elements.
	private void resize(int capacity) {
		assert capacity >= n;

		//
		Item[] temp = (Item[]) new Object[capacity];
		for(int i = 0; i < n; i++) {
			temp[i] = a[i];
		}

		a = temp;
	}

	// adds the item to this stack.
	public void push(Item item) {
		if(a.length == n)
			resize(2 * a.length);		// double size of array if necessary

		a[n++] = item;		// add item
	}

	// Removes and returns the item most recently added to this stack.
	public Item pop() {
		if(isEmpty())
			throw new NoSuchElementException("Stack underflow");
		Item item = a[n - 1];
		a[n - 1] = null;			// to avoid loitering
		n--;

		// shrink size of array if necessary
		if(n > 0 && a.length == 4 * n)
			resize(a.length / 2);

		return item;
	}

	// Returns(but doesn't remove) the item most recently added to this stack.
	public Item peek() {
		if(isEmpty())
			throw new NoSuchElementException("Stack underflow");

		return a[n - 1];
	}

	// Returns an iterator to this stack that iterates through the items in LIFO order.
	public Iterator<Item> iterator() {
		return new ReverseArrayIterator();
	}

	// an iterator, doesn't implement `remove()` since it's optional
	private class ResizingArrayStack implements Iterator<Item> {
		private int i;

		public ReverseArrayIterator() {
			i = n - 1;
		}

		public boolean hasNext() {
			return i >= 0;
		}

		public void remove() {
			throw new UnsupportedOperationException();
		}

		public Item next() {
			if(!hasNext())
				throw new NoSuchElementException();

			return a[i--];
		}
	}


	// test
	public static void main(String[] args) {
		ResizingArrayStack<String> stack = new ResizingArrayStack<String>();

		while(!StdIn.isEmpty()) {
			String item = StdIn.readString();
			if(!item.equals("-"))
				stack.push(item);
			else if(!stack.isEmpty())
				StdOut.print(stack.pop() + " ");
		}

		StdOut.println("(" + stack.size() + " left on stack)");
	}
}
