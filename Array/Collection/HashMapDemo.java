package Collection;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) 
	
	{
		HashMap mp=new HashMap();
		mp.put("asha", 25);
		mp.put("keshi", 29);
		mp.put("keshi", 28);
		mp.put("mahathi", 5);
		mp.put("ammlu", 10);
		System.out.println(mp);
		System.out.println(mp.keySet());
		System.out.println(mp.values());
		
		

	}

}
