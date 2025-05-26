/**
 * Clase que gestiona un listado de empleados.
 */
public class Empleados {

    /** Array que almacena la lista de empleados */
    public Empleado[] lista;

    /** Número actual de empleados añadidos */
    private int contador;

    /**
     * Constructor que inicializa la lista de empleados.
     * @param capacidad Número máximo de empleados
     */
    public Empleados(int capacidad) {
        lista = new Empleado[capacidad];
        contador = 0;
    }

    /**
     * Da de alta un nuevo empleado en la lista.
     * @param nombre Nombre del empleado
     * @param cargo Cargo del empleado
     * @param salario Salario inicial
     */
    public void darDeAlta(String nombre, String cargo, double salario) {
        if (contador < lista.length) {
            lista[contador] = new Empleado(nombre, cargo, salario);
            contador++;
        } else {
            System.out.println(Textos.LIMITE_EMPLEADOS);
        }
    }

    /**
     * Aumenta el salario de todos los empleados en un porcentaje dado.
     * @param porcentaje Porcentaje de aumento
     */
    public void aumentarSalario(double porcentaje) {
        for (Empleado empleado : lista) {
            double nuevoSalario = empleado.getSalario() * (1 + porcentaje / 100);
            empleado.setSalario(nuevoSalario);
        }
    }

    /**
     * Muestra por pantalla la lista de todos los empleados.
     */
    public void mostrarEmpleados() {
        for (Empleado empleado : lista) {
            System.out.println(empleado);
        }
    }
}
