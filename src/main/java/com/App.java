package com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.UserDao;

public class App {
	public static void main(String[] args) {
		System.out.println("Welcome..");

//		UserDao userDao1 = new UserDao();
//		UserDao userDao2 = new UserDao();
//
//		System.out.println(userDao1);
//		System.out.println(userDao2);

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		System.out.println(context);

		UserDao userDao1 = context.getBean("userDao", UserDao.class);
		UserDao userDao2 = context.getBean("userDao", UserDao.class);
		UserDao userDao3 = context.getBean("userDao", UserDao.class);

		System.out.println(userDao1);
		System.out.println(userDao2);
		System.out.println(userDao3);

		System.out.println(userDao1.getDbName());

		context.registerShutdownHook();// shut down
	}
}
