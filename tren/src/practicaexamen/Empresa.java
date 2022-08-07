package practicaexamen;

import java.util.ArrayList;

public class Empresa {
    private String nombre;
    //ARRAY
    private ArrayList<Reserva> reserva = new ArrayList<>();

    // Constructor

    public Empresa(String nombre) throws Exception {
        if (nombre.equals("")) throw new Exception("ingrese un nombre");
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // METODO -- AGREGAR VARIAS RESERVAS
    public void agregarReserva(Reserva nueva) throws Exception {
        if (nueva == null) throw new Exception("ingrese una reserva");
        reserva.add(nueva);
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                ", reserva=" + reserva +
                '}';
    }
}
