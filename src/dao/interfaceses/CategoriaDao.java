package dao.interfaceses;

public interface CategoriaDao {
    
    public Integer obtenerId(String nombre);
    public boolean existe(String nombre);
    
    public boolean guardar(String nombre);
    public boolean modificar(Integer id, String nvoNombre, String vjoNombre);
    
    public boolean activar(Integer id);
    public boolean desactivar(Integer id);
    
}
