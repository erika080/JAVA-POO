package over;

public class Empleado{
    private String nombre;
    private String legajo;
   private double sueldo;
   private double descuento;

    public double calcularSueldo(){
        return sueldo-descuento;
    }

    public double calcularSueldo(double premio){
        return  sueldo-descuento + premio;
    }

}
