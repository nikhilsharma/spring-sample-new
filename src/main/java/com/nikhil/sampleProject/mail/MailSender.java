package com.nikhil.sampleProject.mail;

public interface MailSender {

	void send(String to, String subject, String body);

}