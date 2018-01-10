
class M
{
	public static void main(String[] args) 
	{
		long m=99999999999L;
		long n=m;
		long sum=0;
		while(m!=0)
		{
			sum=sum+m%10;
			m=m/10;

			if(m==0 && sum>9)
			{
				
				System.out.println("sum from"+n+"is"+sum);
				m=sum;
				sum=0;

		}
	}


}
}
