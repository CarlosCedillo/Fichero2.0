package dao.implementaciones;

import conexion.ConexionBD;
import dao.interfaceses.FichaDao;
import java.sql.ResultSet;

public class FichaDaoImp extends ConexionBD implements FichaDao{

    //fichas
    
    @Override
    public ResultSet busquedaAvanzada(Integer categoriaId, Integer sub1Id, Integer sub2Id, Integer sub3Id, Integer fuenteId) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
