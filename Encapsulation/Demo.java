package Encapsulation;

public class Demo 
{
	private String empname;
	private int empid;
	private double empsal;

	
	public Demo(String name, int id, double sal)
	{
		this.empname=name;
		this.empid=id;
		this.empsal=sal;
	}
	
	//public getters methods
	public int getempid()
	{
		return this.empid;
	}
	
	public String getempname()
	{
		return this.empname;
	}
	
	public double getempsal()
	{
		return this.empsal;
	}
		
	//public setters method
	public void setempid(int id)
	{
		this.empid= id;
	}
	
	public void setempname(String name)
	{
		this.empname=name;
	}
	
	public void setempsal(double sal)
	{
		this.empsal=sal;
	}	

}
