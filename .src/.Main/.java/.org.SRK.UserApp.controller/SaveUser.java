package org.SRK.userApp.controller;

import org.SRK.userApp.UserConigue;
import org.SRK.userApp.dto.User;
import org.SRK.userApp.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SaveUser {
	public static void main(String[] args) {
		ApplicationContext con=new AnnotationConfigApplicationContext(UserConigue.class);
		User u=new User();
		u.setName("ABC");
		u.setPhone(777);
		u.setPassword("1234");
		UserService s=con.getBean(UserService.class);
		u=s.saveUser(u);
		if(u!=null) {
			System.out.println("user is inserted wiht id "+u.getId());
		}
	}
}
