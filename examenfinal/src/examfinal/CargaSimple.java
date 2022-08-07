package examfinal;

public class CargaSimple implements Cargable {
    private String nombre;
    private String descripcion;
    private double peso;
    private boolean refrigeracion;

    //CONSTRUCTOR

    public CargaSimple(String nombre, String descripcion, Integer peso, boolean refrigeracion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.peso = peso;
        this.refrigeracion = refrigeracion;
    }

    //GET Y SET

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean getRefrigeracion() {
        return refrigeracion;
    }

    public void setRefrigeracion(boolean refrigeracion) {
        this.refrigeracion = refrigeracion;
    }

    //METODOS

     //PESO CONTENEDOR
    public Double calcularPeso() {
        if (refrigeracion){
            return getPeso() * 1.1;
        }else {
            return getPeso();
        }
    }




}
