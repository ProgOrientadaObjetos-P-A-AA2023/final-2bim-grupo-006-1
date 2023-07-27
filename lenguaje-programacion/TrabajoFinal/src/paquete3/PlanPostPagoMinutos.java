package paquete3;

import paquete2.PlanCelular;

public class PlanPostPagoMinutos extends PlanCelular {
//    minutos nacionales|costo minuto nacional|minutos internacionales|costo minuto internacional

    private double minutosNacionales;
    private double costoMinutoNacional;
    private double minutosInternacionales;
    private double costoMinutoInternacionales;

    public PlanPostPagoMinutos(double mN, double cMN, double mI, double cMI, String nom, String ape, String pas, String ciu, String barrio, String marca, String modelo, int num) {
        super(nom, ape, pas, ciu, barrio, marca, modelo, num);
        minutosNacionales = mN;
        costoMinutoNacional = cMN;
        minutosInternacionales = mI;
        costoMinutoInternacionales = cMI;
    }

    public void establecerMinutosNacionales(double mN) {
        minutosNacionales = mN;
    }

    public void establecerCostoMinutoNacional(double cN) {
        costoMinutoNacional = cN;
    }

    public void establecerMinutosInternacionales(double mI) {
        minutosInternacionales = mI;
    }

    public void establecerCostoMinutoInternacionales(double cI) {
        costoMinutoInternacionales = cI;
    }

    @Override
    public void calcularPagoMensual() {
        pagoMensual = (minutosNacionales * costoMinutoNacional)
                + (minutosInternacionales * costoMinutoInternacionales);
    }

    public double obtenerMinutosNacionales() {
        return minutosNacionales;
    }

    public double obtenerCostoMinutoNacional() {
        return costoMinutoNacional;
    }

    public double obtenerMinutosInternacionales() {
        return minutosInternacionales;
    }

    public double obtenerCostoMinutoInternacionales() {
        return costoMinutoInternacionales;
    }

    @Override
    public String toString() {
        String cadena = String.format(""
                + "%s"
                + "\tMinutos Nacionales: %.2f\n"
                + "\tCosto Minuto Nacional: $ %.2f\n"
                + "\tMinutos Internacionales: %.2f\n"
                + "\tCosto Minuto Internacional: $ %.2f\n\n"
                + "\tPago Mensual: $ %.2f\n",
                super.toString(),
                minutosNacionales,
                costoMinutoNacional,
                minutosInternacionales,
                costoMinutoInternacionales,
                pagoMensual);
        return cadena;
    }

}
