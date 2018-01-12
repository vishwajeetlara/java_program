import java.util.ArrayList;
import java.util.Collections;

public class AL1 
{
	public static void main(String[] args) 
	{
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(1);
        list.add(8);
        list.add(3);
        list.add(2);
        list.add(9);
        list.add(4);
        System.out.println(list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("Element in reverse order:"+list);
	}
}
