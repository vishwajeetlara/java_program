class N
{
	public static void main(String[] args) 
	{
		int i=12345;
		test(i);
	}

	static void test(int i)
	{
		if (i==0)
	    {
			return;
	    }
		int x= i%10;
		System.out.print(x);
		test(i/10);
	}
}