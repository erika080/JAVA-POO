package Practicaparcial;

public class ExamenFinal extends Examen{
    private double notaOral;
    private String descripcionOral;

    public ExamenFinal(String titulo, String enunciado, double nota, double notaOral, String descripcionOral) {
        super(titulo, enunciado, nota);
        this.notaOral = notaOral;
        this.descripcionOral = descripcionOral;
    }

    public double getNotaOral() {
        return notaOral;
    }

    public void setNotaOral(double notaOral) {
        this.notaOral = notaOral;
    }

    public String getDescripcionOral() {
        return descripcionOral;
    }

    public void setDescripcionOral(String descripcionOral) {
        this.descripcionOral = descripcionOral;
    }

    public boolean aprobado(){
        if(getNota() >= 4){
            return true;
        }
        else {
            return false;
        }

    }

}

