package EjerciciosProgramacion;

import java.util.Scanner;

public class CuadradoEjerc {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        CuadradoEjerc cuadrado = new CuadradoEjerc();

        String repetir;
        do {
            cuadrado.mostrarMenu(scan);
            System.out.print("\n¿Desea realizar otra operación en cuadrado perfecto? (sí/no): ");
            repetir = scan.next();

            if (repetir.equalsIgnoreCase("no")) {
                System.out.println("¿Desea volver al menú principal o salir?");
                System.out.print("Ingrese 'menu' para regresar al menú principal o 'salir' para finalizar: ");
                String decision = scan.next();
                if (decision.equalsIgnoreCase("menu")) {
                    EjerciciosTabla.Seleccion.main(null);
                    break;
                } else if (decision.equalsIgnoreCase("salir")) {
                    System.out.println("¡Gracias por usar el programa! Adiós.");
                    break;
                } else {
                    System.out.println("Opción no válida. Volviendo al menú de operaciones.");
                }
            }

        } while (repetir.equalsIgnoreCase("sí"));

        scan.close();
    }

    public void mostrarMenu(Scanner scan) {
        System.out.println("=============== BIENVENIDO A LA CALCULADORA DE NUMEROS CUADRADOS ===============");
        System.out.print("\nIntroduzca el número cuadrado (el valor que dice ser cuadrado perfecto): ");
        int cuadrado = scan.nextInt();

        System.out.print("Introduzca el número entero (el número con el que verificar el cuadrado): ");
        int entero = scan.nextInt();

        cuadradoPerfecto(cuadrado, entero);
    }

    public static void cuadradoPerfecto(int cuadrado, int entero) {
        if (entero * entero == cuadrado) {
            System.out.println("¡Muy bien, cuadrado perfecto!");
        } else {
            System.out.println("Este número no es un cuadrado perfecto.");
        }
    }
}
