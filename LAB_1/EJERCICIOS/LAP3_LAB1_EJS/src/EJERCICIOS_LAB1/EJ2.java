package EJERCICIOS_LAB1;
import java.util.Scanner;
public class EJ2 {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];

        System.out.println("Ingrese 10 números enteros. Cada número debe ser mayor que el anterior.");

        for (int i = 0; i < arr.length; i++) {
            while (true) {
                if (i == 0) {
                    System.out.print("Ingrese el número 1: ");
                } else {
                    System.out.print("Ingrese el número " + (i + 1) + " (debe ser > " + arr[i - 1] + "): ");
                }

                if (!scanner.hasNextInt()) {
                    System.out.println("Entrada inválida. Por favor ingrese un número entero.");
                    scanner.next(); // descarta token inválido
                    continue;
                }

                int valor = scanner.nextInt();

                if (i > 0 && valor <= arr[i - 1]) {
                    System.out.println("Error: el número debe ser estrictamente mayor que " + arr[i - 1] + ". Intenta de nuevo.");
                    continue;
                }

                arr[i] = valor;
                break;
            }
        }

        // Mostrar el arreglo guardado
        System.out.println("\nArreglo ingresado:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + (i < arr.length - 1 ? ", " : "\n"));
        }

        scanner.close();
    }
}