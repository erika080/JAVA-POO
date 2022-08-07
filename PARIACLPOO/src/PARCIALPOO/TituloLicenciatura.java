package PARCIALPOO;

import java.util.Date;

public class TituloLicenciatura  extends Titulo implements comparable{
    //atributo
    private String tema;
    private Date fechaEntrega;
    private Integer cantidadTrabajos;
    private String validacion;

    //contructor

    public TituloLicenciatura(Integer cantidadMaterias, Date fechaInicio, Date fechaFinalizacion, boolean selloMinisterio, boolean selloInstituto, Persona persona, String tema, Date fechaEntrega, Integer cantidadTrabajos) {
        super(cantidadMaterias, fechaInicio, fechaFinalizacion, selloMinisterio, selloInstituto, persona);
        this.tema = tema;
        this.fechaEntrega = fechaEntrega;
        this.cantidadTrabajos = cantidadTrabajos;
    }

    // get y set

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public Integer getCantidadTrabajos() {
        return cantidadTrabajos;
    }

    public void setCantidadTrabajos(Integer cantidadTrabajos) {
        this.cantidadTrabajos = cantidadTrabajos;
    }

    //metodos
    @Override
    public boolean ejercer() {
        boolean get;
        if(get selloMinisterio() && selloInstituto()){
            return true;
        }else{
            return false;
        }
    }

    public boolean validacionNacional(){
        if(this.validacion.equals("NACIONAL")){
            return true;
        }else{
            return false;
        }
    }



}
