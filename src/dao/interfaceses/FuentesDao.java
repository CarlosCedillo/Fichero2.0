package dao.interfaceses;

import java.util.List;
import tablas.Fuentes;

public interface FuentesDao {
    
    public Integer obtenerId(String nombre);
    
    //CRYD (Create, Read, Update, Delete)
    
    public boolean guardar(Integer id, String nombre);
    
    public List<Fuentes> listar() throws Exception;
    
    public boolean modificar(Integer id, String nvoNombre);
    
}
