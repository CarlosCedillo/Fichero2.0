package dao.implementaciones;

import conexion.ConexionBD;
import dao.interfaceses.FichaDao;
import java.util.List;
import tablas.Fichas;

public class FichaDaoImp extends ConexionBD implements FichaDao{
    
    //fichas

    @Override
    public boolean guardar(Integer categoriaId, Integer sub1Id, Integer sub2Id, Integer sub3Id, Integer fuenteId, String texto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Fichas> buscarNoFicha(Integer id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Fichas> buscarTexto(String texto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Fichas> buscarCategoria(Integer categoriaId) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Fichas> buscarFuente(Integer fuenteId) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Fichas> busquedaAvanzada(Integer categoriaId, Integer sub1Id, Integer sub2Id, Integer sub3Id, Integer fuenteId) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean modificar(Integer id, Integer categoriaId, Integer sub1Id, Integer sub2Id, Integer sub3Id, Integer fuenteId, String texto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean borrar(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
