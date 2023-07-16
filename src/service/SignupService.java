/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

/**
 *
 * @author biswa
 */
import java.sql.*;
public class SignupService {
    public static  boolean addUser(String name, String email, String password, String address){
        try{
            Connection cn = repository.ConnectionDB.getConnectiondb();
            Statement st = cn.createStatement();
            st.executeUpdate("insert into user_table values('"+name+"','"+email+"','"+password+"','"+address+"')");
            return true;
        }catch(Exception ee){
            ee.printStackTrace();
        }
        return false;
    }
    
}
