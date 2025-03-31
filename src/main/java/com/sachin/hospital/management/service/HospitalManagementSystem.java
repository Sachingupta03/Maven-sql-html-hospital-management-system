package com.sachin.hospital.management.service;


import com.sachin.hospital.management.repositoty.AppointmentRepository;
import com.sachin.hospital.management.repositoty.DoctorRepository;
import com.sachin.hospital.management.repositoty.PatientRepository;
import com.sachin.hospital.management.service.AppointmentService;
import com.sachin.hospital.management.service.PatientService;
import com.sachin.hospital.management.service.DoctorService;

import java.util.Date;
import java.util.Scanner;

public class HospitalManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating repository and service instances
        AppointmentService appointmentService = new AppointmentService();
        PatientService patientService = new PatientService();
        DoctorService doctorService = new DoctorService();

        while (true) {
            System.out.println("\n===== Hospital Management System =====");
            System.out.println("1. Register Doctor");
            System.out.println("2. Register Patient");
            System.out.println("3. Book Appointment");
            System.out.println("4. Display All Data");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter Doctor ID: ");
                        int docId = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Enter Name: ");
                        String docName = scanner.nextLine();
                        System.out.print("Enter Specialization: ");
                        String specialization = scanner.nextLine();
                        doctorService.addDoctor(docId, docName, specialization);
                        System.out.println("Doctor Registered Successfully!");
                        break;

                    case 2:
                        System.out.print("Enter Patient ID: ");
                        int patId = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Enter Name: ");
                        String patName = scanner.nextLine();
                        System.out.print("Enter Age: ");
                        int age = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Enter Disease: ");
                        String disease = scanner.nextLine();
                        patientService.addPatient(patId, patName, age, disease);
                        System.out.println("Patient Registered Successfully!");
                        break;

                    case 3:
                        System.out.print("Enter Appointment ID: ");
                        int appId = scanner.nextInt();
                        System.out.print("Enter Patient ID: ");
                        int patientId = scanner.nextInt();
                        System.out.print("Enter Doctor ID: ");
                        int doctorId = scanner.nextInt();
                        appointmentService.bookAppointment(appId, patientId, doctorId, new Date());
                        System.out.println("Appointment Booked Successfully!");
                        break;

                    case 4:
                        appointmentService.getAllAppointments();
                        break;

                    case 5:
                        System.out.println("Exiting... Thank you!");
                        scanner.close();
                        break;

                    default:
                        System.out.println("Invalid choice! Please try again.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
