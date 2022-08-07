package PARCIALPOO;

import java.util.Date;

public  abstract  class Titulo {

    private Integer cantidadMaterias;
    private Date fechaInicio;
    private Date fechaFinalizacion;
    private boolean selloMinisterio;
    private boolean selloInstituto;
    private Persona persona;
    //contructor

    public Titulo(Integer cantidadMaterias, Date fechaInicio, Date fechaFinalizacion, boolean selloMinisterio, boolean selloInstituto, Persona persona) {
        this.cantidadMaterias = cantidadMaterias;
        this.fechaInicio = fechaInicio;
        this.fechaFinalizacion = fechaFinalizacion;
        this.selloMinisterio = selloMinisterio;
        this.selloInstituto = selloInstituto;
        this.persona = persona;
    }
    // get y set

    public Integer getCantidadMaterias() {
        return cantidadMaterias;
    }

    public void setCantidadMaterias(Integer cantidadMaterias) {
        this.cantidadMaterias = cantidadMaterias;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public void setFechaFinalizacion(Date fechaFinalizacion) {
        this.fechaFinalizacion = fechaFinalizacion;
    }

    public boolean isSelloMinisterio() {
        return selloMinisterio;
    }

    public void setSelloMinisterio(boolean selloMinisterio) {
        this.selloMinisterio = selloMinisterio;
    }

    public boolean isSelloInstituto() {
        return selloInstituto;
    }

    public void setSelloInstituto(boolean selloInstituto) {
        this.selloInstituto = selloInstituto;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }


    //metodos
}
