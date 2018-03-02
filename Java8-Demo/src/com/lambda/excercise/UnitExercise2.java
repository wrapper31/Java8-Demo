package com.lambda.excercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.function.Predicate;

public class UnitExercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> persons = Arrays.asList(new Person("Alex", "Roger", 35)
				, new Person("Susan", "Pappilon", 35),
				new Person("Ava", "Rose", 3),new Person("Adam", "Kalinski", 40),
				new Person("Kevin", "Muron", 69),
				new Person("Nancy", "Dillon", 60));
		
		 
	    // lambda way 
		Comparator<Person> c = (p1, p2) -> p1.getFirstName().compareTo(p2.getFirstName()) ;
		Collections.sort(persons,c );
		System.out.println("Lambda Way Sorting : ");
		printLastNameWithConditon(persons, p -> true);
		
		// print people whose last name does not start with R
		System.out.println("conventional Way name not start with R ");
		//printLastNameWithoutR(persons);
		
		// lambda way 
		
		System.out.println("----------------------");
		printLastNameWithConditon(persons,  p -> p.getFirstName().startsWith("A"));
	}
	
	private static void printLastNameWithConditon(List<Person> persons, Predicate<Person> condition) {
		// TODO Auto-generated method stub
		for (Person person : persons) {
			if(condition.test(person))
			System.out.println(person.toString());
		}
	}

}

