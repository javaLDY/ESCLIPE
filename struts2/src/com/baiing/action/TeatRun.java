package com.baiing.action;

class Mythread1 implements Runnable{

	private int tickets = 5;
	
	@Override
	public void run() {
		while(tickets>0){
			tickets--;
			System.out.println(Thread.currentThread().getName()+"还剩"+tickets+"票");
		}
	}
	
}

public class TeatRun {
	
	public static void main(String[] args) {
		Mythread1 mt = new Mythread1();
		
		Thread t1 = new Thread(mt,"窗口1");
		Thread t2 = new Thread(mt,"窗口2");
		Thread t3 = new Thread(mt,"窗口3");
		
		t1.start();
		t2.start();
		t3.start();
	}
	
}
