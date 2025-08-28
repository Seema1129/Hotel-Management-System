
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**/
 // Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 // Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 

/**
 *
 * @author RAHUL
 */
public class connect{
public static Connection Connection(){
        Connection con=null;
        try {
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","12345678");
        } catch (SQLException ex) {
            Logger.getLogger(connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }    
}
