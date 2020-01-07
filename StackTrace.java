package com.to.Collection;

import java.util.Iterator;
import java.util.Stack;



public class StackTrace {
	public static void main(String[] args) {

		Stack<String> stack = new Stack<String>();  

		stack.push("Ayush");  

		stack.push("Garvit");  

		stack.push("Amit");  

		stack.push("Ashish");  

		stack.push("Garima");
		stack.push("ravi");

		stack.pop();  

		Iterator<String> itr=stack.iterator();  

		while(itr.hasNext()){  

		System.out.println(itr.next());  

		}  
		



	}
}