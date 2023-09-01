package com.email.service;

import org.springframework.stereotype.Service;

import com.email.model.EmailDetails;

@Service
public interface EmailService {

	  String sendSimpleMail(EmailDetails details);
	  
	    // Method
	    // To send an email with attachment
	    String sendMailWithAttachment(EmailDetails details);
}
