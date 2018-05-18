package Dao.interfaces;

import java.util.Set;
import tablas.Categorias;

public interface CategoriasDao {
    
    boolean guardar(Categorias categorias);
    boolean modificar(Categorias categorias);
    boolean activar(String nombre);
    boolean desactivar(String nombre);
    Set<Categorias> listar();
    Set<Categorias> obtenerId();
    
}
