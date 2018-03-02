package com.java.test;

import java.util.ArrayList;
import static  java.lang.System.out;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LamdaSample {

	public static void main(String[] args) {
		
		System.out.println(isPrime(1));
		System.out.println(isPrime(2));
		System.out.println(isPrime(3));
		System.out.println(isPrime(4));
		List<Integer> values = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		int result = 0;
		
		System.out.println(values.stream()
		 	.filter(e -> e > 3)
		 	.filter(e -> e % 2 == 0)
		 	.map(e-> e * 2)
		 	.findFirst().get());
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		list.replaceAll(in -> Integer.compare(3, in));
		
		System.out.println("0000 : " + list);
		IntStream ins = IntStream.range(1, 6);
		System.out.println(ins.average());
		
		IntStream ins1 = IntStream.of(1,4,5,2);
		
		IntSummaryStatistics sumy = ins1.summaryStatistics();
		sumy.accept(3);
		System.out.println(sumy.getSum());
		
		String[] str = {"A","B","C"};
		Arrays.parallelPrefix(str, String::concat);
		
		System.out.println(str[2]);
		
		Stream<Integer> stream = Stream.of(1,2,3,4).parallel();
		stream.sequential();
		stream.forEach(System.out::print);
		
		//Supplier<T> t = 
  int ints[][] = new int[3][];
  ints[1] = new int[] {1,2,3};
  ints[2] = new int[] {4,5};
  System.out.println("--- "+ ints[2][1]);
  
  int[] ints1 = new int[0b101];
  int len = ints1.length;
  
  for(int i = 1; i < 10 ; i++)
	 out.println(i);
  
  for(int k:ints1)
	System.out.println(k);
	}
	private static boolean isPrime(final int number) {
		
		/*for(int i = 2; i < number ; i++) {
			if(number % i == 0) return false;
		}
		return number > 1;*/
		
		return number > 1 && 
				IntStream.range(2, number).noneMatch(index -> number % index == 0);
		
	}
}
