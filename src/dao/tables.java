/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.swing.JOptionPane;

/**
 *
 * @author shubham c thete
 */
public class tables {

    public static void main(String args[]) {
        try {
            String userTable = "CREATE TABLE user(id int AUTO_INCREMENT primary key, name varchar(200),email varchar(200),mobileNumber varchar(10),address varchar(200),password varchar(200),securityQuestion varchar(200),answer varchar(20),UNIQUE(email))";
            String adminDetails = "insert into user(name,email,mobileNumber,address,password,securityQuestion,answer,status) values ('Admin','admin@gmail.com','123456789','India','admin','What is your favourate subject?','intrest','true')";
            String categoryTable = "create table category(id int AUTO_INCREMENT primary key,name varchar(200))";
            String productTable = "create table product(id int AUTO_INCREMENT primary key,name varchar(200),category varchar(200),price varchar(200))";
             String billTable = "create table bill(id int  primary key,name varchar(200),mobileNumber varchar(200),email varchar(200),date varchar(50),total varchar(200),createdBy varchar(200))";
            
            
           // Dboperations.setDataorDelete(userTable, "User table created successfully");
           // Dboperations.setDataorDelete(adminDetails, "admin details added successfully");
           // Dboperations.setDataorDelete(categoryTable, "Category Table Created successfully");
           // Dboperations.setDataorDelete(productTable, "Product Table Created successfully");
             Dboperations.setDataorDelete(billTable, "Bill Table Created successfully");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
