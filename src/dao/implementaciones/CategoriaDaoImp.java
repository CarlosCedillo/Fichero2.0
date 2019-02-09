package dao.implementaciones;

import conexion.ConexionBD;
import dao.interfaceses.CategoriaDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import tablas.Categorias;

public class CategoriaDaoImp  extends ConexionBD implements CategoriaDao{

    @Override
    public Integer obtenerId(String nombre) {
        
        Integer categoriaId = 0;
        
        Connection conexion;
        PreparedStatement preparedStatement;
        ResultSet resultSet;
        
        System.out.println("Ejecutando: SELECT id FROM categorias WHERE nombre = '"+nombre+"'");
        
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
    public String obtenerNombre(Integer id) {
        
        String categoriaNombre = "";
        
        Connection conexion;
        PreparedStatement preparedStatement;
        ResultSet resultSet;
        
        System.out.println("Ejecutando: SELECT nombre FROM categorias WHERE id = "+id+"");
        
        try {
            
            conexion = ConexionBD.obtenerConexion();
            
            preparedStatement = conexion.prepareCall("SELECT nombre FROM categorias WHERE id = ?");
            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery();
            
            while( resultSet.next() ){
                Categorias categorias = new Categorias();
                categorias.setNombre(resultSet.getString("nombre"));
                
                categoriaNombre = categorias.getNombre();
                
            }
            
            conexion = ConexionBD.cerrarConexion();
            preparedStatement.close();
            resultSet.close();
            
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        
        return categoriaNombre;
        
    }
    
    @Override
    public boolean existe(String nombre) {
        
        boolean existe = false;
        Integer registros = 0;
        
        Connection conexion;
        PreparedStatement preparedStatement;
        ResultSet resultSet;
        
        System.out.println("Ejecutando: SELECT * FROM categorias WHERE nombre = '"+nombre+"'");
        
        try {
            
            conexion = ConexionBD.obtenerConexion();
            
            preparedStatement = conexion.prepareCall("SELECT * FROM categorias WHERE nombre = ?");
            preparedStatement.setString(1, nombre);
            resultSet = preparedStatement.executeQuery();
            
            while( resultSet.next() ){
                registros = registros + 1;
            }
            
            if( registros == 0 ){
                existe = false;
            }else{
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
            Integer comp = preparedStatement.executeUpdate();
            
            if( comp == 1 ){
                guardado = true;
            }
            
            conexion = ConexionBD.cerrarConexion();
            preparedStatement.close();
                
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        
        return guardado;
        
    }

    @Override
    public boolean modificar(Integer categoriaId, String nvoNombre) {
        
        boolean modificado = false;
        
        Connection conexion;
        PreparedStatement preparedStatement;
        
        System.out.println("Ejecutando: UPDATE categorias SET nombre = '"+nvoNombre+"' WHERE id = "+categoriaId);
        
        try {
            
            conexion = ConexionBD.obtenerConexion();
            preparedStatement = conexion.prepareStatement("UPDATE categorias SET nombre = ? WHERE id = ?");
            preparedStatement.setString(1, nvoNombre);
            preparedStatement.setInt(2, categoriaId);
            Integer comp = preparedStatement.executeUpdate();

            if( comp == 1 ){
                modificado = true;
            }
            
            conexion = ConexionBD.cerrarConexion();
            preparedStatement.close();

            } catch (SQLException | ClassNotFoundException ex) {
                System.out.println(ex.getMessage());
        }
        
        return modificado;
        
    }
    
    @Override
    public List<Categorias> listar() throws Exception {
        
        Connection conexion = null;
        List<Categorias> listaCategorias = null;
        listaCategorias = new ArrayList<>();
        
        try {
            conexion = ConexionBD.obtenerConexion();
            ResultSet resultSet;
            String sql = "SELECT * FROM categorias ORDER BY nombre ASC;";
            PreparedStatement preparedStatement = conexion.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            
            while (resultSet.next()) {
                Categorias categorias = new Categorias();
                categorias.setId(resultSet.getInt("id"));
                categorias.setNombre(resultSet.getString("nombre"));
                categorias.setActivo(resultSet.getBoolean("activo"));
                listaCategorias.add(categorias);
            }
            
            conexion = ConexionBD.cerrarConexion();
            preparedStatement.close();
            resultSet.close();
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        return listaCategorias;
        
    }

    @Override
    public boolean activar(Integer id) {
        
        boolean activado = false;
        
        Connection conexion;
        PreparedStatement preparedStatement;
        
        System.out.println("Ejecutando: UPDATE categorias SET activo = true WHERE id = '"+id+"'");
        
        try {

            conexion = ConexionBD.obtenerConexion();
            preparedStatement = conexion.prepareStatement("UPDATE categorias SET activo = ? WHERE id = ?");
            preparedStatement.setBoolean(1, true);
            preparedStatement.setInt(2, id);
            Integer comp = preparedStatement.executeUpdate();

            if( comp == 1 ){
                activado = true;
            }
            
            conexion = ConexionBD.cerrarConexion();
            preparedStatement.close();

        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        
        return activado;
        
    }

    @Override
    public boolean desactivar(Integer id) {
        
        boolean desactivado = false;
        
        Connection conexion;
        PreparedStatement preparedStatement;
        
        System.out.println("Ejecutando: UPDATE categorias SET activo = false WHERE id = '"+id+"'");
        
        try {

            conexion = ConexionBD.obtenerConexion();
            preparedStatement = conexion.prepareStatement("UPDATE categorias SET activo = ? WHERE id = ?");
            preparedStatement.setBoolean(1, false);
            preparedStatement.setInt(2, id);
            Integer comp = preparedStatement.executeUpdate();

            if( comp == 1 ){
                desactivado = true;
            }

            conexion = ConexionBD.cerrarConexion();
            preparedStatement.close();

        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        
        return desactivado;
        
    }

}
