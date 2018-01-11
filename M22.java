/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lara;

import java.util.ArrayList;
class A
{
    int i;
    A(int i)
    {
        this.i=i;
    }
}
public class M22 
{
    public static void main(String args[])
    {
        ArrayList list=new ArrayList();
        list.add(new A(9));
        list.add(new A(19));
        list.add(new A(91));
        list.add(new A(29));
        System.out.println(list);
    }
    
}
