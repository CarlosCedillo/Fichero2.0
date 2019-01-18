package dao.interfaceses;

import java.util.List;
import tablas.SubCategorias1;

public interface SubCategoria1Dao {
    
    public Integer obtenerId(String nombre);
    public String obtenerNombre(Integer id);
    public boolean existe(String nombre, Integer catId);
    
    public boolean guardar(String nombre, Integer catId);
    public boolean modificar(Integer id, String nvoNombre);
    public List<SubCategorias1> listar() throws Exception;
    
    public boolean activar(Integer id);
    public boolean desactivar(Integer id);
    
}
