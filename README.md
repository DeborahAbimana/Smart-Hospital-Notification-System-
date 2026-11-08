# Smart Hospital Notification System

## 1. Project Description

The Smart Hospital Notification System is a Spring Boot application that demonstrates how Spring IoC (Inversion of Control) and Dependency Injection manage different notification services in a healthcare environment.

The application supports routine patient notifications and emergency alerts using different notification implementations.

## 2. Technologies Used

- Java
- Spring Boot
- Spring Framework
- Maven
- Git and GitHub

## 3. Main Features

- `NotificationService` interface for notification operations.
- `EmailNotificationService` as the default implementation using `@Primary`.
- `SmsNotificationService` registered using `@Component("smsService")`.
- `EmergencyUrgentNotificationService` registered using `@Component("emergencyService")`.
- `@Autowired` for dependency injection.
- `@Qualifier("emergencyService")` for selecting the emergency notification service.
- `@Value` for injecting hospital configuration and environment variables.

## 4. Configuration and Security

The application uses the following configuration variables:

- `HOSPITAL_NAME`: Hospital name, with a default value of `General City Hospital`.
- `HOSPITAL_API_SECRET`: Hospital API secret supplied through an environment variable.

Create a local `.env` file using `.env.example` as a template if you need to keep your local configuration values.

**Important:** Spring Boot does not automatically load `.env` files. Configure the required environment variables in your IDE or operating system before running the application.

Never commit real API secrets or credentials to GitHub.

## 5. How to Run the Application

1. Clone or download this repository.
2. Open the project in IntelliJ IDEA.
3. Make sure Java and Maven are configured.
4. Open Run → Edit Configurations.
5. Select `SmartHospitalNotificationSystemApplication`.
6. Add the following environment variables:

    - `HOSPITAL_API_SECRET=your_secret_key_here`
    - `HOSPITAL_NAME=Central_Medical_Center`

7. Apply the changes and run the application.

## 6. Expected Output

The application demonstrates:

- Routine email notifications.
- Emergency notifications through the emergency service.

## 7. Author

Developed as a Spring Boot assignment demonstrating Spring IoC, dependency injection, configuration management