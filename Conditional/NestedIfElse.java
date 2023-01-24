package Conditional;

public class NestedIfElse //taken example as atm machine
{

	public static void main(String[] args)
	{
			int atmpin=1234;
			int atmamtbal=10000;
			int withdrawn=4000;
		if (atmpin==1234)
		{
			System.out.println("pin is correct");
			
			if(atmamtbal<=10000)
			{
				System.out.println("Please collect your amount");
				
			}
			else
			{
				System.out.println("insuffection balance");
				
			}
		}
		else
		{
			System.out.println("Pin is wrong");
			
			
		}
	}
}
		

	