package Ejercicio2Adapter;

public class AdapterCuadratrackElectrico implements ICudratrack {
    private CuadratrackElectrico electrico = new CuadratrackElectrico();

    public AdapterCuadratrackElectrico(CuadratrackElectrico electrico) {

        this.electrico = electrico;
    }

    public void setLlenarGasolina(int gasolina) {

        this.electrico.cargar(gasolina);
    }

    public int estadoCombustible() {

        return this.electrico.estadoElectricidad()/10;
    }
}
