class J 
{
	public static void main(String[] args) 
	{
		int m=12345;
		int sum=0;
		while(m!=0)
		{
			sum=sum+m%10;//sum of every digits  given number.
			m=m/10;
		}
		System.out.println(sum);
	}
}
