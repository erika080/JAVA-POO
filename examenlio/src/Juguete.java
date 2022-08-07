public class Juguete extends Jugueteria{

    //ATRIBUTOS
    private String nombre;
    private Integer edadMin;

    //CONSTRUCTOR
    public Juguete(Integer precio, String nombre, Integer edadMin) {
        super(precio);
        this.nombre = nombre;
        this.edadMin = edadMin;
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


}
