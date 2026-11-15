public class Main {
    public static void main(String[] args) {
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
    }
}
