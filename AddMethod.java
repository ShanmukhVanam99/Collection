package com.to.Collection;

import java.util.ArrayList;
import java.util.List;

public class AddMethod {

		public static void main(String[] args) {
			
			List<String> actors = new ArrayList<>();
			actors.add("Jack Nicholson");
			actors.add("Marlon Brando");
			System.out.println(actors);
			List<String> copyOfActors = actors;
			System.out.println(copyOfActors);
			actors.add("Robert De Niro");
			System.out.println(actors);
		    System.out.println(copyOfActors);
					}

	}
