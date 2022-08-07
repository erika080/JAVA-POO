package Practicaparcial;

public class Parcial extends Examen{
    private Integer numeroUnidad;
    private Integer numeroIntento;

    public Parcial(String titulo, String enunciado, double nota, Integer numeroUnidad, Integer numeroIntento) {
        super(titulo, enunciado, nota);
        this.numeroUnidad = numeroUnidad;
        this.numeroIntento = numeroIntento;
    }

    public Integer getNumeroUnidad() {
        return numeroUnidad;
    }

    public void setNumeroUnidad(Integer numeroUnidad) {
        this.numeroUnidad = numeroUnidad;
    }

    public Integer getNumeroIntento() {
        return numeroIntento;
    }

    public void setNumeroIntento(Integer numeroIntento) {
        this.numeroIntento = numeroIntento;
    }

    public boolean aprobado(){
        return true;
    }
    public boolean recuperatorio(){
        return  true;
    }
}
