import java.util.Scanner;

/**
 * Clase principal que ejecuta la gestión de empleados.
 */
public class SistemaGestionEmpleados {

    /**
     * Método principal que ejecuta la aplicación.
     * @param args Argumentos de línea de comandos
     */
    public static void main(String[] args) {
        Empleados empleados = new Empleados(3);

        empleados.darDeAlta("Juan", "Desarrollador", 50000);
        empleados.darDeAlta("María", "Diseñadora", 45000);
        empleados.darDeAlta("Pedro", "Gerente", 60000);

        Scanner scanner = new Scanner(System.in);
        System.out.print(Textos.INTRODUCIR_PORCENTAJE);
        double porcentaje = scanner.nextDouble();

        empleados.aumentarSalario(porcentaje);

        System.out.println(Textos.LISTA_EMPLEADOS);
        empleados.mostrarEmpleados();

        scanner.close();
    }
}
