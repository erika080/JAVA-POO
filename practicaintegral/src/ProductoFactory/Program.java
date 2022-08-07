package ProductoFactory;

public class Program {
    public static void main(String[] args) throws Exception {
  Producto caja = Almacen.construir("caja");
        System.out.println(caja.calcularEspacio());

        Producto Pelota = Almacen.construir("pelota");
        System.out.println(Pelota.calcularEspacio());
    }

}
