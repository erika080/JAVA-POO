public class JuegoDeMesa extends Jugueteria {
//ATRIBUTOS CLASE HIJA
    private String nombre;
    private Integer edadMin;
    private Integer edadMax;

    //CONSTRUCTOR
    public JuegoDeMesa(Integer precio, String nombre, Integer edadMin, Integer edadMax) {
        super(precio);
        this.nombre = nombre;
        this.edadMin = edadMin;
        this.edadMax = edadMax;
    }

    //GET Y SET
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdadMin() {
        return edadMin;
    }

    public void setEdadMin(Integer edadMin) {
        this.edadMin = edadMin;
    }

    public Integer getEdadMax() {
        return edadMax;
    }

    public void setEdadMax(Integer edadMax) {
        this.edadMax = edadMax;
    }
}
