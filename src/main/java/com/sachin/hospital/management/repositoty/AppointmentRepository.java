package com.sachin.hospital.management.repositoty;

import com.sachin.hospital.management.modale.Appointment;

import java.util.ArrayList;
import java.util.List;

public class AppointmentRepository {
    private List<Appointment> appointments = new ArrayList<> ();

    public void bookAppointment(Appointment appointment) {
        appointments.add(appointment);
    }

    public List<Appointment> getAllAppointments() {
        return appointments;
    }

    public Appointment getAppointmentById(int id) {
        return appointments.stream().filter(a -> a.getId() == id).findFirst().orElse(null);
    }

    public boolean cancelAppointment(int id) {
        return appointments.removeIf(appointment -> appointment.getId() == id);
    }

}
