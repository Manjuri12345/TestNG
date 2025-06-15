package com.app.testng;

public class ParallelExeTest {

	public static void main(String[] args) throws InterruptedException {
		A a = new A();
		B b = new B();
		a.test1();
		b.start();
	}

	
			
	
}

class A {

	public void test1() throws InterruptedException {
		System.out.println(Thread.currentThread().getId());
		Thread.sleep(2000);
		System.out.println("test1");
	}
}

class B extends Thread {
	public void run() {
		System.out.println(Thread.currentThread().getId());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("test2");
	}

}