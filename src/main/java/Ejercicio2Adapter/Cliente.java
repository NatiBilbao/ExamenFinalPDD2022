package Ejercicio2Adapter;

import java.util.ArrayList;

public class Cliente {
    public static void main(String[] args) {
        CuadratrackDiesel cuadratrackDiesel = new CuadratrackDiesel();
        CuadratrackElectrico cuadratrackElectrico = new CuadratrackElectrico();
        CuadratrackGasEspecial cuadratrackGasEspecial = new CuadratrackGasEspecial();
        CuadratrackGasolina cuadratrackGasolina = new CuadratrackGasolina();

        AdapterCuadratrackElectrico adapterAutoElectrico = new AdapterCuadratrackElectrico(cuadratrackElectrico);
        ArrayList<ICudratrack> autos = new ArrayList();
        autos.add(cuadratrackGasEspecial);
        autos.add(adapterAutoElectrico);
        autos.add(cuadratrackDiesel);
        autos.add(cuadratrackGasolina);

        cuadratrackDiesel.setLlenarGasolina(7);
        cuadratrackGasEspecial.setLlenarGasolina(8);
        cuadratrackGasolina.setLlenarGasolina(9);
        adapterAutoElectrico.setLlenarGasolina(6);

        for(int i = 0; i < autos.size(); ++i) {
            autos.get(i).estadoCombustible();
        }
    }
}
