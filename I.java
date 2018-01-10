import java.util.Scanner;
class I
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int i=sc.nextInt();
		int j=i;       
		int count=0;
		while(i!=0)
		{
			count++;
			i=i/10;
		}

		System.out.println("total number of digits is:"+count);
	}
}
