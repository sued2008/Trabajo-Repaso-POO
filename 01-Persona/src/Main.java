public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "Ana";
        persona1.edad = 17;
        Persona persona2 = new Persona();
        persona2.nombre = "Lucas";
        persona2.edad = 18;
        System.out.println(persona1.nombre + ": " + persona1.edad);
        System.out.println(persona2.nombre + ": " + persona2.edad);
    }
}
