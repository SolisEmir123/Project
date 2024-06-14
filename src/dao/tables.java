/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import javax.swing.JOptionPane;
/**
 *
 * @author emiry
 */
public class tables {
    public static void main(String[] args) {
        try {
            String userTable = "create table user(id int AUTO_INCREMENT primary key,name varchar(200), email varchar(200),mobileNumber varchar(200),password varchar(200), status varchar(20),UNIQUE (email))";
            String adminDetails = "insert into user(name,email,mobileNumber,password,status) values('Admin','admin@gmail.com','1234567890','cbtis2008','true')";
            DbOperations.setDataorDelete(userTable, "Tabla de Usuario creada");
            DbOperations.setDataorDelete(adminDetails, "Usuario de Admin Creado");
        }
        catch(Exception e) {
                JOptionPane.showMessageDialog(null, e);
                }
    }
}
