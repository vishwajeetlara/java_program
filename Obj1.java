
class Tcs
{
	String DepartMent;
	int BranchCode;
	Tcs(String name,int code)
	{
		this.DepartMent=name;
		this.BranchCode=code;
	}
	@Override
	public String toString() 
	{
		return "DepartMent"+DepartMent+" BranchCode"+ BranchCode;
	}
	
}
class Emp extends Tcs
{
	String name;
	int age;
	String address;
	int mo;
	int sal;
	Emp(String name,int age,String address,int mo,int sal)
	{
		super("Bhopal",101);
		this.name=name;
		this.age=age;
		this.address=address;
		this.mo=mo;
		this.sal=sal;
	}
	@Override
	public String toString() 
	{
		return "name: "+name +" age: "+age + " address: "+address+ "mo: "+ mo + " sal: "+ sal + " DepartMent :  "+ DepartMent+ " "
				+ "BranchCode: " +BranchCode;
		
	}
}
public class Obj1 
{
  public static void main(String[] args)
  {
	
	  Emp e1 =new Emp("Ajay",35,"BTB 306/7 silkborad",123,40000);
	  Emp e2 =new Emp("vijay",60,"BTB second stage 306/707 silkborad",1235,60000);
	  System.out.println(e1);
	  System.out.println(e2);
  }
}
