package com.jayesh.jdbc;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class StudForm {
    public static void main(String[] args) {

        Frame frame = new Frame();
        Panel panel = new Panel();
        Label lblID = new Label();
        TextField txtID = new TextField();
        Label lblName = new Label();
        TextField txtName = new TextField();
        Button btnADD = new Button("ADD");


        frame.setSize(400,400);
        panel.setLayout(null);

        lblID.setBounds(50,50,50,30);
        lblID.setText("ID:");
        panel.add(lblID);

        txtID.setBounds(110,50,100,30);
        panel.add(txtID);

        lblName.setBounds(50,90,50,30);
        lblName.setText("Name:");
        panel.add(lblName);

        txtName.setBounds(110,90,100,30);
        panel.add(txtName);

        btnADD.setBounds(50,130,70,30);
        panel.add(btnADD);

        btnADD.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Add Button Clicked....");

                try{

                    // Step1 Register the Driver
                    Driver driver = new oracle.jdbc.driver.OracleDriver();
                    DriverManager.registerDriver(driver);
                    System.out.println("Driver Register Successfully!!!");
                    // Step2 Get the Connection
                    Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521","system","Jayesh");
                    System.out.println("Connection successfully Done!!!");

                    // Step 3 Create Statement Object

                    Statement stmt = connection.createStatement();
                    System.out.println("Statement Object Created...");

                    //Step 4 Execute the Query
                    //stmt.executeUpdate("create table StudentInfo(id number(3),name varchar2(10))");
                    stmt.executeUpdate("insert into StudentInfo values("+txtID.getText().toString()+",'"+txtName.getText().toString()+"')");
                    System.out.println("Query Executed...");

                    // Close Connection
                    connection.close();
                    System.out.println("Connection is Closed...");


                }catch(SQLException ex){

                    System.out.println("Error in Connection....."+ex.getMessage());
                }
            }
        });

        frame.add(panel);
        frame.setVisible(true);
    }
}
