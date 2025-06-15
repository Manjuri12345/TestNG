package com.app.testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class DependsonMethodTest {
	@Test
	public void user() {
		System.out.println("User");
	}

	@Test
	public void pass() {
		System.out.println("pass");
	}

	@Test(dependsOnMethods = "user")
	public void login() {
		System.out.println("Login");
	}

}
