enum A 
{
	JAN(31), FEB(28), MAR(31);
	int i;
	A(int i)
	{
		this.i = i;
	}
}
class M14
{
	public static void main(String[] args) 
	{
		A a1 = A.JAN;
		System.out.println(a1);
		System.out.println(a1.i);
	}
}
/*
enum similar to objects.
If we want common attributes We use enums with constructors.
E:\Java\lab2\app39\classes>java M14
JAN
31
*/