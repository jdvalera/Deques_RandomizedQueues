import edu.princeton.cs.algs4.In;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = Integer.parseInt(args[0]);
		In in = new In(args[1]);
		
		RandomizedQueue rq = new RandomizedQueue<String>();
		while(!in.isEmpty()) {
			rq.enqueue(in.readString());
		}
		
		for(int i = 0; i < k; i++) {
			System.out.println(rq.dequeue());
		}
	}

}
