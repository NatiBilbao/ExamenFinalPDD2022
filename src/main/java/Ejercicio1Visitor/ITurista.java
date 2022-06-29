package Ejercicio1Visitor;

public abstract class ITurista {
    protected String nombre;
    protected int monto;
    protected int ci;

    public ITurista(String nombre, int monto, int ci) {
        this.nombre = nombre;
        this.monto = monto;
        this.ci = ci;
    }

    public abstract void visit(LaPaz laPaz);

    public abstract void visit(Cochabamba cochabamba);

    public abstract void visit(SantaCruz santaCruz);

}

