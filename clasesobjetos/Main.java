package clasesobjetos;

public class Main {
    public static void main(String[] args) {
        System.out.println("1. Persona");
        Persona persona1 = new Persona();
        persona1.nombre = "Ana";
        persona1.edad = 17;
        Persona persona2 = new Persona();
        persona2.nombre = "Lucas";
        persona2.edad = 18;
        System.out.println(persona1.nombre + ": " + persona1.edad);
        System.out.println(persona2.nombre + ": " + persona2.edad);

        System.out.println("\n2. Libro");
        Libro libro1 = new Libro("El principito", "Antoine de Saint-Exupéry", 1943);
        Libro libro2 = new Libro("Rayuela", "Julio Cortázar", 1963);
        libro1.mostrarDatos();
        libro2.mostrarDatos();

        System.out.println("\n3. Auto");
        Auto auto1 = new Auto();
        auto1.marca = "Fiat";
        auto1.modelo = "Cronos";
        auto1.color = "blanco";
        Auto auto2 = new Auto();
        auto2.marca = "Ford";
        auto2.modelo = "Fiesta";
        auto2.color = "azul";
        Auto auto3 = new Auto();
        auto3.marca = "Toyota";
        auto3.modelo = "Corolla";
        auto3.color = "gris";
        auto1.mostrarDatos();
        auto2.mostrarDatos();
        auto3.mostrarDatos();

        System.out.println("\n4. Cuenta bancaria");
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.setSaldo(15000);
        System.out.println("Saldo: " + cuenta.getSaldo());

        System.out.println("\n5. Rectángulo");
        Rectangulo rectangulo = new Rectangulo();
        rectangulo.setBase(8);
        rectangulo.setAltura(4);
        System.out.println("Área: " + rectangulo.calcularArea());
    }
}

class Persona {
    String nombre;
    int edad;
}

class Libro {
    private String titulo;
    private String autor;
    private int anio;

    public Libro(String titulo, String autor, int anio) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
    }

    public void mostrarDatos() {
        System.out.println(titulo + " | " + autor + " | " + anio);
    }
}

class Auto {
    String marca;
    String modelo;
    String color;

    public void mostrarDatos() {
        System.out.println("Tengo un " + marca + " modelo " + modelo + " de color " + color);
    }
}

class CuentaBancaria {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}

class Rectangulo {
    private double base;
    private double altura;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularArea() {
        return base * altura;
    }
}
