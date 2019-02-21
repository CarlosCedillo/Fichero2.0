package dao.interfaceses;

import java.util.List;
import tablas.Fichas;

public interface FichaDao {
    
    //CRYD (Create, Read, Update, Delete)
    
    public boolean guardar(Integer categoriaId, Integer sub1Id, Integer sub2Id, Integer sub3Id, Integer fuenteId, String texto);
    
    public List<Fichas> buscarNoFicha( Integer id ) throws Exception;
    public List<Fichas> buscarTexto( String texto ) throws Exception;
    public List<Fichas> buscarCategoria( Integer categoriaId ) throws Exception;
    public List<Fichas> buscarFuente( Integer fuenteId ) throws Exception;
    public List<Fichas> busquedaAvanzada( Integer categoriaId, Integer sub1Id, Integer sub2Id, Integer sub3Id, Integer fuenteId ) throws Exception;
    
    public boolean modificar(Integer id, Integer categoriaId, Integer sub1Id, Integer sub2Id, Integer sub3Id, Integer fuenteId, String texto);
    
    public boolean borrar(Integer id);
    
}
