package colegio;

public class Alumno {
    private String  nombre;
    private String apellido;
    private int  codigo;
    private int anioingreso;
    private int edad;

    public Alumno(String nombre, String apellido, int codigo, int anioingreso, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigo = codigo;
        this.anioingreso = anioingreso;
        this.edad = edad;
    }

    public Alumno(String nombre, String apellido, int codigo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigo = codigo;
    }

    public Alumno() {

    }

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

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getAnioingreso() {
        return anioingreso;
    }

    public void setAnioingreso(int anioingreso) {
        this.anioingreso = anioingreso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", codigo=" + codigo +
                ", anioingreso=" + anioingreso +
                ", edad=" + edad +
                '}';
    }
}


   // Ya creamos la clase Cuenta que contiene un numero de cuenta y un saldo
    //Crear un método llamado depositar que tenga como parámetros de entrada cantidad de dinero. Al ser un
       // depósito la cantidad de dinero se incrementa al saldo.
        //Crear un método llamado retirar que tenga como parámetros de entrada cantidad de dinero. Al ser
        //una extracción, la cantidad se resta del saldo
        //Solo permitir realizar la extracción si el saldo es suficiente

