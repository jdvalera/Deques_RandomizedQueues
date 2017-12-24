import java.util.Iterator;

public class RandomizedQueue<Item> implements Iterable<Item> {
	
	private Item[] q;
	private int capacity = 0;
	private int current = 0;
	
	// construct an empty randomized queue
	public RandomizedQueue() {
		q = (Item[]) new Object[1];
	}
	
	// is the queue empty?
	public boolean isEmpty() {
		return capacity <= 0;
	}
	
	// return the number of items on the queue
	public int size(){
		return capacity;
	}
	
	// add the item
	public void enqueue(Item item) {
		if(current == capacity) resize(2*capacity);
	}
	
	// remove and return a random item
	public Item dequeue() {
		return null;
	}
	
	// return (but do not remove) a random item
	public Item sample() {
		return null;
	}
	
	// return an independent iterator over items in random order
	@Override
	public Iterator<Item> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	
	private void resize(int capacity) {
		Item[] copy = (Item[]) new Object[capacity];
		for (int i = 0; i < current; i++)
			copy[i] = q[i];
		q = copy;
	}
	
	// unit testing
	public static void main(String[] args) {

	}

}
