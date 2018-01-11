
package com.lara;

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
        return"i"+i;
    }
    
}
public class M23 
{
    
    public static void main(String args[])
    {
        ArrayList list=new ArrayList();
        list.add(new B(9));
        list.add(new B(19));
        list.add(new B(91));
        list.add(new B(29));
        System.out.println(list);
        
    }
}
    
