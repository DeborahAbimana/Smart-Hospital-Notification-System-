
package org.example.smarthospitalnotificationsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;

@Component
public class PatientAlertProcessor {
    @Value("${hospital.name:General City Hospital}")
    private String hospitalName;

    @Value("${HOSPITAL_API_SECRET}")
    private String hospitalApiSecret;

    @Autowired
    private NotificationService notificationService;

    @Autowired
    @Qualifier("emergencyService")
    private NotificationService emergencyNotificationService;

    public void processRoutineAlert(String patientId, String message) {
        notificationService.sendNotification(patientId, message);
    }

    public void processEmergencyAlert(String patientId, String message) {
        emergencyNotificationService.sendNotification(patientId, message);
    }
}
