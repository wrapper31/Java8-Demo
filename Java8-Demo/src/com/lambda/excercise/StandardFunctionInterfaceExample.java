package com.lambda.excercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class StandardFunctionInterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Person> persons = Arrays.asList(new Person("Alex", "Roger", 35)
				, new Person("Susan", "Pappilon", 35),
				new Person("Ava", "Rose", 3),new Person("Adam", "Kalinski", 40),
				new Person("Kevin", "Muron", 69),
				new Person("Nancy", "Dillon", 60));
		
		
	    // lambda way 
		Comparator<Person> c = (p1, p2) -> p1.getFirstName().compareTo(p2.getFirstName()) ;
		Collections.sort(persons,c);
		/*System.out.println("Lambda Way Sorting : ");
		performConditionally(persons, p -> true);
		*/
		// print people whose last name does not start with R
		System.out.println("conventional Way name not start with R ");
		//printLastNameWithoutR(persons);
		
		// lambda way 
		
		System.out.println("----------------------");
		performConditionally(persons,  p -> p.getFirstName().startsWith("A"), p -> System.out.println(p));
	}
	
	private static void performConditionally(List<Person> persons, Predicate<Person> condition, Consumer<Person> consumer) {
		// TODO Auto-generated method stub
		for (Person person : persons) {
			if(condition.test(person))
			   consumer.accept(person);
		}
	}
}
