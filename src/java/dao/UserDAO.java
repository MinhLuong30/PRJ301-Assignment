/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.Product;
import dto.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import utils.DBUtils;

/**
 *
 * @author PC
 */
public class UserDAO {

    Connection con = null;

    PreparedStatement pst = null;

    ResultSet rs = null;

    public User checkLoginByRole(String username, String password) throws SQLException {
        try {
            con = DBUtils.getConnection();

            String sql = "select userName, fullName, password, email, roleID, status \n"
                    + "from Users\n"
                    + "where userName = ? and password = ?";

            pst = con.prepareStatement(sql);
            pst.setString(1, username);
            pst.setString(2, password);

            rs = pst.executeQuery();

            if (rs.next()) {
                String userN = rs.getString("userName");
                String fullname = rs.getString("fullName");
                String pw = rs.getString("password");
                String email = rs.getString("email");
                String roleid = rs.getString("roleID");
                boolean status = rs.getBoolean("status");

                return new User(userN, fullname, password, email, roleid, status);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (pst != null) {
                pst.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return null;
    }
    public int signUpnew(String username, String fullname, String password, String email) throws ClassNotFoundException {
         int rowsAffected = 0;
        try {
                con = DBUtils.getConnection();

            String sql = "INSERT [dbo].[Users] ([userName], [fullName], [password], [email], [roleID], [status]) "
                        + "VALUES (?, ?, ?, ?, 'US', 1)";

            pst = con.prepareStatement(sql);
            pst.setString(1, username);
            pst.setString(2, fullname);
            pst.setString(3, password);
            pst.setString(4, email);
            
            rowsAffected = pst.executeUpdate();
        } catch (SQLException e) {
            
            e.printStackTrace();
        }
        finally {
            try {
                if (pst != null) {
                    pst.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
                // Handle or throw the exception as needed.
            }

            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
                // Handle or throw the exception as needed.
            }
        }
         System.out.println(rowsAffected);
        return rowsAffected;
    }
    
    public boolean checkUserExists(String email, String username) throws ClassNotFoundException {
    boolean exists = false;
    try {
        // Assuming you have a getConnection method that returns a database connection
        con = DBUtils.getConnection();
        String sql = "SELECT COUNT(*) FROM Users WHERE email = ? OR username = ? ";
        pst = con.prepareStatement(sql);
        pst.setString(1, email);
        pst.setString(2, username);
        rs = pst.executeQuery();
        if (rs.next()) {
            // If count is greater than 0, that means the email or username already exists
            exists = rs.getInt(1) > 0;
        }
        rs.close();
        pst.close();
        con.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return exists;
}
    public List<User> getAll() throws SQLException {
        List<User> list = new ArrayList<>();
        System.out.println(100);
        try {
            con = DBUtils.getConnection();

            String sql = "SELECT            [userName]\n" +
                                    "      ,[fullName]\n" +
                                    "      ,[password]\n" +
                                    "      ,[email]\n" +
                                    "      ,[roleID]\n" +
                                    "      ,[status]\n" +
                                    "  FROM [COMICSTORE].[dbo].[Users]";
              

            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();

            while (rs.next()) {
                String userName = rs.getString("userName");
                String fullName = rs.getString("fullName");
                String password = rs.getString("password");
                String email = rs.getString("email");
                String roleID = rs.getString("roleID");
                boolean status = rs.getBoolean("status");

                list.add(new User(userName, fullName, password, email, roleID, status));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (pst != null) {
                pst.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return list;
    }
    public int deleteAccount(String usern) throws ClassNotFoundException {
         int rowsAffected = 0;
         System.out.println(usern);
        try {
                con = DBUtils.getConnection();

            String sql = "DELETE from Users WHERE userName = ?";

            pst = con.prepareStatement(sql);
            pst.setString(1, usern);
            rowsAffected = pst.executeUpdate();
        } catch (SQLException e) {
            
            e.printStackTrace();
        }
        finally {
            try {
                if (pst != null) {
                    pst.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
                // Handle or throw the exception as needed.
            }

            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
                // Handle or throw the exception as needed.
            }
        }
         System.out.println(rowsAffected);
        return rowsAffected;
    }
}
