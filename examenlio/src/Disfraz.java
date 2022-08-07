public class Disfraz extends Jugueteria {

    //ARTRIBUTOS
    private String descripcion;
    private Integer talle;
    //CONSTRUCTOR

//CONSTRUCTOR

    public Disfraz(Integer precio, String descripcion, Integer talle) {
        super(precio);
        this.descripcion = descripcion;
        this.talle = talle;
    }
    // GET Y SET


    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getTalle() {
        return talle;
    }

    public void setTalle(Integer talle) {
        this.talle = talle;
    }
}
