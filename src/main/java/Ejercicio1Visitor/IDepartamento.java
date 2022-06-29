package Ejercicio1Visitor;

public abstract class IDepartamento {
    protected String nombre;
    protected int numeroDeProvincias;
    protected int numeroHabitantes;
    protected String clima;
    protected int dineroTurismo;

    public IDepartamento(String nombre, int numeroDeProvincias, int numeroHabitantes, String clima, int dineroT) {
        this.nombre = nombre;
        this.numeroDeProvincias = numeroDeProvincias;
        this.numeroHabitantes = numeroHabitantes;
        this.clima = clima;
        this.dineroTurismo = dineroT;
    }

    public abstract void accept(ITurista turista);
}
