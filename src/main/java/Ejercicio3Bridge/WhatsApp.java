package Ejercicio3Bridge;

public class WhatsApp implements IRedSocial {

    public WhatsApp() {}

    @Override
    public void publicar(ISistema sistema) {
        System.out.println("WHATSAPP");
        System.out.println("Capacidad: " + sistema.getCapacidad());
        System.out.println("Requisitos: " + sistema.getRequisitos());
    }
}
