class M8
{
	enum Day
	{
		SUN,MON,TUE,WED,THR,FRI,SAT//enum become a member of class
	}
	public static void main(String[] args) 
	{
		Day []days=Day.values();
		for (Day day :days )//if you wat to check what are the 
		{
		
		System.out.println(day);
		}//values is on bilitin method it will return arry enum constant constof the enum constent
	}
}
