package org.SRK.userApp.controller;

import java.util.Scanner;

import org.SRK.userApp.UserConigue;
import org.SRK.userApp.dto.User;
import org.SRK.userApp.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class VerifyUser {
	public static void main(String[] args) {
		ApplicationContext con=new AnnotationConfigApplicationContext(UserConigue.class);
		UserService s=con.getBean(UserService.class);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter phon");
		long phon=sc.nextLong();
		System.out.println("enter pasw");
		String pasw=sc.next();
		User u=s.verifyUser(phon, pasw);
		if(u!=null) {
			System.out.println("id  :"+u.getId());
			System.out.println("name  :"+u.getName());
			System.out.println("phon  :"+u.getPhone());
			System.out.println("pasw  :"+u.getPassword());
		}
	}
}
