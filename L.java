
class L
{
	public static void main(String[] args) 
	{
		int m=456789876;
		int n=m;
		int sum=0;
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
