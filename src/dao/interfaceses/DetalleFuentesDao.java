package dao.interfaceses;

import java.util.List;
import tablas.DetalleFuentes;

public interface DetalleFuentesDao {
    
    public boolean guardar(DetalleFuentes detalleFuentes);
    public List<DetalleFuentes> listaDetalles(Integer fuenteId);
    public boolean modificar(DetalleFuentes detalleFuentes);
    
    public Integer obtenerId(String titulo, String detalle);
    
}
