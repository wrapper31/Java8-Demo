package com.java.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		
		List<Integer> myList = new ArrayList<>();
		for(int i=0;i<100;i++) myList.add(i);
		//sequential stream
		Stream<Integer> sequentialStream = myList.stream();
		
		//parallel stream
		Stream<Integer> parallelStream = myList.parallelStream();
		 // using lambda with Stream API , filter example
		Stream<Integer> highNums = parallelStream.filter(p -> p>10);
		//using lamda in forEach
		highNums.forEach(p -> System.out.println("High Nums Parallel : " +p));
		
		Stream<Integer> sequentialHighNums = sequentialStream.filter( p -> p> 90);
		
		sequentialHighNums.forEach(p -> System.out.println("high Nums seq = "+p));
		
		Stream stream = Stream.of(1,2,3,4);
		stream.toArray();
		Runnable r = () -> {
			System.out.println("");
		};
		
		
		Runnable r1 = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("");
			}
		};
		
		
	}
}
