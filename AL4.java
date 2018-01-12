//short the ArrayList
import java.util.ArrayList;
import java.util.Collections;
class C implements Comparable
  {
		int i;
		C(int i)
		{
			this.i=i;
		}
		@Override
		public String toString() 
		{
	        return "i:"+i;	
		}
		@Override
		public int compareTo(Object obj)
		{
	         return i-((C)obj).i;
		}
  }
    public class AL4
	{
		public static void main(String args[])
		{
		    ArrayList list=new ArrayList();
		    list.add(new C(100));
		    list.add(new C(80));
		    list.add(new C(20));
		    list.add(new C(70));
		    System.out.println(list);	
		    Collections.sort(list);
		    System.out.println(list);
		}
	}
