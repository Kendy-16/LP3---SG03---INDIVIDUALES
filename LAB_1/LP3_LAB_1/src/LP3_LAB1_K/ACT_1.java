package LP3_LAB1_K;
import java.util.Scanner;

public class ACT_1 
{
	// Función que verifica si un número es primo
	public static boolean esPrimo(int num) 
	{
		if (num <= 1)
		{
			return false; // 0 y 1 no son primos
		}
		for (int i = 2; i <= num / 2; i++) // probamos divisores hasta la mitad del número
		{
			if (num % i == 0)
			{
                return false; // si encontramos un divisor, no es primo
            }
        }
        return true;
    }

    // Función que imprime los números primos entre 1 y n
    public static void imprimirPrimos(int n) 
    {
        System.out.println("Números primos entre 1 y " + n + ":");
        for (int i = 2; i <= n; i++) 
        {
            if (esPrimo(i))
            {
                System.out.println(i + " es primo");
            }
        }
        
        if (esPrimo(n)) {
        	System.out.println("\nEl numero " + n + " es primo");
        }
        else {
        	System.out.println("\nEl numero " + n + " no es primo");
        }
    }

    // Método principal (punto de entrada del programa)
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int n = scanner.nextInt();

        imprimirPrimos(n);

        scanner.close();
    }
}
