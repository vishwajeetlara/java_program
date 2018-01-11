
package com.lara;

import java.util.ArrayList;
import java.util.Collections;


public class M17 
{
       public  static  void main(String[]args)
       {
        ArrayList list=new ArrayList();
        list.add(9);
        list.add(0);
        list.add(91);
        list.add(20);
        list.add(29);
        list.add(6);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
     }
    
}
