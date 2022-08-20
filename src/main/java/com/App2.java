package com;

import com.bean.RoleBean;
import com.bean.UserBean;

public class App2 {
	public static void main(String[] args) {
		System.out.println("Welcome..");

		RoleBean r = new RoleBean();
		UserBean user = new UserBean(r);
		System.out.println(user.getRole());// hashcode

//		UserBean user1 = new UserBean();
//		user1.setRole(r);

	}
}
