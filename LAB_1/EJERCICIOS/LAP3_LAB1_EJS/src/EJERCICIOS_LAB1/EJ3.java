package EJERCICIOS_LAB1;
import java.util.Random;

public class EJ3 {
    public static void main(String[] args) {
        Random rand = new Random();      // generador de números aleatorios
        final int LANZAMIENTOS = 20000;  // número de lanzamientos
        int[] frecuencias = new int[6];  // arreglo para contar caras 1..6

        // Realizar los lanzamientos
        for (int i = 0; i < LANZAMIENTOS; i++) {
            int cara = rand.nextInt(6) + 1; // devuelve 0..5, +1 => 1..6
            frecuencias[cara - 1]++;       // incrementar contador correspondiente
        }

        // Mostrar resultados
        System.out.println("Resultados de " + LANZAMIENTOS + " lanzamientos:");
        int suma = 0;
        for (int i = 0; i < 6; i++) {
            suma += frecuencias[i];
            double porcentaje = (frecuencias[i] * 100.0) / LANZAMIENTOS;
            System.out.println("Cara" + i+1 + ": " + frecuencias[i] + "("+porcentaje+"%)");
        }

        // Comprobación rápida
        System.out.println("Total registrado: " + suma);
    }
}