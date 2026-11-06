package org.example.smarthospitalnotificationsystem;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class EmailNotificationService implements NotificationService {
    @Override
    public void sendNotification(String patientId, String message) {
   System.out.println("Sending EMAIL notification");
   System.out.println("Patient ID: " + patientId);
   System.out.println("Message: " + message);

        }
    }