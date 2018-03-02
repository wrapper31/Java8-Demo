package com.lambda.basic;

 class Greeter {

	public void greet(Greeting greeting) {
	//	System.out.println("Hello World ! ");
		greeting.perform();
	}
	
	/* public class ChildGreeter {
		public void childGreets() {
			System.out.println("Child greets the  World ! ");
		}
	}*/
	
	public static void main(String[] args) {
		 Greeter greeter = new Greeter();
		 Greeting greeting = new GreetingImpl();
		
		
		Greeting myLambdafunction = () -> System.out.println("Hello world ");
		
		//greeting.perform();
		//myLambdafunction.perform();
		//pass a behaviour
				//greeter.greet(greeting);
		
		Greeting innerClassGreeting = new Greeting() {
			@Override
			public void perform() {
				// TODO Auto-generated method stub
					 System.out.println("Hello world ");
			}
		};
		
		greeting.perform();
		//innerClassGreeting.perform();

		greeter.greet(myLambdafunction);
		greeter.greet(innerClassGreeting);
		
		// add two numbers 
		
		AddTwoNumbers addFunction = (int x , int y) -> x+y;
		System.out.println(addFunction.addNumbers(10, 20));
	}

}

interface AddTwoNumbers {
	
	public int addNumbers(int a, int b);
}
