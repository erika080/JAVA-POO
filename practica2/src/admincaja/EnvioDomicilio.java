package admincaja;

public class EnvioDomicilio extends Caja{
//atributos
    private Integer cantidadPorMes;
    private Integer cantidadDespacho;

    //constructor

    public EnvioDomicilio(Integer cantidadDinero, Integer cantidadTiquet, boolean tarjetaCredito, Persona persona, Integer cantidadPorMes, Integer cantidadDespacho) {
        super(cantidadDinero, cantidadTiquet, tarjetaCredito, persona);
        this.cantidadPorMes = cantidadPorMes;
        this.cantidadDespacho = cantidadDespacho;
    }


    //get y set

    public Integer getCantidadPorMes() {
        return cantidadPorMes;
    }

    public void setCantidadPorMes(Integer cantidadPorMes) {
        this.cantidadPorMes = cantidadPorMes;
    }

    public Integer getCantidadDespacho() {
        return cantidadDespacho;
    }

    public void setCantidadDespacho(Integer cantidadDespacho) {
        this.cantidadDespacho = cantidadDespacho;
    }

    //metodos
    public  boolean retirarTiquete() {
        return true;
    }
public Integer compareTo(Object objeto){
        return 1;
}
}
