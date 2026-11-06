package org.example.smarthospitalnotificationsystem;

import org.springframework.stereotype.Component;

@Component("smsService")
public class SmsNotificationService implements NotificationService {

    @Override
    public void sendNotification(String patientId, String message) {

        System.out.println("Sending SMS notification");
        System.out.println("Patient ID: " + patientId);
        System.out.println("Message: " + message);

    }
}