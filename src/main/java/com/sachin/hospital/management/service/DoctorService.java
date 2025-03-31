package com.sachin.hospital.management.service;

import com.sachin.hospital.management.modale.Doctor;
import com.sachin.hospital.management.repositoty.DoctorRepository;

import java.util.List;

public class DoctorService {
    private DoctorRepository repository = new DoctorRepository();

    public void addDoctor(int id, String name, String specialization) {
        try {
            Doctor doctor = new Doctor(id, name, specialization);
            repository.addDoctor(doctor);
            System.out.println(" Doctor added successfully!");
        } catch (Exception e) {
            System.out.println(" Error adding doctor: " + e.getMessage());
        }
    }

    public void getAllDoctors() {
        List<Doctor> doctors = repository.getAllDoctors();
        if (doctors.isEmpty()) {
            System.out.println("No doctors found!");
        } else {
            for (Doctor d : doctors) {
                d.displayInfo();
            }
        }
    }

    public void getDoctorById(int id) {
        try {
            Doctor doctor = repository.getDoctorById(id);
            if (doctor != null) {
                doctor.displayInfo();
            } else {
                System.out.println(" Doctor not found!");
            }
        } catch (Exception e) {
            System.out.println(" Error fetching doctor: " + e.getMessage());
        }
    }

    public void deleteDoctor(int id) {
        try {
            boolean removed = repository.deleteDoctor(id);
            if (removed) {
                System.out.println(" Doctor deleted successfully!");
            } else {
                System.out.println(" Doctor not found!");
            }
        } catch (Exception e) {
            System.out.println(" Error deleting doctor: " + e.getMessage());
        }
    }

}
