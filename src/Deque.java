import java.util.Iterator;

public class Deque<Item> implements Iterable<Item> {
	
	private Node first = null;
	private Node last = null;
	private int count = 0;
	
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
		count = 0;
	}
	
	// is the deque empty?
	public boolean isEmpty() {
		return first == null;	
	}
	
	// return the number of items on the deque
	public int size() {
		return count;
	}
	
	// add the item to the front
	public void addFirst(Item item) {
		Node oldFirst = first;
		first = new Node();
		first.item = item;
		first.next = oldFirst;
		count++;
		if(oldFirst == null) {
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
		count++;
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
		if(isEmpty())
			throw  new java.util.NoSuchElementException();
		Item item = first.item;
		first = first.next;
		if(count == 1)
			last = first;
		else
			first.prev = null;
		count--;
		return item;
	}
	
	// remove and return the item from the end
	public Item removeLast() {
		if(isEmpty())
			throw  new java.util.NoSuchElementException();
		Item item = last.item;
		last = last.prev;
		if(count <= 1)
			first = last;
		else
			last.next = null;
		count--;
		return item;
	}
	
	// return an iterator over items in order from front to end
	@Override
	public Iterator<Item> iterator() {
		// TODO Auto-generated method stub
		return new DequeIterator();
	}
	
	private class DequeIterator implements Iterator<Item> {
		
		private Node current = first;
		
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return current != null;
		}

		@Override
		public Item next() {
			// TODO Auto-generated method stub
			Item item = current.item;
			current = current.next;
			return item;
		}
		
	}
	
	// unit testing
	public static void main(String[] args) {
		Deque<String> d = new Deque<String>();
		d.addLast("Hey");
		d.addLast("Ho");
		System.out.println(d.size());
		System.out.println(d.removeFirst());
		for(String s:d) {
			System.out.println(s);
		}
		

	}

}
