package examfinal;

import java.util.ArrayList;

public class CargaContendores implements Cargable{
    private String nombre;
    private String descripcion;
    private Integer peso;

    private ArrayList<CargaSimple> cargaSimple = new ArrayList<>();

    //CONSTRUCTOR

    public CargaContendores(String nombre, String descripcion, Integer peso) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.peso = peso;
    }
    public CargaContendores(){

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

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }
    public void agregarCargaSimple(CargaSimple s){
        this.cargaSimple.add(s);
    }

    @Override
    public Double calcularPeso()  {
        Double total = 0.0;
        for (CargaSimple c: cargaSimple){
            total+=c.calcularPeso();

        }
        return total;
    }



}
