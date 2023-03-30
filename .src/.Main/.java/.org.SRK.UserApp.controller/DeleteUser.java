package org.SRK.userApp.controller;

import org.SRK.userApp.UserConigue;
import org.SRK.userApp.dto.User;
import org.SRK.userApp.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DeleteUser {
	public static void main(String[] args) {
		ApplicationContext con=new AnnotationConfigApplicationContext(UserConigue.class);
		UserService s=con.getBean(UserService.class);
		boolean u=s.deleteUser(2);
		if(u=true) {
			System.out.println("data has been deleted");
		}
	}
}
