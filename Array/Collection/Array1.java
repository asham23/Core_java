package Collection;

import java.util.ArrayList;

public class Array1 {

	public static void main(String[] args) 
	{
		ArrayList list=new ArrayList();
		list.add("JAVA");
		list.add("python");
		list.add("hash");
		list.add("hash");
		list.add("python");
		list.add("ruby");
		list.add(123);
		list.add(null);
		System.out.println(list);
		
		list.remove(3);
		System.out.println(list);
		list.set(3, "perl");
		System.out.println(list);
		list.add(4, "ashu");
		System.out.println(list);
		System.out.println(list.get(6));
	
	

	
	
	}
}
