package com.bridgelabz.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EmployeePayrollService {
    public static void main(String[] args) {
        System.out.println("Welcome to EmployeePayroll Service JDBC program");
        getConnection();
    }

    private static Connection getConnection() {
        String url = "jdbc:mysql://localhost/employeepayroll_service";
        String username = "root";
        String password = "rushiraj@123456789";
        Connection connection = null;
        try {
              // load and register the driver
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connection Established");
        } catch (SQLException e) {
            System.out.println(e);
        }
        return connection;
    }
}
