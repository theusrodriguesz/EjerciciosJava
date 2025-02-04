package EjerciciosProgramacion;

import java.util.Scanner;

public class DiasMensuales {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DiasMensuales dias = new DiasMensuales();
        dias.mostrarMenu(scan);
    }

    public void mostrarMenu(Scanner scan) {
        System.out.printf("===============BIENVENIDO A LA CALCULADORA MENSUAL===============");
        System.out.println("Introduzca si los meses son de un año bisexto (366) o normal (365)");
        System.out.printf("1 - Año bisexto (366 dias)\n");
        System.out.printf("2 - Año normal  (365 dias)\n");

        System.out.printf("\nIntroduzca su respuesta (1) y (2): ");
        int ano = scan.nextInt();

        if (ano == 1) {
            anoBisexto(scan);
        } else if (ano == 2) {
            anoNormal(scan);
        } else {
            System.out.println("Respuesta invalida! Por favor, vuelva introducir una opcion valida.");
        }
    }

    private void anoBisexto(Scanner scan) {
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        int[] diasBisexto = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        while (true) {
            System.out.printf("Introduzca el mes del año que deseas saber la cantidad de dias\n");
            System.out.print("Mes (o 'salir' para terminar): ");
            scan.nextLine();
            String mes = scan.nextLine();

            if (mes.equalsIgnoreCase("salir")) {
                System.out.println("Saliendo del programa.");
                break;
            }

            boolean encontrado = false;
            for (int i = 0; i < meses.length; i++) {
                if (mes.equalsIgnoreCase(meses[i])) {
                    System.out.printf("El mes de %s, tiene %d días\n", mes, diasBisexto[i]);
                    encontrado = true;
                    break;
                }
            }

            if (!encontrado) {
                System.out.println("Mes no válido. Intente de nuevo.");
            }
        }
    }

    private void anoNormal(Scanner scan) {
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        int[] diasNormal = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        while (true) {
            System.out.printf("Introduzca el mes del año que deseas saber la cantidad de dias\n");
            System.out.print("Mes (o 'salir' para terminar): ");
            scan.nextLine();
            String mes = scan.nextLine();

            if (mes.equalsIgnoreCase("salir")) {
                System.out.println("Saliendo del programa.");
                break;
            }

            boolean encontrado = false;
            for (int i = 0; i < meses.length; i++) {
                if (mes.equalsIgnoreCase(meses[i])) {
                    System.out.printf("El mes de %s, tiene %d días\n", mes, diasNormal[i]);
                    encontrado = true;
                    break;
                }
            }

            if (!encontrado) {
                System.out.println("Mes no válido. Intente de nuevo.");
            }
        }
    }
}
