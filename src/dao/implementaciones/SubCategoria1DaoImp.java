package dao.implementaciones;

import conexion.ConexionBD;
import dao.interfaceses.SubCategoria1Dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import tablas.SubCategorias1;

public class SubCategoria1DaoImp extends ConexionBD implements SubCategoria1Dao{
    
    //subCategorias1

    @Override
    public Integer obtenerId(String nombre) {
        
        Integer sub1Id = 0;
        
        Connection conexion;
        PreparedStatement preparedStatement;
        ResultSet resultSet;
        
        System.out.println("Ejecutando: SELECT id FROM subCategorias1 WHERE nombre = '"+nombre+"'");
        
        try {
            
            conexion = ConexionBD.obtenerConexion();
            
            preparedStatement = conexion.prepareCall("SELECT id FROM subCategorias1 WHERE nombre = ?");
            preparedStatement.setString(1, nombre);
            resultSet = preparedStatement.executeQuery();
            
            while( resultSet.next() ){
                SubCategorias1 subCategorias1 = new SubCategorias1();
                subCategorias1.setId(resultSet.getInt("id"));
                
                sub1Id = subCategorias1.getId();
                
            }
            
            conexion = ConexionBD.cerrarConexion();
            preparedStatement.close();
            resultSet.close();
            
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        
        return sub1Id;
        
    }

    @Override
    public String obtenerNombre(Integer id) {
        
        String sub1Nombre = "";
        
        Connection conexion;
        PreparedStatement preparedStatement;
        ResultSet resultSet;
        
        System.out.println("Ejecutando: SELECT nombre FROM subCategorias1 WHERE id = "+id+"");
        
        try {
            
            conexion = ConexionBD.obtenerConexion();
            
            preparedStatement = conexion.prepareCall("SELECT nombre FROM subCategorias1 WHERE id = ?");
            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery();
            
            while( resultSet.next() ){
                SubCategorias1 subCategorias1 = new SubCategorias1();
                subCategorias1.setNombre(resultSet.getString("nombre"));
                
                sub1Nombre = subCategorias1.getNombre();
                
            }
            
            conexion = ConexionBD.cerrarConexion();
            preparedStatement.close();
            resultSet.close();
            
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        
        return sub1Nombre;
        
    }

    @Override
    public boolean existe(String nombre, Integer catId) {
        
        boolean existe = false;
        Integer registros = 0;
        
        Connection conexion;
        PreparedStatement preparedStatement;
        ResultSet resultSet;
        
        System.out.println("Ejecutando: SELECT * FROM subCategorias1 WHERE nombre = '"+nombre+"' AND idCategoria = '"+catId+"'");
        
        try {
            
            conexion = ConexionBD.obtenerConexion();
            
            preparedStatement = conexion.prepareCall("SELECT * FROM subCategorias1 WHERE nombre = ? AND idCategoria = ?");
            preparedStatement.setString(1, nombre);
            preparedStatement.setInt(2, catId);
            resultSet = preparedStatement.executeQuery();
            
            while( resultSet.next() ){
                registros = registros + 1;
            }
            
            if( registros == 0 ){
                System.out.println("Laa sub categorias 1 "+nombre+" no existe");
                existe = false;
            }else{
                System.out.println("Laa sub categorias 1 "+nombre+" si existe");
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
    public boolean guardar(String nombre, Integer catId) {
        
        boolean guardado = false;
        
        Connection conexion;
        PreparedStatement preparedStatement;
        
        System.out.println("Ejecutando: INSERT INTO subCategorias1 (idCategoria, nombre, activo) VALUES ('"+catId+"', "+nombre+"', true)");
        
        try {
                
            conexion = ConexionBD.obtenerConexion();
            
            preparedStatement = conexion.prepareStatement("INSERT INTO subCategorias1 (idCategoria, nombre, activo) VALUES (?,?,?)");
            preparedStatement.setInt(1, catId);
            preparedStatement.setString(2, nombre);
            preparedStatement.setBoolean(3, true);
            preparedStatement.executeUpdate();
                
            guardado = true;
            System.out.println("Sub categorias 1 giardada" );
                
            conexion = ConexionBD.cerrarConexion();
            preparedStatement.close();
                
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        
        return guardado;
        
    }

    @Override
    public boolean modificar(Integer id, String nvoNombre) {
        
        boolean modificado = false;
        
        Connection conexion;
        PreparedStatement preparedStatement;
        
        System.out.println("Ejecutando: UPDATE subCategorias1 SET nombre = '"+nvoNombre+"' WHERE id = "+id);
        
        try {
            
            conexion = ConexionBD.obtenerConexion();
            preparedStatement = conexion.prepareStatement("UPDATE subCategorias1 SET nombre = ? WHERE id = ?");
            preparedStatement.setString(1, nvoNombre);
            preparedStatement.setInt(2, id);
            preparedStatement.executeUpdate();

            modificado = true;

            conexion = ConexionBD.cerrarConexion();
            preparedStatement.close();

            } catch (SQLException | ClassNotFoundException ex) {
                System.out.println(ex.getMessage());
        }
        
        return modificado;
        
    }
    
    @Override
    public List<SubCategorias1> listar() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean activar(Integer id) {
        
        boolean activado = false;
        
        Connection conexion;
        PreparedStatement preparedStatement;
        
        System.out.println("Ejecutando: UPDATE subCategorias1 SET activo = true WHERE id = '"+id+"'");
        
        try {

            conexion = ConexionBD.obtenerConexion();
            preparedStatement = conexion.prepareStatement("UPDATE subCategorias1 SET activo = ? WHERE id = ?");
            preparedStatement.setBoolean(1, true);
            preparedStatement.setInt(2, id);
            preparedStatement.executeUpdate();

            activado = true;

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
        
        System.out.println("Ejecutando: UPDATE subCategorias1 SET activo = false WHERE id = '"+id+"'");
        
        try {

            conexion = ConexionBD.obtenerConexion();
            preparedStatement = conexion.prepareStatement("UPDATE subCategorias1 SET activo = ? WHERE id = ?");
            preparedStatement.setBoolean(1, false);
            preparedStatement.setInt(2, id);
            preparedStatement.executeUpdate();

            desactivado = true;

            conexion = ConexionBD.cerrarConexion();
            preparedStatement.close();

        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        
        return desactivado;
        
    }

}
