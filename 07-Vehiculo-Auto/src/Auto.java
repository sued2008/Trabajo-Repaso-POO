public class Auto extends Vehiculo {
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
