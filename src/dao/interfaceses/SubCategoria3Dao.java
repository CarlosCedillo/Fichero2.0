package dao.interfaceses;

import java.util.List;
import tablas.SubCategorias3;

public interface SubCategoria3Dao {
    
    public Integer obtenetId(String nombre, Integer sub2Id);
    public String obtenerNombre(Integer id);
    public boolean existe(String nombre, Integer sub2Id);
    
    public boolean guardar(String nombre, Integer sub2Id);
    public boolean modificar(Integer id, String nvoNombre);
    public List<SubCategorias3> listar(Integer sub2Id) throws Exception;
    
    public boolean activar(Integer id);
    public boolean desactivar(Integer id);
    
}
