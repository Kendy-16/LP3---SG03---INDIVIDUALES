package EJERCICIOS_LAB1;
import java.util.Scanner;

public class EJ6 {

    // Convierte horas, minutos y segundos a segundos totales
    public static long aSegundos(long horas, long minutos, long segundos) {
        return horas * 3600L + minutos * 60L + segundos;
    }

    // Lee un número entero no negativo (long) con validación
    private static long leerNoNegativo(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextLong()) {
                long val = scanner.nextLong();
                if (val < 0) {
                    System.out.println("Entrada inválida: debe ser un número no negativo.");
                    continue;
                }
                return val;
            } else {
                System.out.println("Entrada inválida. Por favor ingresa un número entero no negativo.");
                scanner.next(); // descarta token inválido
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Conversión a segundos");
        long horas = leerNoNegativo(scanner, "Ingrese horas (>= 0): ");
        long minutos = leerNoNegativo(scanner, "Ingrese minutos (>= 0): ");
        long segundos = leerNoNegativo(scanner, "Ingrese segundos (>= 0): ");

        long totalSegundos = aSegundos(horas, minutos, segundos);

        System.out.println(horas + " horas, " + minutos + " minutos, " + 
        					segundos + " segundos = " + totalSegundos + " segundos");

        scanner.close();
    }
}