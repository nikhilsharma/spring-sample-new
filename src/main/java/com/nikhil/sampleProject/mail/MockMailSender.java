package com.nikhil.sampleProject.mail;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

@Component
public class MockMailSender implements MailSender {

	public static final Log log = LogFactory.getLog(MockMailSender.class);
	
	/* (non-Javadoc)
	 * @see com.nikhil.sampleProject.mail.MailSender#send(java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public void send(String to, String subject, String body) {
		log.info("Sending mail to : "+to);
		log.info("Subject : "+subject);
		log.info("Body : "+to);
	}
}
