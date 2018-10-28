package dao.interfaceses;

public interface SubCategoria1Dao {
    
    public Integer obtenerId(String nombre);
    public String obtenerNombre(Integer id);
    public boolean existe(String nombre, Integer catId);
    
    public boolean guardar(String nombre, Integer catId);
    public boolean modificar(Integer id, String nvoNombre);
    
    public boolean activar(Integer id);
    public boolean desactivar(Integer id);
    
}
