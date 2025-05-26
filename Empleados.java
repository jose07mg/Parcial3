public class Empleados {
    public Empleado[] lista;
    private int contador;

    public Empleados(int capacidad) {
        lista = new Empleado[capacidad];
        contador = 0;
    }

    public void darDeAlta(String nombre, String cargo, double salario) {
        if (contador < lista.length) {
            lista[contador] = new Empleado(nombre, cargo, salario);
            contador++;
        } else {
            System.out.println(Textos.LIMITE_EMPLEADOS);
        }
    }

    public void aumentarSalario(double porcentaje) {
        for (Empleado empleado : lista) {
            double nuevoSalario = empleado.getSalario() * (1 + porcentaje / 100);
            empleado.setSalario(nuevoSalario);
        }
    }

    public void mostrarEmpleados() {
        for (Empleado empleado : lista) {
            System.out.println(empleado);
        }
    }
}
