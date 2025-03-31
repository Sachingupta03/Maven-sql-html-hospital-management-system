package com.sachin.hospital.management.connection;


import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabasesConnection {


private static final String URL = "jdbc:mysql://localhost:3306/hospital_db";
private static final String USER = "root";
private static final String PASSWORD = "Sachin@10";

public static java.sql.Connection getConnection() throws SQLException {
    return DriverManager.getConnection(URL, USER, PASSWORD);
}

public static void main(String[] args) {
    try {
        Connection conn = (Connection) getConnection ();
        try {
            System.out.println ("Connected to Database Successfully!");
        } finally {
            conn.close ();
        }
    } catch (SQLException e) {
        e.printStackTrace ();
    }
}
}
