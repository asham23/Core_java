package Constructor;

public class ThisStatement {
	ThisStatement()
	{
		this("bangalore");
		System.out.println("inside no args constructor");
	}
	ThisStatement(String place)
	{
		this(21.7);
		System.out.println("inside place constructor");
	}
	ThisStatement(double temp)
	{
		System.out.println("inside temp");
	}

	public static void main(String[] args)
	{
		System.out.println("inside main method constructor");
		ThisStatement obj=new ThisStatement();
	}

}
