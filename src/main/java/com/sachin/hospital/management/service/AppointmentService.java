package com.sachin.hospital.management.service;

import com.sachin.hospital.management.modale.Appointment;
import com.sachin.hospital.management.repositoty.AppointmentRepository;

import java.util.Date;
import java.util.List;

public class AppointmentService {
    private AppointmentRepository repository = new AppointmentRepository();

    public void bookAppointment(int id, int patientId, int doctorId, Date date ) {
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

    public void getAppointmentById(int id) {
        try {
            Appointment appointment = repository.getAppointmentById(id);
            if (appointment != null) {
                appointment.displayInfo();
            } else {
                System.out.println(" Appointment not found!");
            }
        } catch (Exception e) {
            System.out.println(" Error fetching appointment: " + e.getMessage());
        }
    }

    public void cancelAppointment(int id) {
        try {
            boolean removed = repository.cancelAppointment(id);
            if (removed) {
                System.out.println(" Appointment cancelled successfully!");
            } else {
                System.out.println(" Appointment not found!");
            }
        } catch (Exception e) {
            System.out.println(" Error cancelling appointment: " + e.getMessage());
        }
    }
}
