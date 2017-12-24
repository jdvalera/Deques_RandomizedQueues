import java.util.Iterator;

public class RandomizedQueue<Item> implements Iterable<Item> {
	
	private Item[] q;
	private int N = 0;
	
	// construct an empty randomized queue
	public RandomizedQueue() {
		q = (Item[]) new Object[1];
		q[0] = null;
	}
	
	// is the queue empty?
	public boolean isEmpty() {
		return N <= 0;
	}
	
	// return the number of items on the queue
	public int size(){
		return N;
	}
	
	// add the item
	public void enqueue(Item item) {
		if(N == q.length) resize(2*q.length);
		q[N++] = item;
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
		for (int i = 0; i < N; i++)
			copy[i] = q[i];
		q = copy;
	}
	
	// unit testing
	public static void main(String[] args) {
		RandomizedQueue<Integer> q = new RandomizedQueue<Integer>();
		System.out.println(q.isEmpty());
		q.enqueue(1);
		System.out.println(q.isEmpty());
		//q.enqueue(2);
		System.out.println(q.size());
	}

}
