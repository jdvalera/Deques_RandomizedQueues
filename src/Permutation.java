import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = Integer.parseInt(args[0]);
		//In in = new In(args[1]);

		RandomizedQueue<String> rq = new RandomizedQueue<String>();
		/*while(!in.isEmpty()) {
			rq.enqueue(in.readString());
		}*/
		//for(int i = 0; i < k; i++)
			//rq.enqueue(StdIn.readString());
		while(!StdIn.isEmpty()) {
			rq.enqueue(StdIn.readString());
		}
		
		for (int i = 0; i < k; i++) {
			System.out.println(rq.dequeue());
		}
	}

}
