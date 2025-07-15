// Coche.java
public class Coche extends Vehiculo { // 'extends' indica herencia
    // Atributo específico de Coche
    private int numeroPuertas;

    // Constructor de la clase Coche
    // Usa 'super()' para llamar al constructor de la clase padre (Vehiculo)
    public Coche(String marca, String modelo, int anio, int numeroPuertas) {
        super(marca, modelo, anio); // Llama al constructor de Vehiculo
        this.numeroPuertas = numeroPuertas;
        System.out.println("Se ha creado un Coche (Constructor de Coche).");
    }

    // Sobrescritura de método (opcional, pero buena práctica si quieres modificar el comportamiento)
    // Aunque en este caso vamos a crear uno nuevo para mostrar más detalles
    @Override // Indica que estamos sobrescribiendo un método de la clase padre
    public void mostrarInformacion() {
        super.mostrarInformacion(); // Llama al método de la clase padre para reusar su lógica
        System.out.println("Número de puertas: " + numeroPuertas);
        System.out.println("Tipo de Vehículo: Coche");
    }

    // Método específico de Coche
    public void abrirMaletero() {
        System.out.println("El maletero del " + modelo + " se ha abierto.");
    }
}