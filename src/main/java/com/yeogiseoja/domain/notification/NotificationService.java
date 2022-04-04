package com.yeogiseoja.domain.notification;

public interface NotificationService {
    void sendEmail(NotificationCommand.SendEmailRequest sendEmailRequest);
}
