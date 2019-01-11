package dao.interfaceses;

public interface SubCategoria2Dao {
    
    public Integer obtenerId(String nombre);
    public Integer obtenerIdEspecial(String nombre, Integer sub1Id);
    
    public String obtenerNombre(Integer id);
    public boolean existe(String nombre, Integer sub1Id);
    
    public boolean guardar(String nombre, Integer sub1Id);
    public boolean modificar(Integer id, String nvoNombre);
    
    public boolean activar(Integer id);
    public boolean desactivar(Integer id);
    
}
