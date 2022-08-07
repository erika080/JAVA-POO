package Practicaparcial;

public abstract class Examen {
    private String titulo;
    private String enunciado;
    private double nota;

    public Examen(String titulo, String enunciado, double nota) {
        this.titulo = titulo;
        this.enunciado = enunciado;
        this.nota = nota;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
   public abstract boolean aprobado();

}

