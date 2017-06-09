import java.util.Iterator;

public class Deque<Item> implements Iterable<Item> {
	
	private Node first = null;
	private Node last = null;
	
	// private Node inner class
	private class Node<Item> {
		Item item;
		Node next;
	}
	
	// construct an empty deque
	public Deque() {
		// TODO Fill in constructor
		first = last;
	}
	
	// is the deque empty?
	public boolean isEmpty() {
		return first == last;	
	}
	
	// return the number of items on the deque
	public int size() {
		return 0;
	}
	
	// add the item to the front
	public void addFirst(Item item) {
		Node oldFirst = first;
		first = new Node();
		if(isEmpty()) last = first;
		first.item = item;
		first.next = oldFirst;
	}
	
	// add the item to the end
	public void addLast(Item item) {
		Node newLast = new Node();
		newLast.item = item;
		newLast.next = null;
		if(isEmpty()) {
			last = newLast;
			first = newLast;
		} else {
			last.next = newLast;
			last = newLast;
		}
	}
	
	// remove and return the item from the front
	public Item removeFirst() {
		return null;
	}
	
	// remove and return the item from the end
	public Item removeLast() {
		return null;
	}
	
	// return an iterator over items in order from front to end
	@Override
	public Iterator<Item> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	
	// unit testing
	public static void main(String[] args) {

	}

}
