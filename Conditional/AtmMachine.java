package Conditional;

public class AtmMachine {

	public static void main(String[] args) {
		int pin=12345;
		int acctbal=100000;
		int withdrawn=4000;
		if(pin==12345)
		{
			System.out.println("pin is correct");
			if(withdrawn<acctbal)
			{
				System.out.println("transaction successful");
				acctbal=acctbal-withdrawn;
				System.out.println("your account balance is rs:"+acctbal);
			}
			else
			{
				System.out.println("insufficient balance");
				
			}
		}
		else
		{
			System.out.println("pin is incorrect");
		}

	}

}
