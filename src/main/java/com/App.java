package com;

import com.dao.UserDao;

public class App {
	public static void main(String[] args) {
		System.out.println("Welcome..");

		UserDao userDao1 = new UserDao();
		UserDao userDao2 = new UserDao();

		System.out.println(userDao1);
		System.out.println(userDao2);
	}
}
