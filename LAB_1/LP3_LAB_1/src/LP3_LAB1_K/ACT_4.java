package LP3_LAB1_K;
import java.util.Scanner;
public class ACT_4 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // Pedimos el tamaño del arreglo
        System.out.print("Introduce la cantidad de números: ");
        int n = scanner.nextInt();

        // Creamos el arreglo
        int[] numeros = new int[n];

        // Pedimos los números al usuario
        System.out.println("Introduce los " + n + " números:");
        for (int i = 0; i < n; i++) {
            numeros[i] = scanner.nextInt();
        }

        // Calculamos la suma
        int suma = 0;
        for (int i = 0; i < n; i++) {
            suma += numeros[i];
        }

        // Calculamos el promedio
        double promedio = (double) suma / n;

        // Mostramos el resultado
        System.out.println("El promedio es: " + promedio);

        scanner.close();
    }
}