package tablas;

public class DetalleFuentes {
    
    private Integer id;
    private Integer fuenteId;
    private String titulo;
    private String detalle;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFuenteId() {
        return fuenteId;
    }

    public void setFuenteId(Integer fuenteId) {
        this.fuenteId = fuenteId;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    @Override
    public String toString() {
        return titulo;
    }
    
}
