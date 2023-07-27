package paquete4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import paquete3.*;

public class Enlace {

    private Connection conn;
    private ArrayList<PlanPostPagoMinutos> listaPlan1;
    private ArrayList<PlanPostPagoMegas> listaPlan2;
    private ArrayList<PlanPostPagoMinutosMegas> listaPlan3;
    private ArrayList<PlanPostPagoMinutosMegasEconomico> listaPlan4;

    //--------------------------------------------------------------------------
    public void establecerConexion() {

        try {
            String url = "jdbc:sqlite:bd/planes.db";  // create a connection to the database  
            conn = DriverManager.getConnection(url);
            // System.out.println("Directorio actual: " + System.getProperty("user.dir"));
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    public Connection obtenerConexion() {
        return conn;
    }
    //--------------------------------------------------------------------------

    public void insertarPlan1(PlanPostPagoMinutos plan1) {
        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format(""
                    + "INSERT INTO PlanPostPagoMinutos "
                    + "(nombres, "
                    + "apellidos, "
                    + "pasaporte, "
                    + "ciudad, "
                    + "barrioPropietario, "
                    + "marcaCelular, "
                    + "modeloCelular, "
                    + "numeroCelular, "
                    + "minutosNacionales, "
                    + "costoMinutosNacionales, "
                    + "minutosInternacionales, "
                    + "costoMinutosInternacionales, "
                    + "pagoMensual) "
                    + "VALUES ('%s', '%s', '%s', '%s', '%s', '%s', '%s', %d, "
                    + "%.2f, %.2f, %.2f, %.2f, %.2f)",
                    plan1.obtenerNombres(),
                    plan1.obtenerApellidos(),
                    plan1.obtenerPasaporte(),
                    plan1.obtenerCiudad(),
                    plan1.obtenerBarrioPropietario(),
                    plan1.obtenerMarcaCelular(),
                    plan1.obtenerModeloCelular(),
                    plan1.obtenerNumeroCelular(),
                    plan1.obtenerMinutosNacionales(),
                    plan1.obtenerCostoMinutoNacional(),
                    plan1.obtenerMinutosInternacionales(),
                    plan1.obtenerCostoMinutoInternacionales(),
                    plan1.obtenerPagoMensual()
            );
            System.out.println(data);
            statement.executeUpdate(data);
            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception3:");
            System.out.println(e.getMessage());
        }
    }

    public void insertarPlan2(PlanPostPagoMegas plan2) {
        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format(""
                    + "INSERT INTO PlanPostPagoMegas "
                    + "(nombres, "
                    + "apellidos, "
                    + "pasaporte, "
                    + "ciudad, "
                    + "barrioPropietario, "
                    + "marcaCelular, "
                    + "modeloCelular, "
                    + "numeroCelular, "
                    + "megasGigas, "
                    + "costoGigas, "
                    + "tarifaBase, "
                    + "pagoMensual) "
                    + "VALUES ('%s', '%s', '%s', '%s', '%s', '%s', '%s', %d, "
                    + "%.2f, %.2f, %.2f, %.2f)",
                    plan2.obtenerNombres(),
                    plan2.obtenerApellidos(),
                    plan2.obtenerPasaporte(),
                    plan2.obtenerCiudad(),
                    plan2.obtenerBarrioPropietario(),
                    plan2.obtenerMarcaCelular(),
                    plan2.obtenerModeloCelular(),
                    plan2.obtenerNumeroCelular(),
                    plan2.obtenerMegasGigas(),
                    plan2.obtenerCostoGigas(),
                    plan2.obtenerTarifaBase(),
                    plan2.obtenerPagoMensual()
            );
            System.out.println(data);
            statement.executeUpdate(data);
            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception2:");
            System.out.println(e.getMessage());
        }
    }

    public void insertarPlan3(PlanPostPagoMinutosMegas plan3) {
        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format(""
                    + "INSERT INTO PlanPostPagoMinutosMegas "
                    + "(nombres, "
                    + "apellidos, "
                    + "pasaporte, "
                    + "ciudad, "
                    + "barrioPropietario, "
                    + "marcaCelular, "
                    + "modeloCelular, "
                    + "numeroCelular, "
                    + "minutos, "
                    + "costoMinutos, "
                    + "megasGigas, "
                    + "costoGigas, "
                    + "pagoMensual) "
                    + "VALUES ('%s', '%s', '%s', '%s', '%s', '%s', '%s', %d, "
                    + "%.2f, %.2f, %.2f, %.2f, %.2f)",
                    plan3.obtenerNombres(),
                    plan3.obtenerApellidos(),
                    plan3.obtenerPasaporte(),
                    plan3.obtenerCiudad(),
                    plan3.obtenerBarrioPropietario(),
                    plan3.obtenerMarcaCelular(),
                    plan3.obtenerModeloCelular(),
                    plan3.obtenerNumeroCelular(),
                    plan3.obtenerMinutos(),
                    plan3.obtenerCostoMinutos(),
                    plan3.obtenerMegasGigas(),
                    plan3.obtenerCostoGigas(),
                    plan3.obtenerPagoMensual()
            );
            System.out.println(data);
            statement.executeUpdate(data);
            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception3:");
            System.out.println(e.getMessage());
        }
    }

    public void insertarPlan4(PlanPostPagoMinutosMegasEconomico plan4) {
        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format(""
                    + "INSERT INTO PlanPostPagoMinutosMegasEconomico "
                    + "(nombres, "
                    + "apellidos, "
                    + "pasaporte, "
                    + "ciudad, "
                    + "barrioPropietario, "
                    + "marcaCelular, "
                    + "modeloCelular, "
                    + "numeroCelular, "
                    + "minutos, "
                    + "costoMinutos, "
                    + "megasGigas, "
                    + "costoGigas, "
                    + "porcentajeDescuento, "
                    + "pagoMensual) "
                    + "VALUES ('%s', '%s', '%s', '%s', '%s', '%s', '%s', %d, "
                    + "%.2f, %.2f, %.2f, %.2f, %.2f, %.2f)",
                    plan4.obtenerNombres(),
                    plan4.obtenerApellidos(),
                    plan4.obtenerPasaporte(),
                    plan4.obtenerCiudad(),
                    plan4.obtenerBarrioPropietario(),
                    plan4.obtenerMarcaCelular(),
                    plan4.obtenerModeloCelular(),
                    plan4.obtenerNumeroCelular(),
                    plan4.obtenerMinutos(),
                    plan4.obtenerCostoMinutos(),
                    plan4.obtenerMegasGigas(),
                    plan4.obtenerCostoGigas(),
                    plan4.obtenerPorcentajeDescuento(),
                    plan4.obtenerPagoMensual()
            );
            System.out.println(data);
            statement.executeUpdate(data);
            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception4:");
            System.out.println(e.getMessage());
        }
    }

    public void establecerListaPlan1() {
        listaPlan1 = new ArrayList<>();
        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = "SELECT * FROM PlanPostPagoMinutos";

            ResultSet rs = statement.executeQuery(data);

            while (rs.next()) {
                PlanPostPagoMinutos plan1 = new PlanPostPagoMinutos(
                        rs.getDouble("minutosNacionales"),
                        rs.getDouble("costoMinutosNacionales"),
                        rs.getDouble("minutosInternacionales"),
                        rs.getDouble("costoMinutosInternacionales"),
                        rs.getString("nombres"),
                        rs.getString("apellidos"),
                        rs.getString("pasaporte"),
                        rs.getString("ciudad"),
                        rs.getString("barrioPropietario"),
                        rs.getString("marcaCelular"),
                        rs.getString("modeloCelular"),
                        rs.getInt("numeroCelular")
                );
                plan1.calcularPagoMensual();
                listaPlan1.add(plan1);
            }
            obtenerConexion().close();

        } catch (SQLException e) {
            System.out.println("Exception: establecerListaPlan1");
            System.out.println(e.getMessage());
        }
    }

    public void establecerListaPlan2() {
        listaPlan2 = new ArrayList<>();
        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = "SELECT * FROM PlanPostPagoMegas";
            ResultSet rs = statement.executeQuery(data);

            while (rs.next()) {
                PlanPostPagoMegas plan2 = new PlanPostPagoMegas(
                        rs.getDouble("megasGigas"),
                        rs.getDouble("costoGigas"),
                        rs.getDouble("tarifaBase"),
                        rs.getString("nombres"),
                        rs.getString("apellidos"),
                        rs.getString("pasaporte"),
                        rs.getString("ciudad"),
                        rs.getString("barrioPropietario"),
                        rs.getString("marcaCelular"),
                        rs.getString("modeloCelular"),
                        rs.getInt("numeroCelular")
                );
                plan2.calcularPagoMensual();
                listaPlan2.add(plan2);
            }
            obtenerConexion().close();

        } catch (SQLException e) {
            System.out.println("Exception: establecerListaPlan2");
            System.out.println(e.getMessage());
        }
    }

    public void establecerListaPlan3() {
        listaPlan3 = new ArrayList<>();
        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = "SELECT * FROM PlanPostPagoMinutosMegas";
            ResultSet rs = statement.executeQuery(data);

            while (rs.next()) {
                PlanPostPagoMinutosMegas plan3 = new PlanPostPagoMinutosMegas(
                        rs.getDouble("minutos"),
                        rs.getDouble("costoMinutos"),
                        rs.getDouble("megasGigas"),
                        rs.getDouble("costoGigas"),
                        rs.getString("nombres"),
                        rs.getString("apellidos"),
                        rs.getString("pasaporte"),
                        rs.getString("ciudad"),
                        rs.getString("barrioPropietario"),
                        rs.getString("marcaCelular"),
                        rs.getString("modeloCelular"),
                        rs.getInt("numeroCelular")
                );
                plan3.calcularPagoMensual();
                listaPlan3.add(plan3);
            }
            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception: establecerListaPlan3");
            System.out.println(e.getMessage());
        }
    }

    public void establecerListaPlan4() {
        listaPlan4 = new ArrayList<>();
        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = "SELECT * FROM PlanPostPagoMinutosMegasEconomico";
            ResultSet rs = statement.executeQuery(data);

            while (rs.next()) {
                PlanPostPagoMinutosMegasEconomico plan4 = new PlanPostPagoMinutosMegasEconomico(
                        rs.getDouble("minutos"),
                        rs.getDouble("costoMinutos"),
                        rs.getDouble("megasGigas"),
                        rs.getDouble("costoGigas"),
                        rs.getDouble("porcentajeDescuento"),
                        rs.getString("nombres"),
                        rs.getString("apellidos"),
                        rs.getString("pasaporte"),
                        rs.getString("ciudad"),
                        rs.getString("barrioPropietario"),
                        rs.getString("marcaCelular"),
                        rs.getString("modeloCelular"),
                        rs.getInt("numeroCelular")
                );
                plan4.calcularPagoMensual();
                listaPlan4.add(plan4);
            }
            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception: establecerListaPlan4");
            System.out.println(e.getMessage());
        }
    }

    public ArrayList<PlanPostPagoMinutos> obtenerListaPlan1() {
        return listaPlan1;
    }

    public ArrayList<PlanPostPagoMegas> obtenerListaPlan2() {
        return listaPlan2;
    }

    public ArrayList<PlanPostPagoMinutosMegas> obtenerListaPlan3() {
        return listaPlan3;
    }

    public ArrayList<PlanPostPagoMinutosMegasEconomico> obtenerListaPlan4() {
        return listaPlan4;
    }

}
