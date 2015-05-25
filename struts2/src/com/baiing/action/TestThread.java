package com.baiing.action;


class Mythread extends Thread{
	
	private int tickets = 5;
	
	private String name;
	
	public Mythread(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		
		while(tickets>0){
			tickets--;
			System.out.println(name+"还剩"+tickets+"票");
		}
		
	}

}

public class TestThread {
	
	public static void main(String[] args) {
		
		Mythread mt1 = new Mythread("窗口1");
		Mythread mt2 = new Mythread("窗口2");
		Mythread mt3 = new Mythread("窗口3");
		
		mt1.start();
		mt2.start();
		mt3.start();
	}
}
