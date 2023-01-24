package Constructor;

public class ThisKeywordconst 
	{
		String name;
		int id;
		
		ThisKeywordconst(String name,int id)
		{
			this.name=name;
			this.id=id;	
		}

	public static void main(String[] args)
	{ 
		ThisKeywordconst obj = new ThisKeywordconst("asha",12);
		System.out.println("the name is:" +obj.name);
		System.out.println("the id is:"+obj.id);
	}

}
