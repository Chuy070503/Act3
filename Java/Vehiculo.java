// Vehiculo.java
public class Vehiculo {
    // Atributos (propiedades) de la clase
    protected String marca; // protected para permitir acceso a clases hijas
    protected String modelo;
    protected int anio;

    // Constructor de la clase Vehiculo
    public Vehiculo(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        System.out.println("Se ha creado un Vehículo (Constructor de Vehiculo).");
    }

    // Método para mostrar la información del vehículo
    public void mostrarInformacion() {
        System.out.println("--- Información del Vehículo ---");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + anio);
    }

    // Método adicional (ejemplo)
    public void encender() {
        System.out.println(modelo + " de la marca " + marca + " está encendido.");
    }
}