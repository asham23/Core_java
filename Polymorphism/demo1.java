package Polymorphism;

public class demo1
{
	int x=10;
	static void add(int a,int b)
	{
		System.out.println("add two numbers:");
	}
	static void add(double a,double b)

	{
		System.out.println("calculate basix+Da");
	}
	static void add(String name)

	{
		System.out.println("inside name");
	}
	public static void main(String[] args) 
	{
		add(10,20);
		add(103.34,345.56);
		add("asha");
		
	}
	
}

