package adminarmas;

public abstract  class Arma {

    //atributos
private Integer cantidadMuniciones;
private Double alcanceMetros;
private String marca;
private Double calibre;
private String estado;
private Policia policia; // llamando la otra clase (relacion)

//contructor

    public Arma(Integer cantidadMuniciones, Double alcanceMetros, String marca, Double calibre, String estado, Policia policia) {
        this.cantidadMuniciones = cantidadMuniciones;
        this.alcanceMetros = alcanceMetros;
        this.marca = marca;
        this.calibre = calibre;
        this.estado = estado;
        this.policia = policia;
    }
    //get y set

    public Integer getCantidadMuniciones() {
        return cantidadMuniciones;
    }

    public void setCantidadMuniciones(Integer cantidadMuniciones) {
        this.cantidadMuniciones = cantidadMuniciones;
    }

    public Double getAlcanceMetros() {
        return alcanceMetros;
    }

    public void setAlcanceMetros(Double alcanceMetros) {
        this.alcanceMetros = alcanceMetros;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getCalibre() {
        return calibre;
    }

    public void setCalibre(Double calibre) {
        this.calibre = calibre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Policia getPolicia() {
        return policia;
    }

    public void setPolicia(Policia policia) {
        this.policia = policia;
    }
    //metodos
public abstract boolean condicionUso();

}
