package dao.implementaciones;

import conexion.ConexionBD;
import dao.interfaceses.FuentesDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import tablas.Fuentes;

public class FuenteDaoImp extends ConexionBD implements FuentesDao{
    
    //fuentes

    @Override
    public Integer obtenerId(String nombre) {
        
        Integer fuenteId = 0;
        
        Connection conexion;
        PreparedStatement preparedStatement;
        ResultSet resultSet;
        
        System.out.println("Ejecutando: SELECT id FROM fuentes WHERE nombre = '"+nombre+"'");
        
        try {
            
            conexion = ConexionBD.obtenerConexion();
            
            preparedStatement = conexion.prepareCall("SELECT id FROM fuentes WHERE nombre = ?");
            preparedStatement.setString(1, nombre);
            resultSet = preparedStatement.executeQuery();
            
            while( resultSet.next() ){
                Fuentes fuentes = new Fuentes();
                fuentes.setId(resultSet.getInt("id"));
                
                fuenteId = fuentes.getId();
                
            }
            
            conexion = ConexionBD.cerrarConexion();
            preparedStatement.close();
            resultSet.close();
            
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        
        return fuenteId;
        
    }

    @Override
    public boolean guardar(Integer id, String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Fuentes> listar() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean modificar(Integer id, String nvoNombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
