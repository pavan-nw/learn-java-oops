package com.fsd.training.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataFetcher {

    public static void main(String[] args) throws SQLException {

        System.out.println("Fetching data from MySql DB");

        // variables
        final String url = "jdbc:mysql:///java-dev";
        final String user = "dev";
        final String password = "";

        // establish the connection
        Connection con = DriverManager.getConnection(url, user, password);

        // create JDBC statement object
        Statement st = con.createStatement();

        // prepare SQL query
        String query = "SELECT ID, NAME, CITY, SALARY FROM EMPLOYEE";
        String query_dept = "select * from department";

        // send and execute SQL query in Database software
        ResultSet rs = st.executeQuery(query_dept);

        // process the ResultSet object
        boolean flag = false;
        while (rs.next()) {
            flag = true;
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getInt(4));
        }

        if (flag == true) {
            System.out.println("\nRecords retrieved and displayed");
        } else {
            System.out.println("Record not found");
        }

        // close JDBC objects
        rs.close();
        st.close();
        con.close();
    }
}
