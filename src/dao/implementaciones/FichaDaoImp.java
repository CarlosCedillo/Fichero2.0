package dao.implementaciones;

import conexion.ConexionBD;
import dao.interfaceses.FichaDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import tablas.Fichas;

public class FichaDaoImp extends ConexionBD implements FichaDao{
    
    //fichas

    @Override
    public boolean guardar(Integer categoriaId, Integer sub1Id, Integer sub2Id, Integer sub3Id, Integer fuenteId, String texto) {
        
        boolean guardado = false;
        
        Connection conexion;
        PreparedStatement preparedStatement;
        
        System.out.println("Ejecutando: INSERT INTO "
                + "fichas (texto, categoria, subCategoria1, subCategoria2, subCategoria3, fuente) "
                + "VALUES ('"+texto+"', '"+categoriaId+"', '"+sub1Id+"', '"+sub2Id+"', '"+sub3Id+"', '"+fuenteId+"')");
        
        try {
                
            conexion = ConexionBD.obtenerConexion();
            
            preparedStatement = conexion.prepareStatement("INSERT INTO fichas (texto, categoria, subCategoria1, subCategoria2, subCategoria3, fuente) VALUES (?, ?, ?, ?, ?, ?)");
            preparedStatement.setString(1, texto);
            preparedStatement.setInt(2, categoriaId);
            preparedStatement.setInt(3, sub1Id);
            preparedStatement.setInt(4, sub2Id);
            preparedStatement.setInt(5, sub3Id);
            preparedStatement.setInt(6, fuenteId);
            preparedStatement.executeUpdate();
                
            guardado = true;
                
            conexion = ConexionBD.cerrarConexion();
            preparedStatement.close();
                
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        
        return guardado;
        
    }

    @Override
    public List<Fichas> buscarNoFicha(Integer noFicha) throws Exception {
        
        Connection conexion = null;
        List<Fichas> buscarNoFicha = null;
        buscarNoFicha = new ArrayList<>();
        
        System.out.println("Ejecutando: SELECT * FROM fichas WHERE id = '"+noFicha+"'");
        
        try {
            
            conexion = ConexionBD.obtenerConexion();
            PreparedStatement preparedStatement;
            ResultSet resultSet;
            
            String sql = "SELECT * FROM fichas WHERE id = '"+noFicha+"'";
            preparedStatement = conexion.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            
            while (resultSet.next()) {
                Fichas fichas = new Fichas();
                fichas.setId(resultSet.getInt("id"));
                fichas.setCategoria(resultSet.getInt("categoria"));
                fichas.setSubCategoia1(resultSet.getInt("subCategoria1"));
                fichas.setSubCategoia2(resultSet.getInt("subCategoria2"));
                fichas.setSubCategoia3(resultSet.getInt("subCategoria3"));
                fichas.setFuente(resultSet.getInt("fuente"));
                fichas.setTexto(resultSet.getString("texto"));
                buscarNoFicha.add(fichas);
            }
            
            conexion = ConexionBD.cerrarConexion();
            preparedStatement.close();
            resultSet.close();
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        return buscarNoFicha;
        
    }

    @Override
    public List<Fichas> buscarTexto(String texto) throws Exception {
        
        Connection conexion = null;
        List<Fichas> buscarTexto = null;
        buscarTexto = new ArrayList<>();
        
        System.out.println("Ejecutando: SELECT * FROM fichas WHERE texto = '"+texto+"'");
        
        try {
            
            conexion = ConexionBD.obtenerConexion();
            PreparedStatement preparedStatement;
            ResultSet resultSet;
            
            String sql = "SELECT * FROM fichas WHERE texto LIKE '%"+texto+"%'";
            preparedStatement = conexion.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            
            while (resultSet.next()) {
                Fichas fichas = new Fichas();
                fichas.setId(resultSet.getInt("id"));
                fichas.setCategoria(resultSet.getInt("categoria"));
                fichas.setSubCategoia1(resultSet.getInt("subCategoria1"));
                fichas.setSubCategoia2(resultSet.getInt("subCategoria2"));
                fichas.setSubCategoia3(resultSet.getInt("subCategoria3"));
                fichas.setFuente(resultSet.getInt("fuente"));
                fichas.setTexto(resultSet.getString("texto"));
                buscarTexto.add(fichas);
            }
            
            conexion = ConexionBD.cerrarConexion();
            preparedStatement.close();
            resultSet.close();
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        return buscarTexto;
        
    }

    @Override
    public List<Fichas> buscarCategoria(Integer categoriaId) throws Exception {
        
        Connection conexion = null;
        List<Fichas> buscarCategoria = null;
        buscarCategoria = new ArrayList<>();
        
        System.out.println("Ejecutando: SELECT * FROM fichas WHERE categoria = '"+categoriaId+"'");
        
        try {
            
            conexion = ConexionBD.obtenerConexion();
            PreparedStatement preparedStatement;
            ResultSet resultSet;
            
            String sql = "SELECT * FROM fichas WHERE categoria = '"+categoriaId+"'";
            preparedStatement = conexion.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            
            while (resultSet.next()) {
                Fichas fichas = new Fichas();
                fichas.setId(resultSet.getInt("id"));
                fichas.setCategoria(resultSet.getInt("categoria"));
                fichas.setSubCategoia1(resultSet.getInt("subCategoria1"));
                fichas.setSubCategoia2(resultSet.getInt("subCategoria2"));
                fichas.setSubCategoia3(resultSet.getInt("subCategoria3"));
                fichas.setFuente(resultSet.getInt("fuente"));
                fichas.setTexto(resultSet.getString("texto"));
                buscarCategoria.add(fichas);
            }
            
            conexion = ConexionBD.cerrarConexion();
            preparedStatement.close();
            resultSet.close();
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        return buscarCategoria;
        
    }

    @Override
    public List<Fichas> buscarFuente(Integer fuenteId) throws Exception {
        
        Connection conexion = null;
        List<Fichas> buscarFuente = null;
        buscarFuente = new ArrayList<>();
        
        System.out.println("Ejecutando: SELECT * FROM fichas WHERE fuente = '"+fuenteId+"'");
        
        try {
            
            conexion = ConexionBD.obtenerConexion();
            PreparedStatement preparedStatement;
            ResultSet resultSet;
            
            String sql = "SELECT * FROM fichas WHERE fuente = '"+fuenteId+"'";
            preparedStatement = conexion.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            
            while (resultSet.next()) {
                Fichas fichas = new Fichas();
                fichas.setId(resultSet.getInt("id"));
                fichas.setCategoria(resultSet.getInt("categoria"));
                fichas.setSubCategoia1(resultSet.getInt("subCategoria1"));
                fichas.setSubCategoia2(resultSet.getInt("subCategoria2"));
                fichas.setSubCategoia3(resultSet.getInt("subCategoria3"));
                fichas.setFuente(resultSet.getInt("fuente"));
                fichas.setTexto(resultSet.getString("texto"));
                buscarFuente.add(fichas);
            }
            
            conexion = ConexionBD.cerrarConexion();
            preparedStatement.close();
            resultSet.close();
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        return buscarFuente;
        
    }

    @Override
    public List<Fichas> busquedaAvanzada(Integer categoriaId, Integer sub1Id, Integer sub2Id, Integer sub3Id, Integer fuenteId) throws Exception {
        
        Connection conexion = null;
        List<Fichas> busquedaAvanzada = null;
        busquedaAvanzada = new ArrayList<>();
        String sql = "SELECT * FROM fichas WHERE";
        
        if( categoriaId > 0 ){
            sql = sql + " categoria = '"+categoriaId+"'";
        }
        
        if( fuenteId > 0 ){
            sql = sql + " AND fuente = '"+fuenteId+"'";
        }
        
        if( sub1Id > 0 ){
            sql = sql + " AND subCategoria1 = '"+sub1Id+"'";
        }
        
        if( sub2Id > 0 ){
            sql = sql + " AND subCategoria2 = '"+sub2Id+"'";
        }
        
        if( sub3Id > 0 ){
            sql = sql + " AND subCategoria3 = '"+sub3Id+"'";
        }
        
        System.out.println("Ejecutando: "+sql);
        
        try {
            
            conexion = ConexionBD.obtenerConexion();
            PreparedStatement preparedStatement;
            ResultSet resultSet;
            
            preparedStatement = conexion.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            
            while (resultSet.next()) {
                Fichas fichas = new Fichas();
                fichas.setId(resultSet.getInt("id"));
                fichas.setCategoria(resultSet.getInt("categoria"));
                fichas.setSubCategoia1(resultSet.getInt("subCategoria1"));
                fichas.setSubCategoia2(resultSet.getInt("subCategoria2"));
                fichas.setSubCategoia3(resultSet.getInt("subCategoria3"));
                fichas.setFuente(resultSet.getInt("fuente"));
                fichas.setTexto(resultSet.getString("texto"));
                busquedaAvanzada.add(fichas);
            }
            
            conexion = ConexionBD.cerrarConexion();
            preparedStatement.close();
            resultSet.close();
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        return busquedaAvanzada;
        
    }

    @Override
    public boolean modificar(Integer id, Integer categoriaId, Integer sub1Id, Integer sub2Id, Integer sub3Id, Integer fuenteId, String texto) {
        
        boolean modificado = false;
        
        Connection conexion;
        PreparedStatement preparedStatement;
        
        System.out.println("Ejecutando: UPDATE fichas SET texto = '"+texto+"', categoria = '"+categoriaId+"', subCategoria1 = '"+sub1Id+"', "
                + "subCategoria2 = '"+sub2Id+"', subCategoria3 = '"+sub3Id+"', fuente = '"+fuenteId+"' WHERE id = '"+id+"'");
        
        try {
            
            conexion = ConexionBD.obtenerConexion();
            
            preparedStatement = conexion.prepareStatement("UPDATE fichas "
                    + "SET texto = ?, categoria = ?, subCategoria1 = ?, subCategoria2 = ?, subCategoria3 = ?, fuente = ? WHERE id = ?");
            preparedStatement.setString(1, texto);
            preparedStatement.setInt(2, categoriaId);
            preparedStatement.setInt(3, sub1Id);
            preparedStatement.setInt(4, sub2Id);
            preparedStatement.setInt(5, sub3Id);
            preparedStatement.setInt(6, fuenteId);
            preparedStatement.setInt(7, id);
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
    public boolean borrar(Integer id) {
        
        boolean borrado = false;
        
        Connection conexion;
        PreparedStatement preparedStatement;
        
        System.out.println("Ejecutando: DELETE * FROM fichas WHERE id = '"+id+"'");
        
        try {
            
            conexion = ConexionBD.obtenerConexion();
            
            preparedStatement = conexion.prepareStatement("DELETE * FROM fichas WHERE id = ?");
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
            
            borrado = true;

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        return borrado;
        
    }
    
}
