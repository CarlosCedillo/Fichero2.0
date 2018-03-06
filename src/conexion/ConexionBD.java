package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class ConexionBD {
    static Connection conexion = null;
    static String driver = "net.ucanaccess.jdbc.UcanaccessDriver";
    static String url = "jdbc:ucanaccess://C:\\Users\\CaGeCeAl\\Documents\\NetBeansProjects\\Fichero2.0\\src\\BD\\bd_fichero.accdb";
    
    public static Connection conectar(){
        try {
            if (conexion == null) {
                Class.forName(driver);
                conexion = DriverManager.getConnection(url);
                JOptionPane.showMessageDialog(null, "Conexion establecida exitosamente");
            }
        } catch (Exception e) {
            e.printStackTrace();
            conexion = null;
        }
        return conexion;
    }
    
    public static void main(String [] args){
        
        Connection cn = ConexionBD.conectar();
        
    }

}
