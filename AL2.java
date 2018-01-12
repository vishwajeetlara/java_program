import java.util.ArrayList;
class A
{
	int i;
	A(int i)
	{
		this.i=i;
	}
}
public class AL2 
{
	public static void main(String[] args) 
	{
	    ArrayList list=new ArrayList();
	    list.add(new A(10));
	    list.add(12);
	    list.add(new A(30));
	    list.add(10);
	    list.add(new A(80));
	    list.add(13);
	    list.add(new A(40));
	    System.out.println(list);
		
	}

}
