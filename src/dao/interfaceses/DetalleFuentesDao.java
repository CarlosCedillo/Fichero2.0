package dao.interfaceses;

import java.util.List;
import tablas.DetalleFuentes;

public interface DetalleFuentesDao {
    
    public boolean guardar(DetalleFuentes detalleFuentes);
    public List<DetalleFuentes> listaDetalles();
    public boolean modificar(DetalleFuentes detalleFuentes);
    
    public Integer obtenerId(Integer fuenteId, String titulo, String detalle);
    public boolean existe(Integer fuenteId, String titulo, String detalle);
    
}
