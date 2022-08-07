package practicaexamen;

public class Program {
    public static void main(String[] args) throws Exception {
        Recorrido r1 = new Recorrido("buenos aires", "lujan");
        Reserva reserva1 = new Reserva("111",50,r1 );
        Reserva reserva2 = new Reserva("240",50,r1 );
        Reserva reserva3 = new Reserva("240",50,r1 );


        Empresa empresaInstanciada = new Empresa("martin y asociados");
        empresaInstanciada.agregarReserva(reserva1); // agregando la reserva instanciada arriba
        empresaInstanciada.agregarReserva(reserva2);
        empresaInstanciada.agregarReserva(reserva3);
        System.out.println(empresaInstanciada.toString());
    }

}