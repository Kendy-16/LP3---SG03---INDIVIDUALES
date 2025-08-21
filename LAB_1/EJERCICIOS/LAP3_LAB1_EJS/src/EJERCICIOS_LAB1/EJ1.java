package EJERCICIOS_LAB1;
import java.util.Scanner;

public class EJ1 
{
    // Función que recibe un arreglo y devuelve la suma
    public static int sumarArreglo(int[] arr) {
        int suma = 0;
        for (int i = 0; i < arr.length; i++) {
            suma += arr[i];
        }
        return suma;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir cantidad de elementos
        System.out.print("Introduce la cantidad de números: ");
        int n = scanner.nextInt();

        int[] numeros = new int[n];

        // Ingresar los valores
        System.out.println("Introduce los " + n + " números:");
        for (int i = 0; i < n; i++) {
            numeros[i] = scanner.nextInt();
        }

        // Mostrar la suma
        System.out.println("La suma es: " + sumarArreglo(numeros));

        scanner.close();
    }
}