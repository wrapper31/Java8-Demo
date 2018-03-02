package com.lambda.basic;

public class TypeInferenceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//MyStringLength myStringLambda =  a -> a.length(); 
		//System.out.println(myStringLambda.stringLength("Find my Length"));
		
		printLambda( a -> a.length());

	}
	
	public static void printLambda(MyStringLength a) {
		System.out.println(a.stringLength("Hello String lambda "));
	}
	
	interface MyStringLength{
		
		int stringLength(String a);
	}

}
