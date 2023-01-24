package Constructor;

public class OverloadCons
{
	OverloadCons()
	{
		System.out.println("inside no arguments constructor");
	}
	OverloadCons(String name)
	{
		System.out.println("inside string arg constructor");
	}
	OverloadCons(String name,int num)
	{
		System.out.println("inside 2 arguments");
		
	}
	

	public static void main(String[] args) {
		
		OverloadCons obj=new OverloadCons();
		OverloadCons obj1=new OverloadCons("asha");
		OverloadCons obj2=new OverloadCons("asha",25);			
		}

}
