import java.util.Iterator;

import edu.princeton.cs.algs4.StdRandom;

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
		if(item == null)
			throw new java.lang.IllegalArgumentException();
		if(N == q.length) resize(2*q.length);
		q[N++] = item;
	}
	
	// remove and return a random item
	public Item dequeue() {
		if(isEmpty())
			throw new java.util.NoSuchElementException();
		int randIndex = StdRandom.uniform(N);
		Item item = q[randIndex];
		q[randIndex] = q[--N];
		q[N] = null;
		if (N > 0 && N == q.length/4) resize(q.length/2);
		return item;
	}
	
	// return (but do not remove) a random item
	public Item sample() {
		if(isEmpty())
			throw new java.util.NoSuchElementException();
		int randIndex = StdRandom.uniform(N);
		Item item = q[randIndex];
		return item;
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
		q.enqueue(3);
		System.out.println(q.isEmpty());
		q.enqueue(1);
		q.enqueue(2);
		System.out.println(q.size());
		System.out.println("Popped " + q.dequeue());
		System.out.println(q.size());
		System.out.println("Popped " + q.dequeue());
		System.out.println(q.size());
		System.out.println("Popped " + q.dequeue());
		System.out.println(q.size());
	}

}
