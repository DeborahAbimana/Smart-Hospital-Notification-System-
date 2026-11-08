package org.example.smarthospitalnotificationsystem;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication


public class SmartHospitalNotificationSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmartHospitalNotificationSystemApplication.class, args);
    }

@Bean
    CommandLineRunner testNotification(PatientAlertProcessor processor){
        return args ->{
            System.out.println("======== ROUTINE NOTIFICATION======");
            processor.processRoutineAlert(
                    "001","Your appointment is tomorrow."
            );
            System.out.println("\n======= EMERGENCY NOTIFICATION ======");
            processor.processEmergencyAlert(
                    "003","Emergency Alert"
            );
        };

}
}
