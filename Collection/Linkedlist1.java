package Collection;

import java.util.LinkedList;

public class Linkedlist1 {

	public static void main(String[] args) 
	{
		LinkedList list=new LinkedList();
		list.add("JAVA");
		list.add("python");
		list.add("hash");
		list.add("hash");
		list.add("python");
		list.add("ruby");
		list.add(123);
		list.add(null);
		System.out.println(list);
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		list.removeFirst();
		list.removeLast();
		System.out.println(list);
		

	}

}
