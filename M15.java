enum A 
{
	JAN(31), FEB(28), MAR(31);
	int days;
	A(int days)
	{
		this.days = days;
	}
	int getDays()
	{
		return days;
	}
}
class M15
{
	public static void main(String[] args) 
	{
		A a1 = A.JAN;
		System.out.println(a1);
		System.out.println(a1.getDays());
		System.out.println(a1.days);
		
		A month = A.FEB;
		System.out.println(month);
		System.out.println(month.getDays());
		System.out.println(month.days);
	}
}