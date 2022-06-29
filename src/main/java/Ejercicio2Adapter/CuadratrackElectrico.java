package Ejercicio2Adapter;

public class CuadratrackElectrico implements ICuadratrackElectrico {
    public CuadratrackElectrico() {
    }
    public void cargar(int bateria) {
        if (bateria < 20 && bateria > 0 && bateria % 2 == 0) {
            System.out.println("Se cargo: " + bateria + "% de bateria");
        } else {
            System.out.println("Porfavor introduzca una cantidad de bateria adecuada. ");
        }
    }
    public int estadoElectricidad() {
        int rnd = (int)(Math.random() * 10.0D) + 1;
        System.out.println("Combustible de cuadratrack electrico: " + rnd);
        return rnd;
    }
}
