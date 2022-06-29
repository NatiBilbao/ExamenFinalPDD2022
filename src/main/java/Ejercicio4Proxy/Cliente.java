package Ejercicio4Proxy;

public class Cliente {
    public static void main(String[] args) {
        Proxy proxy = new Proxy(new Servidor1(), new Servidor2());

        proxy.register(6,"Cristoffer", "Cris", "def");
        proxy.register(7,"Lili", "Li", "789");

        proxy.brindarAtencion(6, "def");
        proxy.brindarAtencion(7, "789");
    }
}
