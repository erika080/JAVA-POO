package adminarmas;

import com.sun.source.tree.BreakTree;

public class ArmaCorta extends Arma {
    //atributos
    private boolean automatica;
//constructor
    public ArmaCorta(Integer cantidadMuniciones, Double alcanceMetros, String marca, Double calibre, String estado, Policia policia, boolean automatica) {
        super(cantidadMuniciones, alcanceMetros, marca, calibre, estado, policia);
        this.automatica = automatica;
    }
   // get y set

    public boolean isAutomatica() {
        return automatica;
    }

    public void setAutomatica(boolean automatica) {
        this.automatica = automatica;
    }

    // metodos
    public  boolean condicionUso(){
        return true;
    }
    public boolean alcance(){
        if (getAlcanceMetros()> 200 ) {
            return true;
        }
        else {
            return false;
        }
    }




}
