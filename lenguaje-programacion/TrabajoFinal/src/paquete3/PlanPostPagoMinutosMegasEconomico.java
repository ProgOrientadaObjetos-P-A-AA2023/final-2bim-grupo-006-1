package paquete3;

import paquete2.Datos;
import paquete2.PlanCelular;

public class PlanPostPagoMinutosMegasEconomico extends PlanCelular {
//    minutos|costo minutos|megas expresado en gigas|costo por cada gigas|porcentaje de descuento (Ejemplo: 10%)

    private double minutos;
    private double costoMinutos;
    private double megasGigas;
    private double costoGigas;
    private double porcentajeDescuento;

    public PlanPostPagoMinutosMegasEconomico(double m, double cM, double mG,
            double cG, double pD, Datos d) {
        super(d);
        minutos = m;
        costoMinutos = cM;
        megasGigas = mG;
        costoGigas = cG;
        porcentajeDescuento = pD;
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

    public void establecerPorcentajeDescuento(double pD) {
        porcentajeDescuento = pD;
    }

    @Override
    public void calcularPagoMensual() {
        double op = (minutos * costoMinutos) + (megasGigas * costoGigas);
        pagoMensual = op - ((op * porcentajeDescuento) / 100);
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

    public double obtenerPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public String tosString() {
        String cadena = "\nPlan Post Pago Minutos Megas Economico.\n\n";
        cadena = String.format(""
                + "%s"
                + "%s"
                + "\tMinutos: %.2f\n"
                + "\tCosto Minutos: %.2f\n"
                + "\tMegas expresado en Gigas: %.2f\n"
                + "\tCosto por cada Giga: %.2f\n"
                + "\tPorcntaje Descuento: %.0f\n\n"
                + "\tPago Mensual: %.2f\n",
                cadena,
                datos,
                minutos,
                costoMinutos,
                megasGigas,
                costoGigas,
                porcentajeDescuento,
                obtenerPagoMensual());
        return cadena;
    }

}
