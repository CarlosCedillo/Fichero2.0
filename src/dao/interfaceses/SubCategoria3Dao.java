package dao.interfaceses;

public interface SubCategoria3Dao {
    
    public Integer obtenerId(String nombre);
    public String obtenerNombre(Integer id);
    public boolean existe(String nombre);
    
    public boolean guardar(String nombre);
    public boolean modificar(Integer id, String nvoNombre);
    
    public boolean activar(Integer id);
    public boolean desactivar(Integer id);
    
}
