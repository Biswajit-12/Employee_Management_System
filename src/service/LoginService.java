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
public class LoginService {
    public static boolean validUser(String email, String password){
        try{
            Connection cn = repository.ConnectionDB.getConnectiondb();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("select * from user_table where email='"+email+"' and password='"+password+"'");
            while(rs.next()){
                return true;
            }
        }catch(Exception ee){
            ee.printStackTrace();
        }
        return false;
    }
    
}
