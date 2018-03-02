package com.lambda.excercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

public class Unit1Excercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Person> persons = Arrays.asList(new Person("Alex", "Roger", 35)
				, new Person("Susan", "Pappilon", 35),
				new Person("Ava", "Rose", 3),new Person("Adam", "Kalinski", 40),
				new Person("Kevin", "Muron", 69),
				new Person("Nancy", "Dillon", 60));
		
		System.out.println("Before Sorting : ");
		printLastNameWithConditon(persons,p->true);
		
		// java conventional way 
		/*Collections.sort(persons, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				return o1.getFirstName().compareTo(o2.getFirstName());
			}
			
		});*/
		
	    // lambda way 
		Comparator<Person> c = (p1, p2) -> p1.getFirstName().compareTo(p2.getFirstName()) ;
		Collections.sort(persons,c );
		System.out.println("Lambda Way Sorting : ");
		printLastNameWithConditon(persons, p -> true);
		
		// print people whose last name does not start with R
		System.out.println("conventional Way name not start with R ");
		//printLastNameWithoutR(persons);
		
		// lambda way 
		
		printLastNameWithConditon(persons, new Condition() {
			
			@Override
			public boolean test(Person p) {
				// TODO Auto-generated method stub
				return !p.getFirstName().startsWith("A");
			}
		});
		
		
		System.out.println("----------------------");
		printLastNameWithConditon(persons,  p -> p.getFirstName().startsWith("A"));
	}
	
	private static void printLastNameWithConditon(List<Person> persons, Condition condition) {
		// TODO Auto-generated method stub
		for (Person person : persons) {
			if(condition.test(person))
			System.out.println(person.toString());
		}
	}

	/*public static void printPeople(List<Person> people) {
		for (Person person : people) {
			System.out.println(person.toString());
		}
	}*/

}


interface Condition {
	boolean test(Person p);
}
