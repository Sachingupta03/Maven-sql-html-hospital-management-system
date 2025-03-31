package com.sachin.hospital.management.modale;

public class Doctor {
    private int id;
    private String name;
    private String specialization;

    public Doctor(int id, String name, String specialization) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getSpecialization() { return specialization; }

    public void displayInfo() {
        System.out.println("ID: " + id + ", Name: " + name + ", Specialization: " + specialization);
    }
}

