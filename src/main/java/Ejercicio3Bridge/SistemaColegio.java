package Ejercicio3Bridge;

import java.util.ArrayList;
import java.util.List;

public class SistemaColegio implements ISistema {
    private String nombre;
    private int capacidad;
    private List<Estudiante> estudiantes = new ArrayList<>();;
    private String requisitos;

    public SistemaColegio(String nombre, int capacidad, String requisitos) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.requisitos = requisitos;
    }

    public void inscribirEstudiante(Estudiante e) {

        estudiantes.add(e);
    }


    public String getNombre() {

        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public int getCapacidad() {

        return capacidad;
    }

    public void setCapacidad(int capacidad) {

        this.capacidad = capacidad;
    }

    public List<Estudiante> getEstudiantes() {

        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {

        this.estudiantes = estudiantes;
    }

    public String getRequisitos() {

        return requisitos;
    }

    public void setRequisitos(String requisitos) {

        this.requisitos = requisitos;
    }

    @Override
    public void publicarEnRedSocial(IRedSocial redSocial) {
        System.out.println("SISTEMA DE COLEGIO");
        System.out.println("Nombre: " + nombre);
        redSocial.publicar(this);
    }

    public void showEstudiantes() {
        for (Estudiante estudiante : estudiantes) {
            estudiante.showInfo();
        }
    }
}
