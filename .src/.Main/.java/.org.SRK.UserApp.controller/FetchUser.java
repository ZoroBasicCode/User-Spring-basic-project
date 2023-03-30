package org.SRK.userApp.controller;

import org.SRK.userApp.UserConigue;
import org.SRK.userApp.dto.User;
import org.SRK.userApp.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FetchUser {
	public static void main(String[] args) {
		ApplicationContext con=new AnnotationConfigApplicationContext(UserConigue.class);
		UserService s=con.getBean(UserService.class);
		User u=s.fetchUser(1);
		if(u!=null) {
			System.out.println(" id  :"+u.getId());
			System.out.println("name  :"+u.getName());
			System.out.println("phone :"+u.getPhone());
		}
	}
}
