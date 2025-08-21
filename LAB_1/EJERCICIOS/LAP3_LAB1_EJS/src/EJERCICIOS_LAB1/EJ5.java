package EJERCICIOS_LAB1;
import java.util.Scanner;
public class EJ5 {

    // Calcula el cargo dado el número de horas (puede tener decimales)
    public static double calcularCargo(double horas) {
        if (horas <= 0) {
            return 0.0; // No hay cobro si no se usa el estacionamiento
        }

        // Cobrar por horas completas: redondear hacia arriba
        int horasCobro = (int) Math.ceil(horas);

        final double PRIMERA_HORA = 3.00;
        final double HORA_SIGUIENTE = 0.50;
        final double MAX_DIARIO = 12.00;

        double cargo;

        if (horasCobro == 1) {
            cargo = PRIMERA_HORA;
        } else {
            cargo = PRIMERA_HORA + (horasCobro - 1) * HORA_SIGUIENTE;
        }

        // Aplicar límite máximo por día
        if (cargo > MAX_DIARIO) {
            cargo = MAX_DIARIO;
        }

        return cargo;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cálculo de cargo de estacionamiento");
        double horas = leerDouble(scanner, "Ingrese el número de horas (puede ser decimal): ");

        double cargo = calcularCargo(horas);

        System.out.println("Horas registradas (cobradas): " + (int) Math.ceil(Math.max(0, horas)));
        System.out.println("Cargo a pagar: S/ " + cargo);

        scanner.close();
    }

    // Lee un double con validación
    private static double leerDouble(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextDouble()) {
                double val = scanner.nextDouble();
                if (val < 0) {
                    System.out.println("Por favor ingrese un valor no negativo.");
                    continue;
                }
                return val;
            } else {
                System.out.println("Entrada inválida. Introduzca un número (ej. 2 o 1,5).");
                scanner.next(); // descartar token inválido
            }
        }
    }
}