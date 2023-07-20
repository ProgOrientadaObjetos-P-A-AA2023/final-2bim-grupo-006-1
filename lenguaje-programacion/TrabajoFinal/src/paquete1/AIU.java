//package paquete1;
//
//import java.util.ArrayList;
//import java.util.Locale;
//import java.util.Scanner;
//import paquete2.PlanCelular;
//import paquete3.PlanPostPagoMinutos;
//import paquete3.PlanPostPagoMegas;
//import paquete3.PlanPostPagoMinutosMegas;
//import paquete3.PlanPostPagoMinutosMegasEconomico;
//
//public class Inicio {
//
//    public static void main(String[] args) {
//        // TODO code application logic here
//        Scanner entrada = new Scanner(System.in);
//        Locale.setDefault(Locale.US);
//        ArrayList<PlanCelular> listaPlanes = new ArrayList<>();
//        boolean bandera = true;
//        int opcion;
//
//        String nombres = "";
//        String apellidos = "";
//        String pasaporte = "";
//        String ciudad = "";
//        String barrio = "";
//        String marcaCelular = "";
//        String modeloCelular = "";
//        int numeroCelular = 0;
//
//        double megasGigas;
//        double costoGigas;
//        double minutos;
//        double costoMinutos;
//
//        while (bandera) {
//            System.out.println("Ingrese la opcion:\n"
//                    + "\t1) Plan Post Pago Minutos\n"
//                    + "\t2) Plan Post Pago Megas\n"
//                    + "\t3) Plan Post Pago Minutos Megas\n"
//                    + "\t4) Plan Post Pago Minutos Megas Economico\n");
//            opcion = entrada.nextInt();
//
//            if (opcion == 1 || opcion == 2 || opcion == 3 || opcion == 4) {
//                entrada.nextLine();
//                System.out.println("Ingrese los Nombres del Propietario: ");
//                nombres = entrada.nextLine();
//                System.out.println("Ingrese los Apellidos del Propietario: ");
//                apellidos = entrada.nextLine();
//                System.out.println("Ingrese el Pasaporte del Propietario: ");
//                pasaporte = entrada.nextLine();
//                System.out.println("Ingrese la Ciudad del Propietario: ");
//                ciudad = entrada.nextLine();
//                System.out.println("Ingrese el Barrio del Propietario: ");
//                barrio = entrada.nextLine();
//                System.out.println("Ingrese la marca del Celular: ");
//                marcaCelular = entrada.nextLine();
//                System.out.println("Ingrese el modelo del Celular: ");
//                modeloCelular = entrada.nextLine();
//                System.out.println("Ingrese el numero de telefono: ");
//                numeroCelular = entrada.nextInt();
//                entrada.nextLine();
//            }
//
//            switch (opcion) {
//                case 1:
//                    System.out.println("Ingrese los Minutos Nacionales: ");
//                    double minutosNacionales = entrada.nextDouble();
//                    System.out.println("Ingrese el costo de Minutos Nacionales: ");
//                    double costoMinutoNacional = entrada.nextDouble();
//                    System.out.println("Ingrese los Minutos Internacionales: ");
//                    double minutosInternacionales = entrada.nextDouble();
//                    System.out.println("Ingrese el costo de Minutos Internacionales: ");
//                    double costoMinutoInternacionales = entrada.nextDouble();
//                    entrada.nextLine();
//                    PlanPostPagoMinutos plan1 = new PlanPostPagoMinutos(
//                            minutosNacionales,
//                            costoMinutoNacional,
//                            minutosInternacionales,
//                            costoMinutoInternacionales,
//                            nombres,
//                            apellidos,
//                            pasaporte,
//                            ciudad,
//                            barrio,
//                            marcaCelular,
//                            modeloCelular,
//                            numeroCelular);
//                    plan1.calcularPagoMensual();
//                    listaPlanes.add(plan1);
//                    break;
//                case 2:
//                    System.out.println("Ingrese las megas expresado en Gigas: ");
//                    megasGigas = entrada.nextDouble();
//                    System.out.println("Ingrese el costo por cada Giga: ");
//                    costoGigas = entrada.nextDouble();
//                    System.out.println("Ingrese la tarifa base: ");
//                    double tarifaBase = entrada.nextDouble();
//                    PlanPostPagoMegas plan2 = new PlanPostPagoMegas(
//                            megasGigas,
//                            costoGigas,
//                            tarifaBase,
//                            nombres,
//                            apellidos,
//                            pasaporte,
//                            ciudad,
//                            barrio,
//                            marcaCelular,
//                            modeloCelular,
//                            numeroCelular);
//                    plan2.calcularPagoMensual();
//                    listaPlanes.add(plan2);
//
//                    break;
//                case 3:
//                    System.out.println("Ingrese los minutos consumidos: ");
//                    minutos = entrada.nextDouble();
//                    System.out.println("Ingrese el costo del minuto: ");
//                    costoMinutos = entrada.nextDouble();
//                    System.out.println("Ingrese las megas expresado en Gigas: ");
//                    megasGigas = entrada.nextDouble();
//                    System.out.println("Ingrese el costo por cada Giga: ");
//                    costoGigas = entrada.nextDouble();
//                    PlanPostPagoMinutosMegas plan3 = new PlanPostPagoMinutosMegas(
//                            minutos,
//                            costoMinutos,
//                            megasGigas,
//                            costoGigas,
//                            nombres,
//                            apellidos,
//                            pasaporte,
//                            ciudad,
//                            barrio,
//                            marcaCelular,
//                            modeloCelular,
//                            numeroCelular);
//                    plan3.calcularPagoMensual();
//                    listaPlanes.add(plan3);
//
//                    break;
//                case 4:
//                    System.out.println("Ingrese los minutos consumidos: ");
//                    minutos = entrada.nextDouble();
//                    System.out.println("Ingrese el costo del minuto: ");
//                    costoMinutos = entrada.nextDouble();
//                    System.out.println("Ingrese las megas expresado en Gigas: ");
//                    megasGigas = entrada.nextDouble();
//                    System.out.println("Ingrese el costo por cada Giga: ");
//                    costoGigas = entrada.nextDouble();
//                    System.out.println("Ingrese el porcentaje de descuento: ");
//                    double porcentajeDescuento = entrada.nextDouble();
//                    entrada.nextLine();
//                    PlanPostPagoMinutosMegasEconomico plan4 = new PlanPostPagoMinutosMegasEconomico(
//                            minutos,
//                            costoMinutos,
//                            megasGigas,
//                            costoGigas,
//                            porcentajeDescuento,
//                            nombres,
//                            apellidos,
//                            pasaporte,
//                            ciudad,
//                            barrio,
//                            marcaCelular,
//                            modeloCelular,
//                            numeroCelular);
//                    plan4.calcularPagoMensual();
//                    listaPlanes.add(plan4);
//
//                    break;
//                default:
//                    System.out.println("La opcion ingresada es invalida.");
//                    entrada.nextLine();
//            }
//
//            System.out.println("Ingrese 'SALIR' si desea terminar el proceso:");
//            String evaluador = entrada.nextLine();
//
//            if (evaluador.equalsIgnoreCase("SALIR")) {
//                bandera = false;
//                for (PlanCelular listaPlane : listaPlanes) {
//                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//                    System.out.println(listaPlane);
//                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//                }
//            }
//
//        }
//
//    }
//
//}
//
//
//
//
//
//
//
//
//
//    protected String nombres;
//    protected String apellidos;
//    protected String pasaporte;
//    protected String ciudad;
//    protected String barrioPropietario;
//    protected String marcaCelular;
//    protected String modeloCelular;
//    protected int numeroCelular;
//    protected double pagoMensual;
//
//    public PlanCelular(String nombres, String apellidos, String pasaporte, 
//            String ciudad, String barrioPropietario, String marcaCelular, 
//            String modeloCelular, int numeroCelular) {
//        this.nombres = nombres;
//        this.apellidos = apellidos;
//        this.pasaporte = pasaporte;
//        this.ciudad = ciudad;
//        this.barrioPropietario = barrioPropietario;
//        this.marcaCelular = marcaCelular;
//        this.modeloCelular = modeloCelular;
//        this.numeroCelular = numeroCelular;
//    }
//    
//
//    public void establecerNombres(String nombres) {
//        this.nombres = nombres;
//    }
//
//    public void establecerApellidos(String apellidos) {
//        this.apellidos = apellidos;
//    }
//
//    public void establecerPasaporte(String pasaporte) {
//        this.pasaporte = pasaporte;
//    }
//
//    public void establecerCiudad(String ciudad) {
//        this.ciudad = ciudad;
//    }
//
//    public void establecerBarrioPropietario(String barrioPropietario) {
//        this.barrioPropietario = barrioPropietario;
//    }
//
//    public void establecerMarcaCelular(String marcaCelular) {
//        this.marcaCelular = marcaCelular;
//    }
//
//    public void establecerModeloCelular(String modeloCelular) {
//        this.modeloCelular = modeloCelular;
//    }
//
//    public void establecerNumeroCelular(int numeroCelular) {
//        this.numeroCelular = numeroCelular;
//    }
//
//    public abstract void calcularPagoMensual();
//
//    public String obtenerNombres() {
//        return nombres;
//    }
//
//    public String obtenerApellidos() {
//        return apellidos;
//    }
//
//    public String obtenerPasaporte() {
//        return pasaporte;
//    }
//
//    public String obtenerCiudad() {
//        return ciudad;
//    }
//
//    public String obtenerBarrioPropietario() {
//        return barrioPropietario;
//    }
//
//    public String obtenerMarcaCelular() {
//        return marcaCelular;
//    }
//
//    public String obtenerModeloCelular() {
//        return modeloCelular;
//    }
//
//    public int obtenerNumeroCelular() {
//        return numeroCelular;
//    }
//
//    public double obtenerPagoMensual() {
//        return pagoMensual;
//    }
//
//    @Override
//    public String toString() {
//        String cadena = "Informacion Propietario\n";
//        cadena = String.format(""
//                + "%s"
//                + "\tNombre Propietario: %s\n"
//                + "\tApellido Propietario: %s\n"
//                + "\tPasaporte Propietario: %s\n"
//                + "\tCiudad Propietario: %s\n"
//                + "\tBarrio Popietario: %s\n"
//                + "\tMarca Celular: %s\n"
//                + "\tModelo Celular: %s\n"
//                + "\tNumero Celular: %d\n", 
//                cadena,
//                nombres,
//                apellidos, 
//                pasaporte,
//                ciudad,
//                barrioPropietario,
//                marcaCelular,
//                modeloCelular,
//                numeroCelular);
//        return cadena;
//    }
//
//
//
//package paquete3;
//
//import paquete2.Datos;
//import paquete2.PlanCelular;
//
//public class PlanPostPagoMegas extends PlanCelular {
//
//    //megas expresado en gigas|costo por cada giga|tarifa base
//    private double megasGigas;
//    private double costoGigas;
//    private double tarifaBase;
//    private Datos datos;
//
//    public PlanPostPagoMegas(double mG, double cG,
//            double tB, String n, String a, String p, String c,
//            String b, String mar, String mod, int nmro) {
//        super(n, a, p, c, b,
//                mar, mod, nmro);
//        megasGigas = mG;
//        costoGigas = cG;
//        tarifaBase = tB;
//    }
//
//    public void establecerMegasGigas(double mG) {
//        megasGigas = mG;
//    }
//
//    public void establecerCostoGigas(double cG) {
//        costoGigas = cG;
//    }
//
//    public void establecerTarifaBase(double tB) {
//        tarifaBase = tB;
//    }
//
//    @Override
//    public void calcularPagoMensual() {
//        pagoMensual = (megasGigas * costoGigas) + tarifaBase;
//    }
//
//    public double obtenerMegasGigas() {
//        return megasGigas;
//    }
//
//    public double obtenerCostoGigas() {
//        return costoGigas;
//    }
//
//    public double obtenerTarifaBase() {
//        return tarifaBase;
//    }
//
//    @Override
//    public String toString() {
//        String cadena = "Plan Post Pago Megas.\n";
//        cadena = String.format(""
//                + "%s"
//                + "%s"
//                + "\tMegas expresado en Gigas: %.2f\n"
//                + "\tCosto por cada Giga: %.2f\n"
//                + "\tTarifa base: %.2f\n\n"
//                + "\tPago Mensual: %.2f\n",
//                cadena,
//                super.toString(),
//                megasGigas,
//                costoGigas,
//                tarifaBase,
//                obtenerPagoMensual());
//        return cadena;
//    }
//}
//
//
//
//
//package paquete3;
//
//import paquete2.PlanCelular;
//
//public class PlanPostPagoMinutos extends PlanCelular {
////    minutos nacionales|costo minuto nacional|minutos internacionales|costo minuto internacional
//
//    private double minutosNacionales;
//    private double costoMinutoNacional;
//    private double minutosInternacionales;
//    private double costoMinutoInternacionales;
//
//    public PlanPostPagoMinutos(double mN, double cN, double mI, double cI,
//            String n, String a, String p, String c, String b, String mar,
//            String mod, int nmro) {
//        super(n, a, p, c, b,
//                mar, mod, nmro);
//
//        minutosNacionales = mN;
//        costoMinutoNacional = cN;
//        minutosInternacionales = mI;
//        costoMinutoInternacionales = cI;
//    }
//
//    public void establecerMinutosNacionales(double mN) {
//        minutosNacionales = mN;
//    }
//
//    public void establecerCostoMinutoNacional(double cN) {
//        costoMinutoNacional = cN;
//    }
//
//    public void establecerMinutosInternacionales(double mI) {
//        minutosInternacionales = mI;
//    }
//
//    public void establecerCostoMinutoInternacionales(double cI) {
//        costoMinutoInternacionales = cI;
//    }
//
//    @Override
//    public void calcularPagoMensual() {
//        pagoMensual = (minutosNacionales * costoMinutoNacional)
//                + (minutosInternacionales * costoMinutoInternacionales);
//    }
//
//    public double obtenerMinutosNacionales() {
//        return minutosNacionales;
//    }
//
//    public double obtenerCostoMinutoNacional() {
//        return costoMinutoNacional;
//    }
//
//    public double obtenerMinutosInternacionales() {
//        return minutosInternacionales;
//    }
//
//    public double obtenerCostoMinutoInternacionales() {
//        return costoMinutoInternacionales;
//    }
//
//    @Override
//    public String toString() {
//        String cadena = "\nPlan Post Pago Minutos.\n\n";
//        cadena = String.format(""
//                + "%s"
//                + "%s"
//                + "\tMinutos Nacionales: %.2f\n"
//                + "\tCosto Minuto Nacional: %.2f\n"
//                + "\tMinutos Internacionales: %.2f\n"
//                + "\tCosto Minuto Internacional: %.2f\n\n"
//                + "\tPago Mensual: %.2f\n",
//                cadena,
//                super.toString(),
//                minutosNacionales,
//                costoMinutoNacional,
//                minutosInternacionales,
//                costoMinutoInternacionales,
//                obtenerPagoMensual());
//        return cadena;
//    }
//
//}
//
//
//
//package paquete3;
//
//import paquete2.PlanCelular;
//
//public class PlanPostPagoMinutosMegas extends PlanCelular {
////    minutos|costo minutos|megas expresado en gigas|costo por cada giga
//
//    private double minutos;
//    private double costoMinutos;
//    private double megasGigas;
//    private double costoGigas;
//
//    public PlanPostPagoMinutosMegas(double m, double cM, double mG, double cG,
//            String n, String a, String p, String c,
//            String b, String mar, String mod, int nmro) {
//        super(n, a, p, c, b, mar, mod, nmro);
//
//        minutos = m;
//        costoMinutos = cM;
//        megasGigas = mG;
//        costoGigas = cG;
//    }
//
//    public void establecerMinutos(double m) {
//        minutos = m;
//    }
//
//    public void establecerCostoMinutos(double cM) {
//        costoMinutos = cM;
//    }
//
//    public void establecerMegasGigas(double mG) {
//        megasGigas = mG;
//    }
//
//    public void establecerCostoGigas(double cG) {
//        costoGigas = cG;
//    }
//
//    @Override
//    public void calcularPagoMensual() {
//        pagoMensual = (minutos * costoMinutos) + (megasGigas * costoGigas);
//    }
//
//    public double obtenerMinutos() {
//        return minutos;
//    }
//
//    public double obtenerCostoMinutos() {
//        return costoMinutos;
//    }
//
//    public double obtenerMegasGigas() {
//        return megasGigas;
//    }
//
//    public double obtenerCostoGigas() {
//        return costoGigas;
//    }
//
//    @Override
//    public String toString() {
//        String cadena = "Plan Post Pago Minutos Megas.\n";
//        cadena = String.format(""
//                + "%s"
//                + "%s"
//                + "\tMinutos : %.2f\n"
//                + "\tCosto Minutos: %.2f\n"
//                + "\tMegas Expresado en Gigas: %.2f\n"
//                + "\tCosto por cada Giga: %.2f\n\n"
//                + "\tPago Mensual: %.2f\n",
//                cadena,
//                super.toString(),
//                minutos,
//                costoMinutos,
//                megasGigas,
//                costoGigas,
//                obtenerPagoMensual());
//        return cadena;
//    }
//
//}
//
//
//
//package paquete3;
//
//import paquete2.PlanCelular;
//
//public class PlanPostPagoMinutosMegasEconomico extends PlanCelular {
////    minutos|costo minutos|megas expresado en gigas|costo por cada gigas|porcentaje de descuento (Ejemplo: 10%)
//
//    private double minutos;
//    private double costoMinutos;
//    private double megasGigas;
//    private double costoGigas;
//    private double porcentajeDescuento;
//
//
//    public PlanPostPagoMinutosMegasEconomico(double m, double cM, double mG,
//            double cG, double pD, String n, String a, String p, String c,
//            String b, String mar, String mod, int nmro) {
//        super(n, a, p, c, b,
//                mar, mod, nmro);
//        minutos = m;
//        costoMinutos = cM;
//        megasGigas = cG;
//        costoGigas = cG;
//        porcentajeDescuento = pD;
//    }
//
//    public void establecerMinutos(double m) {
//        minutos = m;
//    }
//
//    public void establecerCostoMinutos(double cM) {
//        costoMinutos = cM;
//    }
//
//    public void establecerMegasGigas(double mG) {
//        megasGigas = mG;
//    }
//
//    public void establecerCostoGigas(double cG) {
//        costoGigas = cG;
//    }
//
//    public void establecerPorcentajeDescuento(double pD) {
//        porcentajeDescuento = pD;
//    }
//
//    @Override
//    public void calcularPagoMensual() {
//        double op = (minutos * costoMinutos) + (megasGigas * costoGigas);
//        pagoMensual = op - ((op * porcentajeDescuento) / 100);
//    }
//
//    public double obtenerMinutos() {
//        return minutos;
//    }
//
//    public double obtenerCostoMinutos() {
//        return costoMinutos;
//    }
//
//    public double obtenerMegasGigas() {
//        return megasGigas;
//    }
//
//    public double obtenerCostoGigas() {
//        return costoGigas;
//    }
//
//    public double obtenerPorcentajeDescuento() {
//        return porcentajeDescuento;
//    }
//
//    public String tosString() {
//        String cadena = "Plan Post Pago Minutos Megas Economico.\n";
//        cadena = String.format(""
//                + "%s"
//                + "%s"
//                + "\tMinutos: %.2f\n"
//                + "\tCosto Minutos: %.2f\n"
//                + "\tMegas expresado en Gigas: %.2f\n"
//                + "\tCosto por cada Giga: %.2f\n"
//                + "\tPorcntaje Descuento: %.0f\n\n"
//                + "\tPago Mensual: %.2f\n",
//                cadena,
//                super.toString(),
//                minutos,
//                costoMinutos,
//                megasGigas,
//                costoGigas,
//                porcentajeDescuento,
//                obtenerPagoMensual());
//        return cadena;
//    }
//
//}
