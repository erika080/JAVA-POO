package ProductoFactory;

public class Almacen {
    //excepcion
    public static Producto construir(String medida) throws Exception{
        if (medida.equalsIgnoreCase("caja")){
            return new Caja(2.0,4.0,8.3,9.3);
        } else if (medida.equalsIgnoreCase("Pelota")) {
            return new Pelota(5.0,4.0);
        }else throw  new Exception("claseInvalida");
    }
}
