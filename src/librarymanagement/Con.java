/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagement;

import java.sql.*;

/**
 *
 * @author ravi
 */
public class Con {
    Connection c;
    Statement s;
    public Con(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/Library","root","Alpha#123");
            s = c.createStatement();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
    }
}
