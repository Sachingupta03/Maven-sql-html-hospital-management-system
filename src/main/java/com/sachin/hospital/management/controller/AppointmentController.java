package com.sachin.hospital.management.controller;

import com.sachin.hospital.management.modale.Appointment;
import com.sachin.hospital.management.repositoty.AppointmentRepository;

import java.util.Date;
import java.util.List;

public class AppointmentController {
    private AppointmentRepository repository = new AppointmentRepository();

    public void bookAppointment(int id, int patientId, int doctorId, Date date) {
        try {
            Appointment appointment = new Appointment(id, patientId, doctorId, date);
            repository.bookAppointment(appointment);
            System.out.println(" Appointment booked successfully!");
        } catch (Exception e) {
            System.out.println(" Error booking appointment: " + e.getMessage());
        }
    }

    public void getAllAppointments() {
        List<Appointment> appointments = repository.getAllAppointments();
        if (appointments.isEmpty()) {
            System.out.println("No appointments found!");
        } else {
            for (Appointment a : appointments) {
                a.displayInfo();
            }
        }
    }

}
