package com.java.thread;

public class WorkingOnXandY {

	public static void main(String[] args) {

		SharedObject obj = new SharedObject();
		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < 5; i++) {
					obj.workOnX();
				}
			}
		});
		
		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < 5; i++) {
					obj.workOnY();
				}
			}
		});

		thread1.start();
		thread2.start();
		// thread1.start();
	}
}
