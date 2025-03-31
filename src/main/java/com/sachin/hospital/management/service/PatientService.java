package com.sachin.hospital.management.service;

import com.sachin.hospital.management.modale.Patient;
import com.sachin.hospital.management.repositoty.PatientRepository;

import java.util.List;

public class PatientService {
    private PatientRepository repository = new PatientRepository();

    public void addPatient(int id, String name, int age, String disease) {
        try {
            Patient patient = new Patient(id, name, age, disease);
            repository.addPatient(patient);
            System.out.println(" Patient added successfully!");
        } catch (Exception e) {
            System.out.println(" Error adding patient: " + e.getMessage());
        }
    }

    public void getAllPatients() {
        List<Patient> patients = repository.getAllPatients();
        if (patients.isEmpty()) {
            System.out.println("No patients found!");
        } else {
            for (Patient p : patients) {
                p.displayInfo();
            }
        }
    }

    public void getPatientById(int id) {
        try {
            Patient patient = repository.getPatientById(id);
            if (patient != null) {
                patient.displayInfo();
            } else {
                System.out.println(" Patient not found!");
            }
        } catch (Exception e) {
            System.out.println(" Error fetching patient: " + e.getMessage());
        }
    }

    public void deletePatient(int id) {
        try {
            boolean removed = repository.deletePatient(id);
            if (removed) {
                System.out.println(" Patient deleted successfully!");
            } else {
                System.out.println(" Patient not found!");
            }
        } catch (Exception e) {
            System.out.println(" Error deleting patient: " + e.getMessage());
        }
    }
}
