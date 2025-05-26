/**
 * Representa un empleado con nombre, cargo y salario.
 */
public class Empleado {

    /** Nombre del empleado */
    private String nombre;

    /** Cargo o puesto del empleado */
    private String cargo;

    /** Salario actual del empleado */
    private double salario;

    /**
     * Crea un nuevo objeto Empleado.
     * @param nombre Nombre del empleado
     * @param cargo Cargo del empleado
     * @param salario Salario inicial del empleado
     */
    public Empleado(String nombre, String cargo, double salario) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
    }

    /**
     * Devuelve el nombre del empleado.
     * @return nombre del empleado
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Devuelve el cargo del empleado.
     * @return cargo del empleado
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * Devuelve el salario del empleado.
     * @return salario del empleado
     */
    public double getSalario() {
        return salario;
    }

    /**
     * Establece el nombre del empleado.
     * @param nombre Nuevo nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Establece el cargo del empleado.
     * @param cargo Nuevo cargo
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * Establece el salario del empleado.
     * @param salario Nuevo salario
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * Devuelve una representación en texto del empleado.
     * @return cadena con nombre, cargo y salario
     */
    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", cargo='" + cargo + '\'' +
                ", salario=" + salario +
                '}';
    }
}
