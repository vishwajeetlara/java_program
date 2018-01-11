
package com.lara;

import java.util.ArrayList;
import java.util.Collections;
class E implements Comparable//compareble interface contime comapr method
{
    int i;
    E(int i)
    {
        this.i=i;
    }

    @Override
    public String toString()
    {
        return "i="+i;
    }

    @Override
    public int compareTo(Object o)
    {
        return i-((E)O).i;
    }
    
}
public class M26 
{
    
     public static void main(String args[])
    {
        ArrayList list=new ArrayList();
        list.add(new E(9));
        list.add(new E(0));
        list.add(new E(19));
        System.out.println(list);   
        Collections.sort(list);
        System.out.println(list);
    }
    
}
