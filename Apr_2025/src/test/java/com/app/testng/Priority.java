package com.app.testng;

import org.testng.annotations.Test;

public class Priority {
	@Test (priority = 1)
	public void user() {
		System.out.println("User");
	}
	@Test (priority = 2)
	public void pass() {
		System.out.println("pass");
	}
	@Test (priority = 3)
	public void login() {
		System.out.println("Login");
	}

}
