
package com.lara;

import java.util.ArrayList;
import java.util.Scanner;
public class M12 
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    ArrayList list=new ArrayList();
    String element=null;
    while(true)
     {
       System.out.println("enter any element");
       element=sc.next();
       if(!list.contains(element))
       {
           list.add(element);
       }
       else
       {
           System.out.println("enter any element is already+element");
       }
       
      System.out.println();
}
    
}
