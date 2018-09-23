package com.miao.rmiclient;

import api.User;
import api.UserService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

@SpringBootApplication
public class RmiclientApplication implements ApplicationContextAware, CommandLineRunner
{
	@Autowired
	private ApplicationContext applicationContext;

	public static void main(String[] args) {
		SpringApplication.run(RmiclientApplication.class, args);
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException
	{
		this.applicationContext=applicationContext;
	}

	@Override
	public void run(String... args) throws Exception
	{
		UserService userService = applicationContext.getBean(UserService.class);
		System.out.println(userService.hello());
		User u = userService.getUser();
		System.out.println(u.toString());
	}
}
