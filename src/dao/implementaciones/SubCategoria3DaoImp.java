package dao.implementaciones;

import conexion.ConexionBD;
import dao.interfaceses.SubCategoria3Dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import tablas.SubCategorias3;

public class SubCategoria3DaoImp extends ConexionBD implements SubCategoria3Dao{
    
    //subCategorias3    

    @Override
    public Integer obtenerId(String nombre) {
        
        Integer sub3Id = 0;
        
        Connection conexion;
        PreparedStatement preparedStatement;
        ResultSet resultSet;
        
        System.out.println("Ejecutando: SELECT id FROM subCategorias3 WHERE nombre = '"+nombre+"'");
        
        try {
            
            conexion = ConexionBD.obtenerConexion();
            
            preparedStatement = conexion.prepareCall("SELECT id FROM subCategorias3 WHERE nombre = ?");
            preparedStatement.setString(1, nombre);
            resultSet = preparedStatement.executeQuery();
            
            while( resultSet.next() ){
                SubCategorias3 subCategorias3 = new SubCategorias3();
                subCategorias3.setId(resultSet.getInt("id"));
                
                sub3Id = subCategorias3.getId();
                
            }
            
            conexion = ConexionBD.cerrarConexion();
            preparedStatement.close();
            resultSet.close();
            
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        
        return sub3Id;
        
    }

    @Override
    public String obtenerNombre(Integer id) {
        
        String sub3Nombre = "";
        
        Connection conexion;
        PreparedStatement preparedStatement;
        ResultSet resultSet;
        
        System.out.println("Ejecutando: SELECT nombre FROM subCategorias3 WHERE id = "+id+"");
        
        try {
            
            conexion = ConexionBD.obtenerConexion();
            
            preparedStatement = conexion.prepareCall("SELECT nombre FROM subCategorias3 WHERE id = ?");
            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery();
            
            while( resultSet.next() ){
                SubCategorias3 subCategorias3 = new SubCategorias3();
                subCategorias3.setNombre(resultSet.getString("nombre"));
                
                sub3Nombre = subCategorias3.getNombre();
                
            }
            
            conexion = ConexionBD.cerrarConexion();
            preparedStatement.close();
            resultSet.close();
            
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        
        return sub3Nombre;
        
    }

    @Override
    public boolean existe(String nombre, Integer sub2Id) {
        
        boolean existe = false;
        Integer registros = 0;
        
        Connection conexion;
        PreparedStatement preparedStatement;
        ResultSet resultSet;
        
        System.out.println("Ejecutando: SELECT * FROM subCategorias3 WHERE nombre = '"+nombre+"' AND idSubCategoria2 = '"+sub2Id+"'");
        
        try {
            
            conexion = ConexionBD.obtenerConexion();
            
            preparedStatement = conexion.prepareCall("SELECT * FROM subCategorias3 WHERE nombre = ? AND idSubCategoria2 = ?");
            preparedStatement.setString(1, nombre);
            preparedStatement.setInt(2, sub2Id);
            resultSet = preparedStatement.executeQuery();
            
            while( resultSet.next() ){
                registros = registros + 1;
            }
            
            if( registros == 0 ){
                System.out.println("Laa sub categorias 3 "+nombre+" no existe");
                existe = false;
            }else{
                System.out.println("Laa sub categorias 3 "+nombre+" si existe");
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
    public boolean guardar(String nombre, Integer sub2Id) {
        
        boolean guardado = false;
        
        Connection conexion;
        PreparedStatement preparedStatement;
        
        System.out.println("Ejecutando: INSERT INTO subCategorias3 (idSubCategoria2, nombre, activo) VALUES ('"+sub2Id+"', "+nombre+"', true)");
        
        try {
                
            conexion = ConexionBD.obtenerConexion();
            
            preparedStatement = conexion.prepareStatement("INSERT INTO subCategorias3 (idSubCategoria2, nombre, activo) VALUES (?,?,?)");
            preparedStatement.setInt(1, sub2Id);
            preparedStatement.setString(2, nombre);
            preparedStatement.setBoolean(3, true);
            preparedStatement.executeUpdate();
                
            guardado = true;
            System.out.println("Sub categorias 3 giardada" );
                
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
        
        System.out.println("Ejecutando: UPDATE subCategorias3 SET nombre = '"+nvoNombre+"' WHERE id = "+id);
        
        try {
            
            conexion = ConexionBD.obtenerConexion();
            preparedStatement = conexion.prepareStatement("UPDATE subCategorias3 SET nombre = ? WHERE id = ?");
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
    public List<SubCategorias3> listar(Integer sub2Id) throws Exception {
        
        Connection conexion = null;
        List<SubCategorias3> listar = null;
        listar = new ArrayList<>();
        
        System.out.println("\nEjecutando: SELECT * FROM subCategorias3 WHERE idSubCategoria2 = '"+sub2Id+"'");
        
        try {
            
            conexion = ConexionBD.obtenerConexion();
            PreparedStatement preparedStatement;
            ResultSet resultSet;
            
            String sql = "SELECT * FROM subCategorias3 WHERE idSubCategoria2 = '"+sub2Id+"'";
            preparedStatement = conexion.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            
            while (resultSet.next()) {
                SubCategorias3 subCategorias3 = new SubCategorias3();
                subCategorias3.setId(resultSet.getInt("id"));
                subCategorias3.setIdSubCategoria2(resultSet.getInt("idSubCategoria2"));
                subCategorias3.setNombre(resultSet.getString("nombre"));
                subCategorias3.setActivo(resultSet.getBoolean("activo"));
                listar.add(subCategorias3);
            }
            
            conexion = ConexionBD.cerrarConexion();
            preparedStatement.close();
            resultSet.close();
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        return listar;
        
    }

    @Override
    public boolean activar(Integer id) {
        
        boolean activado = false;
        
        Connection conexion;
        PreparedStatement preparedStatement;
        
        System.out.println("Ejecutando: UPDATE subCategorias3 SET activo = true WHERE id = '"+id+"'");
        
        try {

            conexion = ConexionBD.obtenerConexion();
            preparedStatement = conexion.prepareStatement("UPDATE subCategorias3 SET activo = ? WHERE id = ?");
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
        
        System.out.println("Ejecutando: UPDATE subCategorias3 SET activo = false WHERE id = '"+id+"'");
        
        try {

            conexion = ConexionBD.obtenerConexion();
            preparedStatement = conexion.prepareStatement("UPDATE subCategorias3 SET activo = ? WHERE id = ?");
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
