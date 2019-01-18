package dao.interfaceses;

import java.util.List;
import tablas.SubCategorias2;

public interface SubCategoria2Dao {
    
    public Integer obtenerId(String nombre);
    public Integer obtenetIdAvanzado(String nombre, Integer sub1Id);
    public String obtenerNombre(Integer id);
    public boolean existe(String nombre, Integer sub1Id);
    
    public boolean guardar(String nombre, Integer sub1Id);
    public boolean modificar(Integer id, String nvoNombre);
    public List<SubCategorias2> listar() throws Exception;
    
    public boolean activar(Integer id);
    public boolean desactivar(Integer id);
    
}
