package paquete3;

import paquete2.Datos;
import paquete2.PlanCelular;

public class PlanPostPagoMinutos extends PlanCelular {
//    minutos nacionales|costo minuto nacional|minutos internacionales|costo minuto internacional

    private double minutosNacionales;
    private double costoMinutoNacional;
    private double minutosInternacionales;
    private double costoMinutoInternacionales;

    public PlanPostPagoMinutos(double minutosNacionales, double costoMinutoNacional, 
            double minutosInternacionales, double costoMinutoInternacionales,
            Datos datos) {
        super(datos);
        this.minutosNacionales = minutosNacionales;
        this.costoMinutoNacional = costoMinutoNacional;
        this.minutosInternacionales = minutosInternacionales;
        this.costoMinutoInternacionales = costoMinutoInternacionales;
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
        String cadena = "\nPlan Post Pago Minutos.\n\n";
        cadena = String.format(""
                + "%s"
                + "%s"
                + "\tMinutos Nacionales: %.2f\n"
                + "\tCosto Minuto Nacional: $ %.2f\n"
                + "\tMinutos Internacionales: %.2f\n"
                + "\tCosto Minuto Internacional: $ %.2f\n\n"
                + "\tPago Mensual: $ %.2f\n",
                cadena,
                datos,
                minutosNacionales,
                costoMinutoNacional,
                minutosInternacionales,
                costoMinutoInternacionales,
                obtenerPagoMensual());
        return cadena;
    }

}
