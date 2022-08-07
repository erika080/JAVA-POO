package admincaja;

public class RetiroCaja extends Caja {

    //atributos
    private Integer cobroEfectivo;
    private Integer catidadUnidades;
    private String categoria;

    //constructor

    public RetiroCaja(Integer cantidadDinero, Integer cantidadTiquet, boolean tarjetaCredito, Persona persona, Integer cobroEfectivo, Integer catidadUnidades, String categoria) {
        super(cantidadDinero, cantidadTiquet, tarjetaCredito, persona);
        this.cobroEfectivo = cobroEfectivo;
        this.catidadUnidades = catidadUnidades;
        this.categoria = categoria;
    }


    //get y set

    public Integer getCobroEfectivo() {
        return cobroEfectivo;
    }

    public void setCobroEfectivo(Integer cobroEfectivo) {
        this.cobroEfectivo = cobroEfectivo;
    }

    public Integer getCatidadUnidades() {
        return catidadUnidades;
    }

    public void setCatidadUnidades(Integer catidadUnidades) {
        this.catidadUnidades = catidadUnidades;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    //metodoc

    public  boolean retirarTiquete() {
        return true;
    }

    public  boolean esCajaRapida() {
      if (this.categoria.equals("rapida"))
    }
}
