package Ejercicio3Bridge;

public class Estudiante {
    private String nombre;
    private int codigo;

    public Estudiante(String nombre, int codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public String getNombre() {

        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public int getCi() {

        return codigo;
    }

    public void setCi(int ci) {

        this.codigo = ci;
    }

    public void showInfo() {
        System.out.println("----- INFORMACION DEL ESTUDIANTE -----");
        System.out.println("Nombre: " + nombre);
        System.out.println("Codigo: " + codigo);
    }
}
