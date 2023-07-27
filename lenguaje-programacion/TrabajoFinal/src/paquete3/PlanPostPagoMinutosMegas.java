package paquete3;

import paquete2.PlanCelular;

public class PlanPostPagoMinutosMegas extends PlanCelular {
//    minutos|costo minutos|megas expresado en gigas|costo por cada giga

    private double minutos;
    private double costoMinutos;
    private double megasGigas;
    private double costoGigas;

    public PlanPostPagoMinutosMegas(double min, double cMin, double mg, double cG, String nom, String ape, String pas, String ciu, String barrio, String marca, String modelo, int num) {
        super(nom, ape, pas, ciu, barrio, marca, modelo, num);
        minutos = min;
        costoMinutos = cMin;
        megasGigas = mg;
        costoGigas = cG;
    }

    public void establecerMinutos(double m) {
        minutos = m;
    }

    public void establecerCostoMinutos(double cM) {
        costoMinutos = cM;
    }

    public void establecerMegasGigas(double mG) {
        megasGigas = mG;
    }

    public void establecerCostoGigas(double cG) {
        costoGigas = cG;
    }

    @Override
    public void calcularPagoMensual() {
        pagoMensual = (minutos * costoMinutos) + (megasGigas * costoGigas);
    }

    public double obtenerMinutos() {
        return minutos;
    }

    public double obtenerCostoMinutos() {
        return costoMinutos;
    }

    public double obtenerMegasGigas() {
        return megasGigas;
    }

    public double obtenerCostoGigas() {
        return costoGigas;
    }

    @Override
    public String toString() {
        String cadena = String.format(""
                + "%s"
                + "\tMinutos : %.2f\n"
                + "\tCosto Minutos: %.2f\n"
                + "\tMegas Expresado en Gigas: %.2f\n"
                + "\tCosto por cada Giga: %.2f\n\n"
                + "\tPago Mensual: $ %.2f\n",
                super.toString(),
                minutos,
                costoMinutos,
                megasGigas,
                costoGigas,
                obtenerPagoMensual());
        return cadena;
    }

}
