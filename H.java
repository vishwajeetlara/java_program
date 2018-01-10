class H 
{
	public static void main(String[] args) 
	{
		int i=123456; //find out total number of digit given number.
		int count=0;//incriment count removing one digit.
		while(i!=0)
		{
			count++;
			i=i/10;
		}

		System.out.println(count);
	}
}
