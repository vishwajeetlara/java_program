enum A
{
	CON,TEST(90),HELLO("ABC");
	A()
	{
        System.out.println("A()");

	}

	A(String s1)
	{
        System.out.println("A(String)");

	}
}
class  M19
{
	public static void main(String[] args) 
	{
		System.out.println("hello");
		//every constant has to load .every once loading antar enum than only enum can be use
		//you hared to proved constrctor ever Enum
		//every const must be have constroctr
	}
}

