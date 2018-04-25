package tablas;

public class SubCategorias2 {
    
    private Integer id;
    private Integer idSubCategoria1;
    private String nombre;
    private boolean activo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdSubCategoria1() {
        return idSubCategoria1;
    }

    public void setIdSubCategoria1(Integer idSubCategoria1) {
        this.idSubCategoria1 = idSubCategoria1;
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
