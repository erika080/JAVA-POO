package PARCIALPOO;

import java.util.Date;

public class TituloTerciario extends Titulo {
    //atributo
    private boolean validacion;

    //contructor

    public TituloTerciario(Integer cantidadMaterias, Date fechaInicio, Date fechaFinalizacion, boolean selloMinisterio, boolean selloInstituto, Persona persona, boolean validacion) {
        super(cantidadMaterias, fechaInicio, fechaFinalizacion, selloMinisterio, selloInstituto, persona);
        this.validacion = validacion;
    }


    //get y set

    public boolean isValidacion() {
        return validacion;
    }

    public void setValidacion(boolean validacion) {
        this.validacion = validacion;
    }


    //metodos


}
