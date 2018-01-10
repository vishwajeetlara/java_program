class M10 
{
	public static void main(String[] args) 
	{
		Thread.State[] states=Thread.State.values();//jdk 1.5
		for (Thread.State state:states)
		{
			System.out.println(state);//insid a thred state is a Enum state is a pridifine Enum

		}
	}
}
