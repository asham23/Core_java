package Conditional;

public class ElseIf {

	public static void main(String[] args) {
	
		int x=-10;
		if (x>10)//if x is positive then it prints the output
		{
			System.out.println("x is a positive number");
		}
		else if(x<0)//if x is negative then it prints the output
		{
			System.out.println("x is a negative number");
			
		}
		
		else if(x==0)//if x is equals to 0 then it prints the output
		{
			System.out.println("x is neutral");
		}
		else//if x is not valid then it prints invalid 
		{
			System.out.println("x is invalid");
		}
		
		
	}
	

}
