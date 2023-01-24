package Collection;

import java.util.HashSet;

public class Set {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		HashSet set=new HashSet();
		set.add("cat");
		set.add("dog");
		set.add("cat");
		set.add("animal");
		set.add(null);
		set.add(56);
		System.out.println(set);
		
	}

}
