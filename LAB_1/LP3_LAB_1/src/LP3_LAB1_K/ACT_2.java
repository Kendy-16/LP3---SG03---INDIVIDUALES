package LP3_LAB1_K;
import java.util.Scanner;

public class ACT_2
{
	// Función para verificar si un número es palíndromo
    public static boolean esPalindromo(int numero) 
    {
    	int original = numero;   // Guardamos el número original
        int inverso = 0;         // Aquí construiremos el número al revés

        while (numero != 0) 
        {
            int digito = numero % 10;      // Tomamos el último dígito
            inverso = inverso * 10 + digito; // Lo agregamos al número inverso
            numero /= 10;                  // Eliminamos el último dígito
        }

        return original == inverso; // Si son iguales, es palíndromo
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número entero: ");
        int numero = scanner.nextInt();

        if (esPalindromo(numero)) {
            System.out.println(numero + " es un palíndromo.");
        } else {
            System.out.println(numero + " no es un palíndromo.");
        }

        scanner.close();
    }
}