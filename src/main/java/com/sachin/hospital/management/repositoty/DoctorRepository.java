package com.sachin.hospital.management.repositoty;

import com.sachin.hospital.management.modale.Doctor;

import java.util.ArrayList;
import java.util.List;

public class DoctorRepository {
    private List<Doctor> doctors = new ArrayList<> ();

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public List<Doctor> getAllDoctors() {
        return doctors;
    }

    public Doctor getDoctorById(int id) {
        return doctors.stream().filter(d -> d.getId() == id).findFirst().orElse(null);
    }

    public boolean deleteDoctor(int id) {
        return doctors.removeIf(doctor -> doctor.getId() == id);
    }
}
