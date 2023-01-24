package Collection;

import java.util.*;
public class IteratorList 
{
	public static void main(String[] args) 
	{
		ArrayList list=new ArrayList();
		for(int i=0;i<5;i++)     
		{
			list.add(i);
			
		}
		Iterator i = list.iterator();
		while(i.hasNext())
		{
			Integer num=(Integer) i.next();
			System.out.println(num);
		}		
		
	}

}
