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

public class UpdateService {

    public static boolean updateUser(String name, String email, String password, String address) {
        try {
            Connection cn = repository.ConnectionDB.getConnectiondb();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("select name from user_table where name = '" + name + "'");
            while (rs.next()) {
                st.executeUpdate("UPDATE user_table SET email = '" + email + "', password = '" + password + "', address = '" + address + "' WHERE name = '" + name + "'");
                return true;
            }

        } catch (Exception ee) {
            ee.printStackTrace();
        }
        return false;
    }

}
