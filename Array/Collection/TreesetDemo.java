package Collection;

import java.util.*;

public class TreesetDemo {

	public static void main(String[] args) 
	
	{
		TreeSet set=new TreeSet();
		set.add("cat");
		set.add("animal");
		set.add("dog");
		set.add("rat");
		set.add("mat");
		set.add("sat");
		set.add("bat");
		System.out.println(set.subSet("dog","sat"));
		System.out.println(set.headSet("sat"));
		System.out.println(set.tailSet("animal"));
		
		
		

	}

}
