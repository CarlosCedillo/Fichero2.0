package dao.interfaceses;

import java.util.List;
import tablas.DetalleFuentes;

public interface DetalleFuentesDao {
    
    public boolean guardar(DetalleFuentes detalleFuentes);
    public List<DetalleFuentes> listaDetalles();
    public boolean modificar(DetalleFuentes detalleFuentes);
    
    public Integer obtenerId(String titulo);
    public boolean existe(Integer fuenteId, String titulo, String detalle);
    public String obtenerTitulo(Integer detalleId);
    public String obtenerDetalle(Integer detalleId);
    
}
