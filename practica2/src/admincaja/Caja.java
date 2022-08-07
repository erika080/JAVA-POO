package admincaja;

public abstract class Caja {
    //atributos
    private Integer cantidadDinero;
    private Integer cantidadTiquet;
    private boolean tarjetaCredito;

    private Persona persona;

    //contructor

    public Caja(Integer cantidadDinero, Integer cantidadTiquet, boolean tarjetaCredito, Persona persona) {
        this.cantidadDinero = cantidadDinero;
        this.cantidadTiquet = cantidadTiquet;
        this.tarjetaCredito = tarjetaCredito;
        this.persona = persona;
    }


    //set y get

    public Integer getCantidadDinero() {
        return cantidadDinero;
    }

    public void setCantidadDinero(Integer cantidadDinero) {
        this.cantidadDinero = cantidadDinero;
    }

    public Integer getCantidadTiquet() {
        return cantidadTiquet;
    }

    public void setCantidadTiquet(Integer cantidadTiquet) {
        this.cantidadTiquet = cantidadTiquet;
    }

    public boolean isTarjetaCredito() {
        return tarjetaCredito;
    }

    public void setTarjetaCredito(boolean tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
//metodos

public abstract boolean retirarTiquete();


}
