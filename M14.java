
package com.lara;
import java.util.ArrayList;
import java.util.Collections;


public class M14
{
    public  static  void main(String[]args)
    {
        ArrayList list=new ArrayList();
        list.add(9);
        list.add(0);
        list.add(91);
        list.add(19);
        list.add(29);
        list.add(6);
        list.add("abc");
        System.out.println(list);
        Collections.sort(list);//we are sorting element
        System.out.println(list);
    }
    
}
