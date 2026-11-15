public class Main {
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo();
        rectangulo.setBase(8);
        rectangulo.setAltura(4);
        System.out.println("Área: " + rectangulo.calcularArea());
    }
}
