package paquete3;

import paquete2.PlanCelular;

public class PlanPostPagoMegas extends PlanCelular {

    //megas expresado en gigas|costo por cada giga|tarifa base
    private double megasGigas;
    private double costoGigas;
    private double tarifaBase;

    public PlanPostPagoMegas(double mg, double cG, double tBase, String nom, String ape, String pas, String ciu, String barrio, String marca, String modelo, int num) {
        super(nom, ape, pas, ciu, barrio, marca, modelo, num);
        megasGigas = mg;
        costoGigas = cG;
        tarifaBase = tBase;
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
        String cadena = String.format(""
                + "%s"
                + "\tMegas expresado en Gigas: %.2f\n"
                + "\tCosto por cada Giga: $ %.2f\n"
                + "\tTarifa base: %.2f\n\n"
                + "\tPago Mensual: $ %.2f\n",
                super.toString(),
                megasGigas,
                costoGigas,
                tarifaBase,
                pagoMensual);
        return cadena;
    }
}
