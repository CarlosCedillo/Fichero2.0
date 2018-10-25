package dao.implementaciones;

import conexion.ConexionBD;
import dao.interfaceses.CategoriaDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class CategoriaDaoImp  extends ConexionBD implements CategoriaDao{

    @Override
    public Integer obtenerId(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean existe(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean guardar(String nombre) {
        
        Connection conexion = null;
        PreparedStatement preparedStatement;
        boolean guardado = false;
        
        System.out.println("Ejecutando: INSERT INTO categorias (nombre, activo) VALUES ('"+nombre+"', true)");
        
        try {
                
                conexion = ConexionBD.obtenerConexion();
                preparedStatement = conexion.prepareStatement("INSERT INTO categorias (nombre, activo) VALUES (?,?)");
                preparedStatement.setString(1, nombre);
                preparedStatement.setBoolean(2, true);
                preparedStatement.executeUpdate();
                
                guardado = true;
                System.out.println("Categoria giardada" );
                
                conexion = ConexionBD.cerrarConexion();
                
            } catch (SQLException | ClassNotFoundException ex) {
                System.out.println(ex.getMessage());
            }
        
        return guardado;
        
    }

    @Override
    public boolean modificar(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean borrar(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean activar(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean desactivar(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
