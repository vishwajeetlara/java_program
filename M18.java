enum A
{
	CON,TEST(90),HELLO("ABC");
	A()
	{
        System.out.println("A()");

	}
	A(int i)
	{
        System.out.println("A(int)");

	}

	A(String s1)
	{
        System.out.println("A(String)");

	}
}
class  M18
{
	public static void main(String[] args) 
	{
		System.out.println(A.HELLO);//every constant has to load .every once loading antar enum than only enum can be use
	}
}
