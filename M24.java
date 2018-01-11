
package com.lara;

import java.util.ArrayList;
class C
{
    int i,j;
    C(int i,int  j)
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
public class M24 
{
     public static void main(String args[])
    {
        ArrayList list=new ArrayList();
        list.add(new C(9,8));
        list.add(new C(4,5));
        list.add(new C(2,7));
        System.out.println(list);
        
    }
}
