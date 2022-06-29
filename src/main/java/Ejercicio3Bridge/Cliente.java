package Ejercicio3Bridge;

public class Cliente {
    public static void main(String[] args) {
        SistemaColegio sistema1 = new SistemaColegio("San Calixto", 10000, "nombre completo, libreta, codigo, matricula pagada");
        sistema1.publicarEnRedSocial(new Facebook());
        sistema1.publicarEnRedSocial(new Twiter());
        sistema1.publicarEnRedSocial(new WhatsApp());

        System.out.println();
        SistemaUniversidad sistema2 = new SistemaUniversidad("Universida Privada Boliviana",50000,"nombre completo, libreta, codigo, matricula pagada");
        sistema2.publicarEnRedSocial(new Facebook());
        sistema2.publicarEnRedSocial(new Twiter());
        sistema2.publicarEnRedSocial(new WhatsApp());

        System.out.println();
        SistemaEscuela sistema3 = new SistemaEscuela("Republica de Japon",5000,"nombre completo, libreta, codigo, matricula pagada");
        sistema3.publicarEnRedSocial(new Facebook());
        sistema3.publicarEnRedSocial(new Twiter());
        sistema3.publicarEnRedSocial(new WhatsApp());
    }
}
