package com.yeogiseoja.infrastructure.notification;

import com.yeogiseoja.domain.notification.NotificationCommand;
import com.yeogiseoja.domain.notification.NotificationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class NotificationExecutor implements NotificationService {
    @Override
    public void sendEmail(NotificationCommand.SendEmailRequest sendEmailRequest) {

    }
}
