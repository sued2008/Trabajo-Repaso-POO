public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.setSaldo(15000);
        System.out.println("Saldo: " + cuenta.getSaldo());
    }
}
