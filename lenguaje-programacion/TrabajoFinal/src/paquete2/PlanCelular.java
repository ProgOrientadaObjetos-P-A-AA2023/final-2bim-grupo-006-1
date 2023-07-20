package paquete2;

public abstract class PlanCelular {

    protected double pagoMensual;
    protected Datos datos;

    public PlanCelular(Datos d) {
        datos = d;
    }

    public void establecerDatos(Datos datos) {
        this.datos = datos;
    }

    public abstract void calcularPagoMensual();

    public Datos obtenerDatos() {
        return datos;
    }

    public double obtenerPagoMensual() {
        return pagoMensual;
    }

}
