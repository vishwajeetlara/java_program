
package com.lara;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
class D
{
    int i;
    D(int i)
    {
        this.i=i;
    }

    @Override
    public String toString() 
    {
        return "i="+i;
    }
}
public class M25 
{
    
     public static void main(String args[])
    {
        ArrayList list=new ArrayList();
        list.add(new D(9));
        list.add(new D(0));
        list.add(new D(19));
        System.out.println(list);   
        Collections.sort(list);
        System.out.println(list);
    }
}
