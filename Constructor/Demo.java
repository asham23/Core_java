package Constructor;

public class Demo
{

	Demo(int num)
		
		{
			System.out.println("inside constructor");
			System.out.println("num:"+num);
		}
		
		public static void main(String[] args)
		{
			Demo obj=new Demo(27);

	}

}
