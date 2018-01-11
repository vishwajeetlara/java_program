
package com.lara;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
class C1 implements Comparable
{
    int i;
    C1(int i)
    {
        this.i=i;
    }

    @Override
    public String toString()
    {
        return "i:"+i;
    }

    @Override
    public int compareTo(Object o) 
    {
        return i-((C1)o).i;
    }
}
public class M28 
{
   public static void main(String args[])
   {
       ArrayList list=new ArrayList();
       list.add(new C1(9));
       list.add(new C1(5));
       list.add(new C1(8));
       list.add(new C1(10));
       list.add(new C1(12));
       System.out.println(list);
       Collections.sort(list);
       System.out.println(list);   
   }
}
