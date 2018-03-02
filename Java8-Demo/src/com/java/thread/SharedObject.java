package com.java.thread;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class SharedObject {

	private int x = 0;
	private int y = 0;
	private int a = 0;
	private int b = 0;

	BlockingQueue<Boolean> doneX = new LinkedBlockingQueue<Boolean>(3);
	BlockingQueue<Boolean> doneY = new LinkedBlockingQueue<Boolean>(3);
	private volatile boolean isFirst = true;

	public /* synchronized */ void workOnX() {

		try {
			if (isFirst || doneY.take()) {
				x = 1;
				a = x;
				System.out.println("a=" + a);
				doneX.put(Boolean.TRUE);
				if (isFirst)
					isFirst = false;
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*
		 * notifyAll();
		 * 
		 * try { wait(10); } catch (InterruptedException e) { // TODO Auto-generated
		 * catch block e.printStackTrace(); }
		 */
	}

	public /* synchronized */ void workOnY() {

		try {
			if (doneX.take()) {
				y = 1;
				b = y;
				System.out.println("b=" + b);
				doneY.put(Boolean.TRUE);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		/*
		 * notifyAll(); try { wait(10); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
	}

}
