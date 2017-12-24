import java.util.Iterator;

public class RandomizedQueue<Item> implements Iterable<Item> {
	
	Item[] q;
	
	// construct an empty randomized queue
	public RandomizedQueue() {
		q = (Item[]) new Object[1];
	}
	
	// is the queue empty?
	public boolean isEmpty() {
		return false;
	}
	
	// return the number of items on the queue
	public int size(){
		return 0;
	}
	
	// add the item
	public void enqueue(Item item) {
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
	
	// unit testing
	public static void main(String[] args) {

	}

}
