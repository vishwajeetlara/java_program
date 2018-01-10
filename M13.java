enum A 
{
	JAN(31), FEB(28), MAR(31);
	A(int i)
	{
	}
}
class M13
{
	public static void main(String[] args) 
	{
		A a1 = A.JAN;
		System.out.println(a1);
	}
}
