/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.OrderDetail;
import dto.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import utils.DBUtils;

/**
 *
 * @author minhl
 */
public class InventoryDAO {
    Connection con = null;

    PreparedStatement pst = null;

    ResultSet rs = null;
     public List<Product> getAllInventory() throws SQLException {
        List<Product> list = new ArrayList<>();
        try {
            con = DBUtils.getConnection();

            String sql = "select comicID , name , description, artist,price, quantity,image, report\n"
                    + "from Comics\n";

            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();

            while (rs.next()) {
                String id = rs.getString("comicID");
                String name = rs.getString("name");
                String description = rs.getString("description");
                String artist = rs.getString("artist");
                int price = rs.getInt("price");
                int quantity = rs.getInt("quantity");
                String img = rs.getString("image");
                String report = rs.getString("report");

                list.add(new Product(id, name, description,artist, price, quantity,img, report));
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
     public List<Product> getProductbyID(String cid) throws SQLException {
        List<Product> list = new ArrayList<>();
        try {
            con = DBUtils.getConnection();

            String sql = "select comicID , name , description, artist,price, quantity,image, report\n"
                    + "from Comics where comicID Like ? + '%' " ;

            pst = con.prepareStatement(sql);
            pst.setString(1, cid);
            rs = pst.executeQuery();

            while (rs.next()) {
                String id = rs.getString("comicID");
                String name = rs.getString("name");
                String description = rs.getString("description");
                String artist = rs.getString("artist");
                int price = rs.getInt("price");
                int quantity = rs.getInt("quantity");
                String img = rs.getString("image");
                String report = rs.getString("report");

                list.add(new Product(id, name, description,artist, price, quantity,img, report));
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
     public List<Product> searchProductByID() throws SQLException {
        List<Product> list = new ArrayList<>();
        try {
            con = DBUtils.getConnection();

            String sql = "select comicID , name , description, artist,price, image \n"
                    + "from Comics\n where report = '2'";

            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();

            while (rs.next()) {
                String id = rs.getString("comicID");
                System.out.println(id);
                String name = rs.getString("name");
                String description = rs.getString("description");
                String artist = rs.getString("artist");
                int price = rs.getInt("price");
                String img = rs.getString("image");

                list.add(new Product(id, name, description,artist, price,img));
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
      public int changeRep(String id) throws ClassNotFoundException {
         int rowsAffected = 0;
         System.out.println(id);
        try {
                con = DBUtils.getConnection();

            String sql = "UPDATE Comics set report = '2' WHERE comicID LIKE ? + '%'";

            pst = con.prepareStatement(sql);
            pst.setString(1, id);
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
     public int removeProductById(String id) throws ClassNotFoundException {
         int rowsAffected = 0;
         System.out.println(id);
        try {
                con = DBUtils.getConnection();

            String sql = "UPDATE Comics set report = 'NotSale' WHERE comicID = ?";

            pst = con.prepareStatement(sql);
            pst.setString(1, id);
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
      public int checkInventory() throws ClassNotFoundException {
         int rowsAffected = 0;
        try {
                con = DBUtils.getConnection();
            pst = con.prepareStatement("UPDATE Comics \n" +
                                        "SET report = CASE \n" +
                                            "WHEN quantity >= 100 THEN 'Normal'\n" +
                                            "WHEN quantity < 100 THEN 'Low' \n" +
                                            "END\n" );
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

    public int addProduct(String id, String name, String description,String artist, String price, String quantity,String image) throws ClassNotFoundException { 
        System.out.println(id);
        int rowsAffected = 0;
        try {          
            con = DBUtils.getConnection();
            String sql = "INSERT INTO Comics (comicID, name, description, artist, price, quantity, image, report) VALUES (?, ?, ?, ?, ?,?,?, 'new');";
            pst = con.prepareStatement(sql);
            pst.setString(1, id);
            pst.setString(2, name);
            pst.setString(3, description);
            pst.setString(4, artist);
            pst.setInt(5, Integer.parseInt(price));
            pst.setInt(6, Integer.parseInt(quantity));
            pst.setString(7, image);
            rowsAffected = pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle or throw the exception as needed.
        } finally {
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
    public int updateProduct( String name, String description,String artist, String price, String quantity,String id) throws ClassNotFoundException { 
        System.out.println(quantity);
        System.out.println(price);
        int rowsAffected = 0;
        try {          
            con = DBUtils.getConnection();
            String sql = "UPDATE Comics set name = ?, description = ?,artist= ?,price = ?, quantity = ? WHERE comicID = ?";
                                                    
            pst = con.prepareStatement(sql);
            pst.setString(1, name);
            pst.setString(2, description);
            pst.setString(3, artist);
            pst.setInt(4, Integer.parseInt(price));
            pst.setInt(5, Integer.parseInt(quantity));
            pst.setString(6, id);
            rowsAffected = pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle or throw the exception as needed.
        } finally {
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
    public Product searchById(String id) throws SQLException, ClassNotFoundException{
      try {
            con = DBUtils.getConnection();
            if (con != null) {
                String sql = "select comicID , name , description, artist,price, image\n" 
                        + "from Comics\n"
                    + "where comicID = ? ";
                pst = con.prepareStatement(sql);
                pst.setString(1, id);
                rs = pst.executeQuery();
                if (rs.next()) {
                    String cid = rs.getString("comicID");
                    String name = rs.getString("name");
                    String description = rs.getString("description");
                    String artist = rs.getString("artitst");
                    int price = rs.getInt("price");
                    String img = rs.getString("image");

                    return new Product(cid, name, description, artist, price, img);
                }
            }
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
    public List<OrderDetail> getAll() throws SQLException, ClassNotFoundException{
        List<OrderDetail> list = new ArrayList<>();
      try {
            con = DBUtils.getConnection();
            if (con != null) {
                String sql = "select orderDetailID , orderID , comicID, price, quantity\n" 
                        + "from OrderDetails\n";

                pst = con.prepareStatement(sql);
                rs = pst.executeQuery();
                if (rs.next()) {
                    int odid = rs.getInt("orderDetailID");
                    int id = rs.getInt("orderID");
                    String cid = rs.getString("comicID");
                    int price = rs.getInt("price");
                    int qty = rs.getInt("quantity");

                    list.add(new OrderDetail(odid, id, cid, price, qty));
                }
            }
            
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

}