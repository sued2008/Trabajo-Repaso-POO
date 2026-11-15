package herencia;

public class Main {
    public static void main(String[] args) {
        System.out.println("1. Persona y Empleado");
        Empleado empleado = new Empleado("Lucía", 25, 600000);
        empleado.mostrarDatos();

        System.out.println("\n2. Vehículo y Auto");
        Auto auto = new Auto("Renault", "Sandero", 5);
        auto.mostrarDatos();

        System.out.println("\n3. Animal y Perro");
        Perro perro = new Perro("Toby", 4, "Labrador");
        perro.ladrar();
    }
}

class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        setNombre(nombre);
        setEdad(edad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad < 0) {
            throw new IllegalArgumentException("Valor inválido para edad");
        }
        this.edad = edad;
    }
}

class Empleado extends Persona {
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

class Vehiculo {
    private String marca;
    private String modelo;

    public Vehiculo(String marca, String modelo) {
        setMarca(marca);
        setModelo(modelo);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}

class Auto extends Vehiculo {
    private int cantPuertas;

    public Auto(String marca, String modelo, int cantPuertas) {
        super(marca, modelo);
        setCantPuertas(cantPuertas);
    }

    public int getCantPuertas() {
        return cantPuertas;
    }

    public void setCantPuertas(int cantPuertas) {
        if (cantPuertas < 1) {
            throw new IllegalArgumentException("Valor inválido para cantPuertas");
        }
        this.cantPuertas = cantPuertas;
    }

    public void mostrarDatos() {
        System.out.println(getMarca() + " " + getModelo() + " | Puertas: " + cantPuertas);
    }
}

class Animal {
    private String nombre;
    private int edad;

    public Animal(String nombre, int edad) {
        setNombre(nombre);
        setEdad(edad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad < 0) {
            throw new IllegalArgumentException("Valor inválido para edad");
        }
        this.edad = edad;
    }
}

class Perro extends Animal {
    private String raza;

    public Perro(String nombre, int edad, String raza) {
        super(nombre, edad);
        setRaza(raza);
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void ladrar() {
        System.out.println("el perro está ladrando");
    }
}
