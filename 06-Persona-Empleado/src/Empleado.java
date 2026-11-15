public class Empleado extends Persona {
    private double salario;

    public Empleado(String nombre, int edad, double salario) {
        super(nombre, edad);
        setSalario(salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (!Double.isFinite(salario) || salario < 0) {
            throw new IllegalArgumentException("Valor inválido para salario");
        }
        this.salario = salario;
    }

    public void mostrarDatos() {
        System.out.println(getNombre() + " | Edad: " + getEdad() + " | Salario: " + salario);
    }
}
