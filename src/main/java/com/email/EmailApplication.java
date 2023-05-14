package com.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EmailApplication{
	@Autowired
	private EmailService emailService;

	public static void main(String[] args) {
		SpringApplication.run(EmailApplication.class, args);

	}

	@GetMapping("/send")
	public String sendEmail() {
		String to = "deepakdangi101@gmail.com";
		String subject = "Test Email";
		String text = "This is a test email";
		emailService.sendSimpleMessage(to, subject, text);
		return "done";
	}

}
