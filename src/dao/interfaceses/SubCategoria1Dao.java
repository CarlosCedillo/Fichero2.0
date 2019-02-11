package dao.interfaceses;

import java.util.List;
import tablas.SubCategorias1;

public interface SubCategoria1Dao {
    
    public Integer obtenerId(String nombre, Integer categoriaId);
    public String obtenerNombre(Integer id);
    public boolean existe(String nombre, Integer categoriaId);
    
    public boolean guardar(String nombre, Integer categoriaId);
    public boolean modificar(Integer id, String nvoNombre);
    public List<SubCategorias1> listar(Integer categoriaId) throws Exception;
    
    public boolean activar(Integer id);
    public boolean desactivar(Integer id);
    
}
