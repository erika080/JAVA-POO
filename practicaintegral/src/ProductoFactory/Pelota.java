package ProductoFactory;

public class Pelota extends Producto {

    private double radio;

    //constructor
    public Pelota(Double peso, double radio) {
        super(peso);
        this.radio = radio;
    }

    // get y set

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    //metodo

    public double calcularEspacio() {
        return this.radio * this.radio * this.radio* (4/3) * Math.PI;
    }
}
