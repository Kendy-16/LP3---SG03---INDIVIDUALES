package EJERCICIOS_LAB1;
import java.util.Scanner;

public class EJ4 {

    // Función que devuelve el menor de tres números decimales
    public static double menor(double a, double b, double c) {
        // Opción clara con comparaciones
        double menor = a;
        if (b < menor) menor = b;
        if (c < menor) menor = c;
        return menor;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese tres números decimales (pueden tener parte fraccionaria).");

        double x = leerDouble(scanner, "Primer número: ");
        double y = leerDouble(scanner, "Segundo número: ");
        double z = leerDouble(scanner, "Tercer número: ");

        double resultado = menor(x, y, z);
        System.out.println("El menor de los tres números es: " + resultado);

        scanner.close();
    }

    // Función auxiliar para leer un double con validación
    private static double leerDouble(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextDouble()) {
                return scanner.nextDouble();
            } else {
                System.out.println("Entrada inválida. Por favor ingresa un número decimal.");
                scanner.next(); // descarta token inválido
            }
        }
    }
}