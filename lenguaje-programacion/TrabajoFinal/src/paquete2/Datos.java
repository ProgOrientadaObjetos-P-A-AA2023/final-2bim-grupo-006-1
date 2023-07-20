package paquete2;

public class Datos {
//nombre y apellidos propietario tipo (tipo cadena)
//pasaporte propietario (tipo cadena)
//ciudad propietario (tipo cadena)
//barrio del propietario
//marca de celular
//modelo del celular
//numero celular
//pago mensual

    private String nombres;
    private String apellidos;
    private String pasaporte;
    private String ciudad;
    private String barrioPropietario;
    private String marcaCelular;
    private String modeloCelular;
    private int numeroCelular;

    public Datos(String n, String a, String p,
            String c, String bP, String mC,
            String moC, int nC) {
        nombres = n;
        apellidos = a;
        pasaporte = p;
        ciudad = c;
        barrioPropietario = bP;
        marcaCelular = mC;
        modeloCelular = moC;
        numeroCelular = nC;
    }

    public void establecerNombres(String n) {
        nombres = n;
    }

    public void establecerApellidos(String a) {
        apellidos = a;
    }

    public void establecerPasaporte(String p) {
        pasaporte = p;
    }

    public void establecerCiudad(String c) {
        ciudad = c;
    }

    public void establecerBarrioPropietario(String bP) {
        barrioPropietario = bP;
    }

    public void establecerMarcaCelular(String mC) {
        marcaCelular = mC;
    }

    public void establecerModeloCelular(String moC) {
        modeloCelular = moC;
    }

    public void establecerNumeroCelular(int nC) {
        numeroCelular = nC;
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
        String cadena = "Informacion Propietario\n";
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
