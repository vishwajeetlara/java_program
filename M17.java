enum A 
{
	JAN(31), FEB(28), MAR(31);
	int days;
	A(int days)
	{
		this.days = days;
		System.out.println(this+":"+days);


	}
	int getDays()
	{
		return days;
	}
}
class M17
{
	public static void main(String[] args) 
	{
		A a1 = A.MAR;
		System.out.println(a1);
		System.out.println(a1.getDays());
		System.out.println(a1.days);		
	                     
	}
}