import java.util.ArrayList;
class B
  {
		int i;
		B(int i)
		{
			this.i=i;
		}
		@Override
		public String toString() 
		{
	        return "i:"+i;	
		}
  }

    public class AL3
	{
		public static void main(String args[])
		{
		    ArrayList list=new ArrayList();
		    list.add(new B(10));
		    list.add(new B(30));
		    list.add(new B(80));
		    list.add(new B(90));
		    System.out.println(list);	
		}
	}
