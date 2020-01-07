package com.to.Collection;

import java.io.IOException;
import java.util.ArrayList;

public class ArrayListt {
	public static void main(String[] args) 
            throws IOException 
{ 
int n = 5; 
ArrayList<Integer> arrli = new ArrayList<Integer>(n); 
for (int i=1; i<=n; i++) 
 arrli.add(i); 
System.out.println(arrli); 
arrli.remove(4); 
System.out.println(arrli);  
for (int i=0; i<arrli.size(); i++) 
 System.out.print(arrli.get(i)+" "); 
} 
}
