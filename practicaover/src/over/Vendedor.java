package over;

public class Vendedor extends Empleado{
    private int comision;
    private double importeVentas;

    @Override
    public double calcularSueldo() {
        return sueldo-descuento + importeVentas/100*comision;
    }

    @Override
    public double calcularSueldo(double premio) {
        return sueldo-descuento + premio + importeVentas/100*comision;
    }
}
