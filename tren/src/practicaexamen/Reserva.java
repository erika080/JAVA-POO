package practicaexamen;

public class Reserva {
    private String codigo;
    private int CantidadViajeros;
    private Recorrido recorrido;

    //Constructor

    public Reserva(String codigo, int cantidadViajeros, Recorrido recorrido) throws Exception{
        if (recorrido == null) throw new Exception("Ingrese el recorrido");
        this.codigo = codigo;
        CantidadViajeros = cantidadViajeros;
        this.recorrido = recorrido;
    }


    //get y set

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCantidadViajeros() {
        return CantidadViajeros;
    }

    public void setCantidadViajeros(int cantidadViajeros) {
        CantidadViajeros = cantidadViajeros;
    }

    // metodos
public double calcularPrecio(){
        if (this.recorrido.getEstacionPartida().equalsIgnoreCase("buenos aires") &&
                this.recorrido.getEstacionDestino().equalsIgnoreCase("bragado")){
            return this.getCantidadViajeros() * 50 * 0.8;
        }
    if (this.recorrido.getEstacionPartida().equalsIgnoreCase("bragado") &&
            this.recorrido.getEstacionDestino().equalsIgnoreCase("buenos aires")){
        return this.getCantidadViajeros() * 50 * 0.8;
    }
        return this.CantidadViajeros * 50;

}





    @Override
    public String toString() {
        return "Reserva{" +
                "codigo='" + codigo + '\'' +
                ", CantidadViajeros=" + CantidadViajeros +
                ", recorrido=" + recorrido +
                '}';
    }
}
