package com.to.Collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
	public static void main(String[]args) 
    { 
        HashSet<String> h = new HashSet<String>(); 
  
        // Adding elements into HashSet usind add() 
        h.add("India"); 
        h.add("Australia"); 
        h.add("South Africa"); 
        h.add("India");// adding duplicate elements 
  
        // Displaying the HashSet 
        System.out.println(h); 
        System.out.println("size of the set: "+h.size());
        HashSet h1=new HashSet((Collection) h.clone());
        System.out.println("List contains India or not:" + 
                           h.contains("India")); 
        System.out.println("set h1 is : "+h1);
        // Removing items from HashSet using remove() 
        h.remove("Australia"); 
        System.out.println("List after removing Australia:"+h); 
  
        // Iterating over hash set items 
        System.out.println("Iterating over list:"); 
        Iterator<String> i = h.iterator(); 
        while (i.hasNext()) 
            System.out.println(i.next()); 
        h.clear();
        System.out.println("List after clear method is used: "+h);

        System.out.println("if the set is empty: "+h.isEmpty());
    } 
}
