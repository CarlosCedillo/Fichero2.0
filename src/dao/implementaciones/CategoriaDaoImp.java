package dao.implementaciones;

import conexion.ConexionBD;
import dao.interfaceses.CategoriaDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import tablas.Categorias;

public class CategoriaDaoImp  extends ConexionBD implements CategoriaDao{

    @Override
    public Integer obtenerId(String nombre) {
        
        Integer categoriaId = 0;
        
        Connection conexion;
        PreparedStatement preparedStatement;
        ResultSet resultSet;
        
        System.out.println("Obteniendo la id de la categoria "+nombre);
        
        try {
            
            conexion = ConexionBD.obtenerConexion();
            
            preparedStatement = conexion.prepareCall("SELECT id FROM categorias WHERE nombre = ?");
            preparedStatement.setString(1, nombre);
            resultSet = preparedStatement.executeQuery();
            
            while( resultSet.next() ){
                Categorias categorias = new Categorias();
                categorias.setId(resultSet.getInt("id"));
                
                categoriaId = categorias.getId();
                
            }
            
            conexion = ConexionBD.cerrarConexion();
            preparedStatement.close();
            resultSet.close();
            
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        
        return categoriaId;
        
    }
    
    @Override
    public boolean existe(String nombre) {
        
        boolean existe = false;
        Integer registros = 0;
        
        Connection conexion;
        PreparedStatement preparedStatement;
        ResultSet resultSet;
        
        System.out.println("Comprobando si la categoria "+nombre+" existe");
        
        try {
            
            conexion = ConexionBD.obtenerConexion();
            
            preparedStatement = conexion.prepareCall("SELECT * FROM categorias WHERE nombre = ?");
            preparedStatement.setString(1, nombre);
            resultSet = preparedStatement.executeQuery();
            
            while( resultSet.next() ){
                registros = registros + 1;
            }
            
            if( registros == 0 ){
                System.out.println("Laa categoria "+nombre+" no existe");
                existe = false;
            }else{
                System.out.println("Laa categoria "+nombre+" si existe");
                existe = true;
            }
            
            
            conexion = ConexionBD.cerrarConexion();
            preparedStatement.close();
            resultSet.close();
            
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        
        return existe;
        
    }

    @Override
    public boolean guardar(String nombre) {
        
        boolean guardado = false;
        
        Connection conexion;
        PreparedStatement preparedStatement;
        
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
            preparedStatement.close();
                
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
    public boolean activar(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean desactivar(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
