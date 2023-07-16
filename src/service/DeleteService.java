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
public class DeleteService {
     public static boolean deleteUser(String name) {
        try {
            Connection cn = repository.ConnectionDB.getConnectiondb();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("select name from user_table where name = '" + name + "'");
            while (rs.next()) {
                st.executeUpdate("DELETE FROM user_table WHERE name = '" + name + "'");
                return true;
            }

        } catch (Exception ee) {
            ee.printStackTrace();
        }
        return false;
    }

}
