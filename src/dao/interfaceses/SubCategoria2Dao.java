package dao.interfaceses;

public interface SubCategoria2Dao {
    
    public Integer obtenerId(String nombre);
    public String obtenerNombre(Integer id);
    public boolean existe(String nombre, Integer sub2Id);
    
    public boolean guardar(String nombre, Integer sub2Id);
    public boolean modificar(Integer id, String nvoNombre);
    
    public boolean activar(Integer id);
    public boolean desactivar(Integer id);
    
}
