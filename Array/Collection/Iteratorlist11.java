package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Iteratorlist11 {
	public static void main(String[] args) 
	{
		ArrayList list=new ArrayList();
		for(int i=0;i<5;i++)     
		{
			list.add(i);
			
		}
		ListIterator i=list.listIterator();
		while(i.hasNext())
		{
			Integer num=(Integer) i.next();
			System.out.println(num);
		}
		
		while(i.hasPrevious())
		{
			Integer num=(Integer) i.previous();
			System.out.println(num);
		}
		
	}


}
