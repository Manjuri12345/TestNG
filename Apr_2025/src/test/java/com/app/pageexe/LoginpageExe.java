package com.app.pageexe;

import com.app.base.Base;
import com.app.locator.LoginPageLocator;

public class LoginpageExe extends LoginPageLocator{
	
	public static void username() {
		Base.inputKey( new LoginPageLocator().getUsername(), Base.prop_reuse("username"));
	}
	
	public static void password() {
		Base.inputKey( new LoginPageLocator().getPassword(), Base.prop_reuse("password"));
	}

}
