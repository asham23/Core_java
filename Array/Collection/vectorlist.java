package Collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

public class vectorlist {

	public static void main(String[] args) 
	{
		Vector list=new Vector();
		list.add("JAVA");
		list.add("python");
		list.add("hash");
		list.add("hash");
		list.add("python");
		list.add("ruby");
	

		int i=0;
		Enumeration e=list.elements();
		while(e.hasMoreElements())
		{
			String s=(String)e.nextElement();
			System.out.println(s);
				
			//e.nextElement();
			//System.out.println(list.get(i));
			//i++;
		}
		
		
		
		
	}

}
