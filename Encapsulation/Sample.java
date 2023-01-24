package Encapsulation;

public class Sample {

	public static void main(String[] args) 
	{
		Demo d=new Demo("asha",1001,30000);
		int id=d.getempid();
		System.out.println("the id is :"+id);
		
		String name=d.getempname();
		System.out.println("the name is :"+name);
		
		double sal=d.getempsal();
		System.out.println("the sal is:"+sal);
	
		//updating the values
		
		d.setempid(1003);
		d.setempname("ashwini");
		d.setempsal(35000);
		
		//updated values
		id=d.getempid();
		System.out.println("the updated value is:"+id);
		
		name=d.getempname();
		System.out.println("the name is:"+name);
		
		sal=d.getempsal();
		System.out.println("the sal is:"+sal);
		
	
	}

}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
