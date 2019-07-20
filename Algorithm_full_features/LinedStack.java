/**
 * A generic stack, implemented using a linked list. Each stack element is of type Item.
 */

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * The class represents a last-in-first-out(LIFO) stack of generic items.
 * It supports the usual `push` and `pop` operations, along with methods
 * for peeking at the top item, testing if the stack is empty, and iterating 
 * through the items in LIFO order.
 *
 * This implementation uses a singly linked list with a non-static nested
 * class for linked-list nodes.
 *
 */
public class LinkedStack<Item> implements Iterable<Item> {
	private int n;		// size of the stack
	private Node first;		// top of stack

	// helper linked list class
	private class Node{
		private Item item;
		private Node next;
	}

	// Initializes an empty stack.
	public LinkedStack() {
		first = null;
		n = 0;
		assert check();
	}

	// Is this stack empty?
	public boolean isEmpty() {
		return first == null;
	}

	// returns the number of items in the stack.
	public int size() {
		return n;
	}

	// Adds the item to this stack.
	public void push(Item item) {
		Node oldfirst = first;
		first = new Node();
		first.item = item;
		first.next = oldfirst;
		n++;
		assert check();
	}

	// removes and returns the item most recently added to this stack.
	public Item pop() {
		if(isEmpty())
			throw new NoSuchElementException("Stack underflow");
		Item item = first.item;		// save item to return
		first = first.next;
		n--;
		assert check();

		return item;		// return the saved item
	}

	// returns the item most recently added to this stack.
	public Item peek() {
		if(isEmpty())
			throw new NoSuchElementException("Stack underflow");

		return first.item;
	}

	// returns a string representation of this stack.
	public String toString() {
		StringBuilder s = new StringBuilder();
		for(Item item : this)
			s.append(item + " ");

		return s.toString();
	}	

	// returns an iterator to this stack that iterates through the items in LIFO order.
	public Iterator<Item> iterator() {
		return new ListIterator();
	}

	// an iterator, doesn't implement remove() since it's optional
	private class ListIterator implements Iterator<Item> {
		private Node current = first;
		public boolean hasNext() {
			return current != null;
		}
		public void remove() {
			throw new UnsupportedOperationException();
		}

		public Item next() {
			if(!hasNext())
				throw new NoSuchElementException();
			Item item = current.item;
			current = current.next;

			return item;
		}
	}

	// check internal invariants.
	private boolean check() {
		if(n < 0)
			return false;
		if(n == 0)
			if(first != null)
				return false;
		else if(n == 1) {
			if(first == null)
				return false;
			if(first.next != null)
				return false;
		} else {
			if(first == null)
				return false;
			if(first.next == null)
				return false;
		}

		// check internal consistency of instance variable n
		int numberOfNodes = 0;
		for(Node x = first; x != null && numberOfNodes <= n; x = x.next) {
			numberOfNodes++;
		}

		if(numberOfNodes != n)
			return false;

		return true;
	}

	// test
	public static void main(String[] args) {
		LinkedStack<String> stack = new LinkedStack<String>();
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
