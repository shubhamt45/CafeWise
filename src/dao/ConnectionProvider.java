/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.*;
/**
 *
 * @author shubham c thete
 */
// to create the connection with the database we have created this package
public class ConnectionProvider 
{
    public static Connection getCon()
    {
        try
        {
       // Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cms?useSSL=false","root","Shubham@123_");
        return con;
        
         }
        catch(Exception e)
        {
            return null;
        }
}
}
