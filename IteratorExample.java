package com.to.Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorExample {
	public static void main(String[] args) 
	  {
		List<String> names = new LinkedList<>();
		names.add("Rams");
		names.add("Posa");
		names.add("Chinni");
		
		// Getting Iterator
		Iterator<String> namesIterator = names.iterator();
			
		// Traversing elements
		while(namesIterator.hasNext()){
			System.out.println(namesIterator.next());			
		}	
		
	  }
}
