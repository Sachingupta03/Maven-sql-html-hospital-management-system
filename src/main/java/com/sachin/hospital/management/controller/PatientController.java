package com.sachin.hospital.management.controller;

import com.sachin.hospital.management.modale.Patient;
import com.sachin.hospital.management.repositoty.PatientRepository;

import java.util.List;

public class PatientController {
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

}
