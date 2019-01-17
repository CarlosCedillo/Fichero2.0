package dao.interfaceses;

import java.sql.ResultSet;

public interface FichaDao {
    
    public ResultSet busquedaAvanzada(Integer categoriaId, Integer sub1Id, Integer sub2Id, Integer sub3Id, Integer fuenteId) throws Exception;
    
}
