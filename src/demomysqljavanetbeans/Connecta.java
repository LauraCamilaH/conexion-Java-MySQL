/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demomysqljavanetbeans;

import java.sql.Connection;// estandar!!
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 * Laura Hurtado.
 *
 * @author sala306
 */
public class Connecta {

    public static final String URL = "jdbc:mysql://localhost:3307/cun";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "usbw";

//public static Connection getConnection()
    public static Connection abrebase() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);
            JOptionPane.showMessageDialog(null, "Conectados a la base");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo conectar a la base de datos",
                     "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
        return connection;
    }

}
