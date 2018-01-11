
package com.lara;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


class K implements Comparable
{
    int i;
    K(int i)
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
        return i-((K)o).i;
    }
    
}
public class M29 
{
    public static void main(String args[])
    {
        ArrayList list=new ArrayList();
        list.add(new K(10));
        list.add(new K(12));
        list.add(new K(15));
        list.add(new K(20));
        list.add(new K(30));
        System.out.println(list);
        Collections.sort(list);
    }
}
