package Practicaparcial;

public class Alumno {
    private String nombre;
    private String apellido;
    private  Integer legajo;

    //CONSTRUCTOR!!!

    public Alumno(String nombre, String apellido, Integer legajo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
    }

    //GET Y SET !!!
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getLegajo() {
        return legajo;
    }

    public void setLegajo(Integer legajo) {
        this.legajo = legajo;
    }
    //METODO!!!!

    public void presentarExamen(){

    }

}
