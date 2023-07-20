package paquete3;

import paquete2.Datos;
import paquete2.PlanCelular;

public class PlanPostPagoMegas extends PlanCelular {

    //megas expresado en gigas|costo por cada giga|tarifa base
    private double megasGigas;
    private double costoGigas;
    private double tarifaBase;

    public PlanPostPagoMegas(double mG, double cG, double tB, Datos d) {
        super(d);
        megasGigas = mG;
        costoGigas = cG;
        tarifaBase = tB;
    }



    public void establecerMegasGigas(double mG) {
        megasGigas = mG;
    }

    public void establecerCostoGigas(double cG) {
        costoGigas = cG;
    }

    public void establecerTarifaBase(double tB) {
        tarifaBase = tB;
    }

    @Override
    public void calcularPagoMensual() {
        pagoMensual = (megasGigas * costoGigas) + tarifaBase;
    }

    public double obtenerMegasGigas() {
        return megasGigas;
    }

    public double obtenerCostoGigas() {
        return costoGigas;
    }

    public double obtenerTarifaBase() {
        return tarifaBase;
    }

    @Override
    public String toString() {
        String cadena = "\nPlan Post Pago Megas.\n\n";
        cadena = String.format(""
                + "%s"
                + "%s"
                + "\tMegas expresado en Gigas: %.2f\n"
                + "\tCosto por cada Giga: $ %.2f\n"
                + "\tTarifa base: %.2f\n\n"
                + "\tPago Mensual: $ %.2f\n",
                cadena,
                datos,
                megasGigas,
                costoGigas,
                tarifaBase,
                obtenerPagoMensual());
        return cadena;
    }
}
