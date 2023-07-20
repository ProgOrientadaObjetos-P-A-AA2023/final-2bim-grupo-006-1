package paquete1;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import paquete2.Datos;
import paquete2.PlanCelular;
import paquete3.PlanPostPagoMinutos;
import paquete3.PlanPostPagoMegas;
import paquete3.PlanPostPagoMinutosMegas;
import paquete3.PlanPostPagoMinutosMegasEconomico;
import paquete4.Enlace;

public class Inicio {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        ArrayList<PlanCelular> listaPlanes = new ArrayList<>();
        Enlace c = new Enlace();
        Datos datos = null;
        boolean bandera = true;
        int opcion;

        String nombres;
        String apellidos;
        String pasaporte;
        String ciudad;
        String barrio;
        String marcaCelular;
        String modeloCelular;
        int numeroCelular;

        double megasGigas;
        double costoGigas;
        double minutos;
        double costoMinutos;

        while (bandera) {
            System.out.println("Ingrese la opcion:\n"
                    + "\t1) Plan Post Pago Minutos\n"
                    + "\t2) Plan Post Pago Megas\n"
                    + "\t3) Plan Post Pago Minutos Megas\n"
                    + "\t4) Plan Post Pago Minutos Megas Economico\n");
            opcion = entrada.nextInt();

            if (opcion == 1 || opcion == 2 || opcion == 3 || opcion == 4) {
                entrada.nextLine();
                System.out.println("Ingrese los Nombres del Propietario: ");
                nombres = entrada.nextLine();
                System.out.println("Ingrese los Apellidos del Propietario: ");
                apellidos = entrada.nextLine();
                System.out.println("Ingrese el Pasaporte del Propietario: ");
                pasaporte = entrada.nextLine();
                System.out.println("Ingrese la Ciudad del Propietario: ");
                ciudad = entrada.nextLine();
                System.out.println("Ingrese el Barrio del Propietario: ");
                barrio = entrada.nextLine();
                System.out.println("Ingrese la marca del Celular: ");
                marcaCelular = entrada.nextLine();
                System.out.println("Ingrese el modelo del Celular: ");
                modeloCelular = entrada.nextLine();
                System.out.println("Ingrese el numero de telefono: ");
                numeroCelular = entrada.nextInt();
                entrada.nextLine();

                datos = new Datos(
                        nombres,
                        apellidos,
                        pasaporte,
                        ciudad,
                        barrio,
                        marcaCelular,
                        modeloCelular,
                        numeroCelular);
                c.establecerListaDatos();
                c.insertarDatos(datos);
            }

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese los Minutos Nacionales: ");
                    double minutosNacionales = entrada.nextDouble();
                    System.out.println("Ingrese el costo de Minutos Nacionales: ");
                    double costoMinutoNacional = entrada.nextDouble();
                    System.out.println("Ingrese los Minutos Internacionales: ");
                    double minutosInternacionales = entrada.nextDouble();
                    System.out.println("Ingrese el costo de Minutos Internacionales: ");
                    double costoMinutoInternacionales = entrada.nextDouble();
                    entrada.nextLine();
                    PlanPostPagoMinutos plan1 = new PlanPostPagoMinutos(
                            minutosNacionales,
                            costoMinutoNacional,
                            minutosInternacionales,
                            costoMinutoInternacionales,
                            datos);
                    plan1.calcularPagoMensual();
                    listaPlanes.add(plan1);
                    break;
                case 2:
                    System.out.println("Ingrese las megas expresado en Gigas: ");
                    megasGigas = entrada.nextDouble();
                    System.out.println("Ingrese el costo por cada Giga: ");
                    costoGigas = entrada.nextDouble();
                    System.out.println("Ingrese la tarifa base: ");
                    double tarifaBase = entrada.nextDouble();
                    PlanPostPagoMegas plan2 = new PlanPostPagoMegas(
                            megasGigas,
                            costoGigas,
                            tarifaBase,
                            datos);
                    plan2.calcularPagoMensual();
                    listaPlanes.add(plan2);

                    break;
                case 3:
                    System.out.println("Ingrese los minutos consumidos: ");
                    minutos = entrada.nextDouble();
                    System.out.println("Ingrese el costo del minuto: ");
                    costoMinutos = entrada.nextDouble();
                    System.out.println("Ingrese las megas expresado en Gigas: ");
                    megasGigas = entrada.nextDouble();
                    System.out.println("Ingrese el costo por cada Giga: ");
                    costoGigas = entrada.nextDouble();
                    PlanPostPagoMinutosMegas plan3 = new PlanPostPagoMinutosMegas(
                            minutos,
                            costoMinutos,
                            megasGigas,
                            costoGigas,
                            datos);
                    plan3.calcularPagoMensual();
                    listaPlanes.add(plan3);

                    break;
                case 4:
                    System.out.println("Ingrese los minutos consumidos: ");
                    minutos = entrada.nextDouble();
                    System.out.println("Ingrese el costo del minuto: ");
                    costoMinutos = entrada.nextDouble();
                    System.out.println("Ingrese las megas expresado en Gigas: ");
                    megasGigas = entrada.nextDouble();
                    System.out.println("Ingrese el costo por cada Giga: ");
                    costoGigas = entrada.nextDouble();
                    System.out.println("Ingrese el porcentaje de descuento: ");
                    double porcentajeDescuento = entrada.nextDouble();
                    entrada.nextLine();
                    PlanPostPagoMinutosMegasEconomico plan4 = new PlanPostPagoMinutosMegasEconomico(
                            minutos,
                            costoMinutos,
                            megasGigas,
                            costoGigas,
                            porcentajeDescuento,
                            datos);
                    plan4.calcularPagoMensual();
                    listaPlanes.add(plan4);

                    break;
                default:
                    System.out.println("La opcion ingresada es invalida.");
                    entrada.nextLine();
            }

            System.out.println("Ingrese 'SALIR' si desea terminar el proceso:");
            String evaluador = entrada.nextLine();

            if (evaluador.equalsIgnoreCase("SALIR")) {
                bandera = false;

                for (int i = 0; i < c.obtenerListaDatos().size(); i++) {
                    System.out.printf("%s", c.obtenerListaDatos().get(i));
                }
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                for (PlanCelular lista : listaPlanes) {
                    System.out.println(lista);
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                }
            }

        }

    }

}
