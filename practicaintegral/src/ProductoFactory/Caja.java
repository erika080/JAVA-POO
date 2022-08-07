package ProductoFactory;

public  class Caja extends  Producto {

    private double longitud;
    private double ancho;
    private double altura;

    //constructor
    public Caja(Double peso, double longitud, double ancho, double altura) {
        super(peso);
        this.longitud = longitud;
        this.ancho = ancho;
        this.altura = altura;
    }
    // get y set
    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularEspacio(){
        return this.altura * this.ancho * this.longitud;
    }
}
