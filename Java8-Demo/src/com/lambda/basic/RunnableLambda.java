package com.lambda.basic;

public class RunnableLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread myThread = new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Runing Thread 1");
			}
		});
		
		myThread.start();
		Thread lambdaThread = new Thread(() -> System.out.println("running thread 2"));
		lambdaThread.run();
	}

}
