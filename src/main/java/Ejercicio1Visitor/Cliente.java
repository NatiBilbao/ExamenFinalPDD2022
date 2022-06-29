package Ejercicio1Visitor;

public class Cliente {
    public static void main(String[] args){
        LaPaz laPaz = new LaPaz("La Paz", 26, 3597853, "Frio", 700);
        Cochabamba cochabamba = new Cochabamba("Cochabamba", 17, 3000999, "Templado", 500);
        SantaCruz santaCruz = new SantaCruz("Santa Cruz", 33, 5999377, "Caluroso", 1000);
        Turista turista = new Turista("Cris", 80000000, 65412378);

        laPaz.accept(turista);
        cochabamba.accept(turista);
        santaCruz.accept(turista);
    }
}
