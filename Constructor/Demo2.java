package Constructor;

public class Demo2 
{
	int age,num;
	String name;//non static variable
	Demo2(int a,String b)
	{
		age=a;
		name=b;
	
	}
		Demo2(int c,int d)
	{
		age=c;
		num=d;
		
	}
	public static void main(String[] args) 
	{
		Demo2 obj=new Demo2(25,"asha");
		System.out.println("age is:"+obj.age);
		System.out.println("the name is:"+obj.name);
		Demo2 d1=new Demo2(26,13);
		System.out.println(d1.age);
		System.out.println(d1.num);
	}

}
