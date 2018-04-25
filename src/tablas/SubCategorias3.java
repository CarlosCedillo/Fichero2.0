package tablas;

public class SubCategorias3 {
    
    private Integer id;
    private Integer idSubCategoria2;
    private String nombre;
    private boolean activo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdSubCategoria2() {
        return idSubCategoria2;
    }

    public void setIdSubCategoria2(Integer idSubCategoria2) {
        this.idSubCategoria2 = idSubCategoria2;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
}
