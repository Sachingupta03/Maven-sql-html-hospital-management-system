package com.sachin.hospital.management.repositoty;

import com.sachin.hospital.management.modale.Patient;

import java.util.ArrayList;
import java.util.List;

public class PatientRepository {
    private List<Patient> patients = new ArrayList<> ();

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public List<Patient> getAllPatients() {
        return patients;
    }

    public Patient getPatientById(int id) {
        return patients.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
    }

    public boolean deletePatient(int id) {
        return patients.removeIf(patient -> patient.getId() == id);
    }

}
