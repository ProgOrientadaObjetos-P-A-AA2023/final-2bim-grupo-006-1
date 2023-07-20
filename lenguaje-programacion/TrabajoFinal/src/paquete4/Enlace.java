package paquete4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import paquete2.Datos;

public class Enlace {

    private Connection conn;
    private ArrayList<Datos> listaDatos;

    public void establecerConexion() {

        try {
            String url = "jdbc:sqlite:bd/planes.db";  // create a connection to the database  
            conn = DriverManager.getConnection(url);
// System.out.println("Directorio actual: " + System.getProperty("user.dir"));
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    public void insertarDatos(Datos datos) {

        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format(""
                    + "INSERT INTO Datos ("
                    + "nombres, "
                    + "apellidos, "
                    + "pasaporte, "
                    + "ciudad, "
                    + "barrioPropietario, "
                    + "marcaCelular, "
                    + "modeloCelular, "
                    + "numeroCelular) values ('%s', '%s', '%s', '%s', '%s', '%s', '%s', '%d')",
                    datos.obtenerNombres(),
                    datos.obtenerApellidos(),
                    datos.obtenerPasaporte(),
                    datos.obtenerCiudad(),
                    datos.obtenerBarrioPropietario(),
                    datos.obtenerMarcaCelular(),
                    datos.obtenerModeloCelular(),
                    datos.obtenerNumeroCelular());
//            System.out.println(data);
            statement.executeUpdate(data);
            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception:");
            System.out.println(e.getMessage());
        }
    }

    public void establecerListaDatos() {
        listaDatos = new ArrayList<>();
        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = "Select * from Datos;";

            ResultSet rs = statement.executeQuery(data);
            while (rs.next()) {
                Datos datos = new Datos(
                        rs.getString("nombres"),
                        rs.getString("apellidos"),
                        rs.getString("pasaporte"),
                        rs.getString("ciudad"),
                        rs.getString("barrioPropietario"),
                        rs.getString("marcaCelular"),
                        rs.getString("modeloCelular"),
                        rs.getInt("numeroCelular"));
                listaDatos.add(datos);
            }

            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception: insertarListaDatos");
            System.out.println(e.getMessage());

        }

    }

    public Connection obtenerConexion() {
        return conn;
    }

    public ArrayList<Datos> obtenerListaDatos() {
        return listaDatos;
    }
}
