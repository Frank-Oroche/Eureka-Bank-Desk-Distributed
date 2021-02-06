package MVC_Logica;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conexion {

    public String db = "heroku_a50594a96db7083";
    public String url = "jdbc:mysql://us-cdbr-east-02.cleardb.com/" + db;
    public String user = "b238b0054a1207";
    public String pass = "40e02acf";
    private Connection conectar = null;

    public Connection conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar = (com.mysql.jdbc.Connection) DriverManager.getConnection(url, user, pass);
            //System.out.println("Conexion Exitosa...");
        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Conexion Fallida... Error: " + e.getMessage());
            System.exit(1);
        }
        return conectar;
    }
}
