class M9
{
	enum Day
	{
		SUN,MON,TUE,WED,THR,FRI,SAT//enum become a member of class
	}
	public static void main(String[] args) 
	{
		Day day1=Day.valueOf("WED");
		System.out.println(day1);
		Day day2=Day.valueOf("FRI");
		System.out.println(day2);
		Day day3=Day.valueOf("MONDAY");
	    System.out.println(day3);



	}
	
}
