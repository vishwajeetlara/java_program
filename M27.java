
package com.lara;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class F
{
    int i ,j;
    F(int i,int j)
    {
        this.i=i;
        this.j=j;
    }

    @Override
    public String toString()
    {
        return "("+i+","+j+")";
    }
    
}
class G implements Comparator
{

    @Override
    public int compare(Object o1, Object o2) 
    {
        return ((F)o1).i-((F)o2).i;
    }

}
class H implements Comparator
{

    @Override
    public int compare(Object o1, Object o2)
    {
        return ((F)o1).j-((F)o2).j;
    }
    
}
public class M27 
{
    
     public static void main(String args[])
      {
        ArrayList list=new ArrayList();
        list.add(new F(10,20));
        list.add(new F(100,0));
        list.add(new F(1,200));
        list.add(new F(15,30));
        list.add(new F(0,15));
        list.add(new F(50,25));
        System.out.println(list);  
        Collections.sort(list,new G());
        System.out.println(list);
        Collections.sort(list,new H());
        System.out.println(list);         
    }
}
