package Ejercicio3Bridge;

public class Twiter implements IRedSocial {

    public Twiter() {}

    @Override
    public void publicar(ISistema sistema) {
        System.out.println("TWITER");
        System.out.println("Capacidad: " + sistema.getCapacidad());
        System.out.println("Requisitos: " + sistema.getRequisitos());
    }
}
