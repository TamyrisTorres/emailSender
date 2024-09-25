package com.torrestech.emailService.core;

public record EmailRequest(String to, String subject, String body) {
}
