package com.to.Collection;

import java.util.ArrayList;
import java.util.List;

public class Copying {

    public static void main(String[] args) {
    	 List<String> colours = new ArrayList<>();
    	 
         colours.add("blue");
         colours.add("orange");
         colours.add("red");
         colours.add("green");
    
       List<String> colours1  = new ArrayList<String>(colours); 
        System.out.println(colours1);
    }
}