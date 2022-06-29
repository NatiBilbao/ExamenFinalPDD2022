package Ejercicio5Decorator;

public class Client {
    public static void main(String[] args) {
        enumMarcas enumMarcas = null;

        System.out.println();
        ICelular celular1 = new Celular(enumMarcas.Apple, 1200, 6, 16,"Intel 750");
        celular1 = new Carcasa(celular1, 100);
        celular1 = new VidrioTemplado(celular1, 50);
        celular1 = new MemoriaExterna(celular1, 50, 18);

        celular1.operation();
        System.out.println("***************************************************");
        System.out.println("Precio final: " + celular1.getPrecioTotal() + " Almacenamiento final: " + celular1.getAlmacenamientoTotal());
        System.out.println("***************************************************");

        System.out.println();
        ICelular celular2 = new Celular(enumMarcas.Samsung, 1500, 6, 32,"Intel 750");
        celular2 = new Carcasa(celular2, 120);
        celular2 = new VidrioTemplado(celular2, 60);
        celular2 = new MemoriaExterna(celular2, 100, 16);

        celular2.operation();
        System.out.println("***************************************************");
        System.out.println("Precio final: " + celular2.getPrecioTotal() + " Almacenamiento final: " + celular2.getAlmacenamientoTotal());
        System.out.println("***************************************************");

        System.out.println();
        ICelular celular3 = new Celular(enumMarcas.Xiaomi, 2000, 6, 32,"Intel 750");
        celular3 = new Carcasa(celular3, 110);
        celular3 = new VidrioTemplado(celular3, 55);
        celular3 = new MemoriaExterna(celular3, 105, 14);

        celular3.operation();
        System.out.println("***************************************************");
        System.out.println("Precio final: " + celular3.getPrecioTotal() + " Almacenamiento final: " + celular3.getAlmacenamientoTotal());
        System.out.println("***************************************************");
    }

}
