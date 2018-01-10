class M7 
{
	enum Day
	{
		SUN,MON,TUE,WED,THR,FRI,SAT//enum become a member of class
	}
	public static void main(String[] args) 
	{
		Day d1=Day.WED;
		Day d2=Day.FRI;
		Day d3=Day.SUN;
		System.out.println(d1.ordinal());
		System.out.println(d2.ordinal());
		System.out.println(d3.ordinal());
		System.out.println(Day.SAT.ordinal());//ordinal bilitin method it will return index of the enum constent
	}
}
