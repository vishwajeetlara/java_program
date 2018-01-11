
package com.lara;

import java.util.ArrayList;
public class M10 
{
       public static  void main(String args[])
     {
         ArrayList list=new ArrayList();
         list.add(1000);
         list.add(1000.00);
         list.add(1000.00);
         list.add("abc");
         list.add("abc");
         list.add('A');
         list.add('A');
         list.add(true);
         list.add(true);
         list.add(2,"xyz");
         System.out.println(list); //in arrayList duplicat is allow or allowing
     }   
}
