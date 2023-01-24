package Collection;

import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) 
	{
		PriorityQueue pq=new PriorityQueue();
		pq.offer("asha");
		pq.offer("ashwini");
		pq.offer("nalina");
		pq.offer("keshav");
		pq.offer("madhu");
		pq.offer("mahathi");
		System.out.println(pq);
		System.out.println(pq.peek());
		System.out.println(pq.poll());
		System.out.println(pq);
		
		
		

	}

}
