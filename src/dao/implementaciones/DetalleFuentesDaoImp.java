package dao.implementaciones;

import conexion.ConexionBD;
import dao.interfaceses.DetalleFuentesDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import tablas.DetalleFuentes;

public class DetalleFuentesDaoImp extends ConexionBD implements DetalleFuentesDao{

    @Override
    public boolean guardar(DetalleFuentes detalleFuentes) {
        
        Connection conectar;
        PreparedStatement preparedStatement;
        boolean guardado = false;
        
        System.out.println("Ejecutando: INSERT INTO detalleFuentes (fuenteId, titulo, detalle, activo) "
                + "VALUES ('"+detalleFuentes.getFuenteId()+"','"+detalleFuentes.getTitulo()+"','"+detalleFuentes.getDetalle()+"')");
        
        try {
            
            conectar = ConexionBD.obtenerConexion();
            preparedStatement = conectar.prepareStatement("INSERT INTO detalleFuentes (fuenteId, titulo, detalle, activo) VALUES (?,?,?,?)");
            preparedStatement.setInt(1, detalleFuentes.getFuenteId());
            preparedStatement.setString(2, detalleFuentes.getTitulo());
            preparedStatement.setString(3, detalleFuentes.getDetalle());
            Integer comp = preparedStatement.executeUpdate();
            
            if( comp == 1 ){
                guardado = true;
            }
            
            conectar = ConexionBD.cerrarConexion();
            preparedStatement.close();
            
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        
        return guardado;
        
    }

    @Override
    public List<DetalleFuentes> listaDetalles(Integer fuenteId) {
        
        Connection conectar;
        PreparedStatement preparedStatement;
        ResultSet resultSet;
        List<DetalleFuentes> listarDetalles = new ArrayList<>();
        
        try {
            
            conectar = ConexionBD.obtenerConexion();
            preparedStatement = conectar.prepareStatement("SELECT * FROM detalleFuentes ORDER BY titulo ASC;");
            resultSet = preparedStatement.executeQuery();
            
            while( resultSet.next() ){
                
                DetalleFuentes detalleFuentes = new DetalleFuentes();
                detalleFuentes.setId(resultSet.getInt("id"));
                detalleFuentes.setFuenteId(resultSet.getInt("fuenteId"));
                detalleFuentes.setTitulo(resultSet.getString("titulo"));
                detalleFuentes.setDetalle(resultSet.getString("detalle"));
                listarDetalles.add(detalleFuentes);
                
            }
            
            conectar = ConexionBD.cerrarConexion();
            preparedStatement.close();
            resultSet.close();
            
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
                
        return listarDetalles;
        
    }

    @Override
    public boolean modificar(DetalleFuentes detalleFuentes) {
        
        Connection conectar;
        PreparedStatement preparedStatement;
        boolean modificado = false;
        
        System.out.println("Ejecutando: UPDATE detalleFuentes SET "
                + "fuenteId = '"+detalleFuentes.getFuenteId()+"', titulo = '"+detalleFuentes.getTitulo()+"', detalle = '"+detalleFuentes.getDetalle()+"' "
                        + "WHERE id = '"+detalleFuentes.getId()+"'");
        
        try {
            
            conectar = ConexionBD.obtenerConexion();
            preparedStatement = conectar.prepareStatement("UPDATE detalleFuentes SET fuenteId = ?, titulo = ?, detalle = ?, activo = ? WHERE id = ?");
            preparedStatement.setInt(1, detalleFuentes.getFuenteId());
            preparedStatement.setString(2, detalleFuentes.getTitulo());
            preparedStatement.setString(3, detalleFuentes.getDetalle());
            preparedStatement.setInt(5, detalleFuentes.getId());
            Integer comp = preparedStatement.executeUpdate();
            
            if( comp == 1 ){
                modificado = true;
            }
            
            conectar = ConexionBD.cerrarConexion();
            preparedStatement.close();
            
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        
        return modificado;
        
    }

    @Override
    public Integer obtenerId(String titulo, String detalle) {
        
        Connection conectar;
        PreparedStatement preparedStatement;
        ResultSet resultSet;
        Integer detalleId = 0;
        
        System.out.println("Ejecutando: SELECT id FROM detalleFuentes WHERE titulo = '"+titulo+"' AND detalle = '"+detalle+"' ORDER BY titulo ASC;");
        
        try {
            
            conectar = ConexionBD.obtenerConexion();
            preparedStatement = conectar.prepareStatement("SELECT id FROM detalleFuentes WHERE titulo = ? AND detalle = ? ORDER BY titulo ASC;");
            preparedStatement.setString(1, titulo);
            preparedStatement.setString(2, detalle);
            resultSet = preparedStatement.executeQuery();
            
            while( resultSet.next() ){
                
                DetalleFuentes detalleFuentes = new DetalleFuentes();
                detalleFuentes.setId(resultSet.getInt("id"));
                detalleFuentes.setFuenteId(resultSet.getInt("fuenteId"));
                detalleFuentes.setTitulo(resultSet.getString("titulo"));
                detalleFuentes.setDetalle(resultSet.getString("detalle"));
                detalleId = detalleFuentes.getId();
                
            }
            
            conectar = ConexionBD.cerrarConexion();
            preparedStatement.close();
            resultSet.close();
            
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
                
        return detalleId;
        
    }

}
