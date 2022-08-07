package practicaexamen;
//Clase
public class Recorrido {

    //atributos
    private String estacionDestino ;
    private String estacionPartida;

    //Constructor


    public Recorrido(String estacionDestino, String estacionPartida) {
        this.estacionDestino = estacionDestino;
        this.estacionPartida = estacionPartida;
    }

    // get y set

    public String getEstacionDestino() {
        return estacionDestino;
    }

    public void setEstacionDestino(String estacionDestino) {
        this.estacionDestino = estacionDestino;
    }

    public String getEstacionPartida() {
        return estacionPartida;
    }

    public void setEstacionPartida(String estacionPartida) {
        this.estacionPartida = estacionPartida;
    }

    @Override
    public String toString() {
        return "Recorrido{" +
                "estacionDestino='" + estacionDestino + '\'' +
                ", estacionPartida='" + estacionPartida + '\'' +
                '}';
    }
}
