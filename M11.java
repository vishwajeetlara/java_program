class A
{
	enum B
	{
		c1, c2, c3;
	}
}
class M11 
{
	public static void main(String[] args) 
	{
		A.B ref = A.B.c1 ;
		System.out.println(ref);
	}
}
/*
Enum of one class using in another class is possible

E:\Java\lab2\app39\classes>java M11
c1
*/

