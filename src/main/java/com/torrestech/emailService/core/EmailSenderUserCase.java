package com.torrestech.emailService.core;

public interface EmailSenderUserCase {

    void sendEmail(String to, String subject, String body);
}
