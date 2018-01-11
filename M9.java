
package com.lara;

import java.util.ArrayList;


public class M9 
{
     public static  void main(String args[])
     {
         ArrayList list=new ArrayList();
         list.add(1000);
         list.add(1000.00);
         list.add("abc");
         list.add('A');
         list.add(true);
         list.add(2,"xyz");
         System.out.println(list); 
         System.out.println(list.contains("abc")); 
          System.out.println(list.contains("hello")); 
         list.set(3, "hello");
         System.out.println(list); 
         System.out.println(list.isEmpty());//aftar clear the list is return true
        
    
     }
    
}
