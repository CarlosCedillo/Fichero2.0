package dao.interfaceses;

import java.util.List;
import tablas.Categorias;

public interface CategoriaDao {
    
    public Integer obtenerId(String nombre);
    public String obtenerNombre(Integer id);
    public boolean existe(String nombre);
    
    public boolean guardar(String nombre);
    public boolean modificar(Integer id, String nvoNombre);
    public List<Categorias> listar() throws Exception;
    
    public boolean activar(Integer id);
    public boolean desactivar(Integer id);
    
}
