package Ejercicio3Bridge;

public class Facebook implements IRedSocial {

    public Facebook() {}

    @Override
    public void publicar(ISistema sistema) {
        System.out.println("FACEBOOK");
        System.out.println("Capacidad: " + sistema.getCapacidad());
        System.out.println("Requisitos: " + sistema.getRequisitos());
    }
}
