/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package connection;

/**
 *
 * @author fennell.38261
 */
import java.sql.*;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

          String url = "jdbc:mysql://127.0.0.1:3306/";
          String dbName = "dublinzoo";
          String driver = "com.mysql.jdbc.Driver";
          String userName = "root";
          String password = "nss2013";//"NSS2014";

          try {
          Class.forName(driver).newInstance();
          System.out.println("Connection to database" + dbName + "...");
          Connection conn = DriverManager.getConnection(url+dbName,userName,password);
          System.out.println("Connected database succesfully...");

          Statement stat =conn.createStatement();

          String sql ="SELECT * FROM ANIMAL";

          ResultSet rs =stat.executeQuery(sql);

          while(rs.next()){

          String ANIMAL_ID =rs.getString("ANIMAL ID");
          String ANIMAL_NAME =rs.getString("ANIMAL NAME");
          String ANIMAL_TYPE =rs.getString("ANIMAL TYPE");
          String GENDER =rs.getString("GENDER");
          Date DOB =rs.getDate("DOB");
          Date REG_DATE =rs.getDate("REG DATE");
          String DIET_TYPE =rs.getString("DIET TYPE");
          String DIET =rs.getString("DIET");
          String STATUS =rs.getString("STATUS");
          String HEALTH =rs.getString("HEALTH");
          int SPACE_REQUIRED_ACRES =rs.getInt("SPACE REQUIRED ACRES");



          System.out.println("ANIMAL ID"+ANIMAL_ID + "ANIMAL NAME"+ANIMAL_NAME + "ANIMAL TYPE"+ANIMAL_TYPE + "GENDER"+GENDER + "DOB"+DOB + "REG DATE"+REG_DATE + "DIET TYPE"+DIET_TYPE + "DIET"+DIET + "STATUS"+STATUS + "HEALTH"+HEALTH + "SPACE REQUIRED ACRES"+SPACE_REQUIRED_ACRES);

          }
          conn.close();
          } catch (Exception e) {
          e.printStackTrace();
          }
          }


    }


