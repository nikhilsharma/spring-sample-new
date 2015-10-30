package com.nikhil.sampleProject.core;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nikhil.sampleProject.mail.MailSender;



@RestController
public class MailController {

	//private MockMailSender mailSender = new MockMailSender();
	@Resource
	private MailSender mailSender;
	@RequestMapping("/mail")
	public String mail() {
		mailSender.send("me@email.com", "Test Subject", "Test Body");
		return "Mail Sent";
	}
}
