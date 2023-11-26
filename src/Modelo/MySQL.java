/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Gustavo
 */
public class MySQL {
    Connection Conexion;
      
    public Connection base_datos() throws SQLException
    {   try {
      
            Class.forName("com.mysql.jdbc.Driver"); // ESTABLECE LA CONEXION BASE DE DATOS, PONER LA DIRECCION DE MYSQL
            Conexion = DriverManager.getConnection("jdbc:mysql://localhost/zoo1","root","");// CONEXION ALA BASE DE DATOS ABIERTA
                       
        } catch (ClassNotFoundException ex) {
          JOptionPane.showMessageDialog(null, "Error de  conexión con el servidor ");
      } return Conexion;
    }

} 

