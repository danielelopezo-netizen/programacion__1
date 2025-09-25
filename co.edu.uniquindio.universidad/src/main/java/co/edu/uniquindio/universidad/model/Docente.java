package co.edu.uniquindio.universidad.model;

public class Docente {

    private String nombre;
    private String apellido;
    private int edad;
    private String correo;

    public Docente() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public double calcularDefinitivaEstudiante(double nota1, double nota2, double nota3) {
        double definitiva = (nota1 + nota2 + nota3)/3;
        return definitiva;
    }






}
