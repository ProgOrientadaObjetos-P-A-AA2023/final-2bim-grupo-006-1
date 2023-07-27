package paquete2;

public abstract class PlanCelular {

    protected double pagoMensual;
    protected String nombres;
    protected String apellidos;
    protected String pasaporte;
    protected String ciudad;
    protected String barrioPropietario;
    protected String marcaCelular;
    protected String modeloCelular;
    protected int numeroCelular;

    public PlanCelular(String nom, String ape, String pas, String ciu, String barrio, String marca, String modelo, int num) {
        nombres = nom;
        apellidos = ape;
        pasaporte = pas;
        ciudad = ciu;
        barrioPropietario = barrio;
        marcaCelular = marca;
        modeloCelular = modelo;
        numeroCelular = num;
    }

    public abstract void calcularPagoMensual();

    public void establecerNombres(String nom) {
        nombres = nom;
    }

    public void establecerApellidos(String ape) {
        apellidos = ape;
    }

    public void establecerPasaporte(String pas) {
        pasaporte = pas;
    }

    public void establecerCiudad(String ciu) {
        ciudad = ciu;
    }

    public void establecerBarrioPropietario(String barrio) {
        barrioPropietario = barrio;
    }

    public void establecerMarcaCelular(String marca) {
        marcaCelular = marca;
    }

    public void establecerModeloCelular(String modelo) {
        modeloCelular = modelo;
    }

    public void establecerNumeroCelular(int num) {
        numeroCelular = num;
    }

    public double obtenerPagoMensual() {
        return pagoMensual;
    }

    public String obtenerNombres() {
        return nombres;
    }

    public String obtenerApellidos() {
        return apellidos;
    }

    public String obtenerPasaporte() {
        return pasaporte;
    }

    public String obtenerCiudad() {
        return ciudad;
    }

    public String obtenerBarrioPropietario() {
        return barrioPropietario;
    }

    public String obtenerMarcaCelular() {
        return marcaCelular;
    }

    public String obtenerModeloCelular() {
        return modeloCelular;
    }

    public int obtenerNumeroCelular() {
        return numeroCelular;
    }

    @Override
    public String toString() {
        String cadena = "Informacion Plan\n";
        cadena = String.format(""
                + "%s"
                + "\tNombre Propietario: %s\n"
                + "\tApellido Propietario: %s\n"
                + "\tPasaporte Propietario: %s\n"
                + "\tCiudad Propietario: %s\n"
                + "\tBarrio Popietario: %s\n"
                + "\tMarca Celular: %s\n"
                + "\tModelo Celular: %s\n"
                + "\tNumero Celular: %d\n",
                cadena,
                nombres,
                apellidos,
                pasaporte,
                ciudad,
                barrioPropietario,
                marcaCelular,
                modeloCelular,
                numeroCelular);
        return cadena;
    }

}
