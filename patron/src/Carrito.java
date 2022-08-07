import java.util.ArrayList;

public class Carrito {
    private Statecarrito estado;
    private ArrayList<Productos> productos;

    //CONSTRUCTOR

    public Carrito(){
        estado=new Vacio();
        setEstado(new Vacio());
    }

    public Statecarrito getEstado(){
       return estado;
    }

    public  void setEstado(Statecarrito estado){
        this.estado=estado;
    }

}
