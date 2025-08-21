package LP3_LAB1_K;
import java.util.Scanner;

public class ACT_3 
{
    // Función para verificar si un número es perfecto
    public static boolean esPerfecto(int num) 
    {
        int sumaDivisores = 0;

        // Sumamos los divisores propios positivos
        for (int i = 1; i <= num / 2; i++) 
        {
            if (num % i == 0) {
                sumaDivisores += i;
            }
        }

        return sumaDivisores == num;
    }

    // Función para imprimir todos los números perfectos menores a n
    public static void imprimirPerfectos(int n) 
    {
        System.out.println("Números perfectos menores a " + n + ":");
        for (int i = 1; i < n; i++) 
        {
            if (esPerfecto(i)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int n = scanner.nextInt();

        imprimirPerfectos(n);

        scanner.close();
    }
}