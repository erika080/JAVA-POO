package ProductoFactory;

public abstract class Producto {
    private Double peso;

    // constructor
    public Producto(Double peso) {
        this.peso = peso;
    }
    // get y set


    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public abstract double calcularEspacio();

}
