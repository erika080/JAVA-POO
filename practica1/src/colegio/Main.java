package colegio;

public class Main {
    public static void main(String[] args) {
        Alumno  a1 = new Alumno("martin", "paliza",2000,2000, 33); // instanciar colocar informacion
        Alumno objeto2 = new Alumno();
        //System.out.println(a1.toString());
        System.out.println("-----------");

        objeto2.setNombre("erika");  //agregando con set nombre al objeto 2, de la clase alumno
        objeto2.setApellido("cabarcas");
        objeto2.setCodigo(1223);
        System.out.println(objeto2.getApellido());
        //System.out.println(objeto2.toString());

        Docente union = new Docente("martin", "paliza","matematicas");
        System.out.println(union.toString());
    }
}
