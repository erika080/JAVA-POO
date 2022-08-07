package adminarmas;

public class ArmaLarga extends Arma implements Comparable{
    //atributo
    private  boolean selloRenar;
    private String justificacionUso;
    private Integer nivel;
    //contructor

    public ArmaLarga(Integer cantidadMuniciones, Double alcanceMetros, String marca, Double calibre, String estado, Policia policia, boolean selloRenar, String justificacionUso, Integer nivel) {
        super(cantidadMuniciones, alcanceMetros, marca, calibre, estado, policia);
        this.selloRenar = selloRenar;
        this.justificacionUso = justificacionUso;
        this.nivel = nivel;
    }
    //get y set

    public boolean isSelloRenar() {
        return selloRenar;
    }

    public void setSelloRenar(boolean selloRenar) {
        this.selloRenar = selloRenar;
    }

    public String getJustificacionUso() {
        return justificacionUso;
    }

    public void setJustificacionUso(String justificacionUso) {
        this.justificacionUso = justificacionUso;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    //metodos
    public  boolean condicionUso(){
        return true;
    }
    public int compareTo(Object o){
        return 1;
    }


}
