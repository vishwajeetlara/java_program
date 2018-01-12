import java.util.ArrayList;
import java.util.Collections;
public class AL 
{
	public static void main(String[] args) 
	{
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(12);
        list.add(1);
        list.add(13);
        System.out.println(list);
        Collections.sort(list);
        System.out.println("Element in sorted order:"+list);
	}
}
