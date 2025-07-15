// Concesionario.java
public class Concesionario {
    public static void main(String[] args) {
        System.out.println("--- DEMOSTRACIÓN DE POO CON VEHÍCULOS ---");

        // 1. Instanciación de objetos y uso de constructores
        System.out.println("\n--- Creando un Vehículo genérico ---");
        // Se llama al constructor de Vehiculo
        Vehiculo miCamioneta = new Vehiculo("Ford", "Ranger", 2022);
        // Uso de un método del objeto Vehiculo
        miCamioneta.mostrarInformacion();
        miCamioneta.encender();

        System.out.println("\n--- Creando un Coche (hereda de Vehículo) ---");
        // Se llama al constructor de Coche, que a su vez llama al de Vehiculo
        Coche miCoche = new Coche("Toyota", "Corolla", 2024, 4);
        // Uso de un método sobrescrito por Coche
        miCoche.mostrarInformacion();
        // Uso de un método específico de Coche
        miCoche.abrirMaletero();
        // Uso de un método heredado de Vehiculo
        miCoche.encender();

        System.out.println("\n--- Otro Coche ---");
        Coche otroCoche = new Coche("Honda", "Civic", 2023, 2);
        otroCoche.mostrarInformacion();

        System.out.println("\n--- Fin de la demostración ---");
    }
}