import java.util.Iterator;

public class Deque<Item> implements Iterable<Item> {
	
	private Node first = null;
	private Node last = null;
	
	// private Node inner class
	private class Node {
		Item item;
		Node next;
		Node prev;
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
		first.item = item;
		first.next = oldFirst;
		if(isEmpty()) {
			last = first;
		} else {
			oldFirst.prev = first;
		}

	}
	
	// add the item to the end
	public void addLast(Item item) {
		Node newLast = new Node();
		newLast.item = item;
		newLast.next = null;
		newLast.prev = last;
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
		Item item = first.item;
		first = first.next;
		return item;
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
