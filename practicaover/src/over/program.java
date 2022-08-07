package over;

public class program {
        public static void main(String[] args){

        Empleado miEmpleado = new Empleado("Martin","08");
        System.out.println("sueldo a cobrar: " + miEmpleado.calcularSueldo());
        System.out.println("sueldo a cobrar; " + miEmpleado.calcularSueldo(5000));
    }
}
