package in.co.collection;

import java.util.*;

public class Testcol5 {

	public static void main(String[] args) {
		PriorityQueue<String> pq = new PriorityQueue<String>();
		pq.add("carrot");
		pq.add("apple");
		pq.add("banana");
		System.out.println(pq.poll() + ":" + pq.peek());
	}
}
