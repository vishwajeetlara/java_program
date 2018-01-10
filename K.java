import java.util.Scanner;
class K
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int m=sc.nextInt();
		int n=m;
		int sum=0;
		while(m!=0)
		{
			sum=sum+m%10;//sum of every digits  given number.
			m=m/10;
		}
		System.out.println("sum of all digit in given number"+sum);//take last digit add+sum
	}
}
