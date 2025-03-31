package com.sachin.hospital.management.modale;

import java.util.Date;

public class Appointment {
    private int id;
    private int patientId;
    private int doctorId;
    private Date date;



    public Appointment(int id, int patientId, int doctorId, Date date) {
        this.id = id;
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.date = date;

    }

    public int getId() { return id; }
    public int getPatientId() { return patientId; }
    public int getDoctorId() { return doctorId; }
    public Date getDate() { return date;}

    public void displayInfo() {
        System.out.println("Appointment ID: " + id + ", Patient ID: " + patientId +
                ", Doctor ID: " + doctorId + ", Date: " + date);
    }
}
