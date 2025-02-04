package EjerciciosProgramacion;

import java.util.Scanner;

public class NumerosMCm {

    public static void main(String[] args) {
        Scanner scanMenu = new Scanner(System.in);
        MenuUser menu = new MenuUser();
        menu.mostrarMenu(scanMenu);
    }

    public static class MenuUser {

        private int mayor;
        private int central;
        private int menor;

        public void mostrarMenu(Scanner scanMenu) {
            System.out.println("=============CALCULADORA NUMERO MENOR/MAYOR/CENTRAL=============");
            System.out.printf("Calculadora del menor numero (1)\n");
            System.out.printf("Calculadora del mayor numero (2)\n");
            System.out.println("Calculadora del numero central (3)");

            System.out.print("Introduzca la opcion deseada (1, 2, 3): ");
            int opcion = scanMenu.nextInt();

            if (opcion == 1) {
                calcularNumeroMenor(scanMenu);
            } else if (opcion == 2) {
                calcularNumeroMayor(scanMenu);
                System.out.println("=============CALCULADORA NUMERO MAYOR=============");
            } else if (opcion == 3) {
                calcularNumeroCentral(scanMenu);
                System.out.println("=============CALCULADORA NUMERO CENTRAL=============");
            } else {
                System.out.println("Opción no válida. Intente de nuevo.");
            }

            resultadoGeneral();
        }

        private void calcularNumeroCentral(Scanner scanMenu) {
            System.out.println("=============CALCULADORA DEL NUMERO CENTRAL=============");
            System.out.println("Introduzca el primer numero: ");
            int primero = scanMenu.nextInt();
            System.out.println("Introduzca el segundo numero: ");
            int segundo = scanMenu.nextInt();
            System.out.println("Introduzca el tercer numero: ");
            int tercero = scanMenu.nextInt();

            if ((primero > segundo && primero < tercero) || (primero < segundo && primero > tercero)) {
                central = primero;
            } else if ((segundo > primero && segundo < tercero) || (segundo < primero && segundo > tercero)) {
                central = segundo;
            } else {
                central = tercero;
            }

            System.out.println("El numero central es: " + central);
        }

        private void calcularNumeroMenor(Scanner scanMenu) {
            System.out.println("=============CALCULADORA DEL MENOR NUMERO=============");
            System.out.print("Introduzca el primer numero: ");
            int primero = scanMenu.nextInt();
            System.out.print("Introduzca el segundo numero: ");
            int segundo = scanMenu.nextInt();
            System.out.print("Introduzca el tercer numero: ");
            int tercero = scanMenu.nextInt();

            menor = primero;
            if (segundo < menor) {
                menor = segundo;
            }
            if (tercero < menor) {
                menor = tercero;
            }

            System.out.println("El número menor es: " + menor);
        }

        private void calcularNumeroMayor(Scanner scanMenu) {
            System.out.println("=============CALCULADORA DEL MAYOR NUMERO=============");
            System.out.print("Introduzca el primer numero: ");
            int primero = scanMenu.nextInt();
            System.out.print("Introduzca el segundo numero: ");
            int segundo = scanMenu.nextInt();
            System.out.print("Introduzca el tercer numero: ");
            int tercero = scanMenu.nextInt();

            mayor = primero;
            if (segundo > mayor) {
                mayor = segundo;
            }
            if (tercero > mayor) {
                mayor = tercero;
            }

            System.out.println("El número mayor es: " + mayor);
        }

        private void resultadoGeneral() {
            System.out.println("=============RESULTADOS GENERALES=============");
            System.out.println("============MAYOR, CENTRAL Y MENOR============");
            System.out.println("El numero mayor: " + mayor);
            System.out.println("El numero central: " + central);
            System.out.println("El numero menor: " + menor);
        }
    }
}
