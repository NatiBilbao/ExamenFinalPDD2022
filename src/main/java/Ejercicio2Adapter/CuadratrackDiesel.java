package Ejercicio2Adapter;

public class CuadratrackDiesel implements ICudratrack {
    public void setLlenarGasolina(int gasolina) {
        if (gasolina < 50 && gasolina > 0) {
            System.out.println("Se anadio: " + gasolina + " litros de gasolina");
        } else {
            System.out.println("Cantidad de gasolina invalida. ");
        }
    }
    public int estadoCombustible() {
        int numero = (int) (Math.random() * 50.0D) + 1;
        System.out.println("Combustible de cuadratrack a diesel: " + numero);
        return numero;
    }
}
