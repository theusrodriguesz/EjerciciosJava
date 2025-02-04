package EjerciciosProgramacion;

import java.util.Scanner;

public class FechasEjercicio {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        FechasEjercicio fechas = new FechasEjercicio();
        fechas.mostrarMenu(scan);
    }

    public void mostrarMenu(Scanner scan) {
        System.out.println("=============== BIENVENIDO A LA CALCULADORA MENSUAL ===============");
        System.out.println("Introduzca si los meses son de un año bisexto (366 días) o normal (365 días)");
        System.out.printf("1 - Año bisexto (366 días)\n");
        System.out.printf("2 - Año normal (365 días)\n");

        System.out.print("\nIntroduzca su respuesta (1) o (2): ");
        int ano = scan.nextInt();

        if (ano == 1) {
            anoBisexto(scan);
        } else if (ano == 2) {
            anoNormal(scan);
        } else {
            System.out.println("Respuesta inválida! Por favor, vuelva a introducir una opción válida.");
        }
    }

    private void anoBisexto(Scanner scan) {
        int[] diasPorMesBs = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        System.out.print("\nIngrese el mes (1-12): ");
        int mes = scan.nextInt();

        if (mes < 1 || mes > 12) {
            System.out.println("Mes inválido.");
            return;
        }

        System.out.print("Ingrese el día: ");
        int dia = scan.nextInt();

        if (dia < 1 || dia > diasPorMesBs[mes - 1]) {
            System.out.println("Fecha inválida.");
        } else {
            System.out.println("Fecha válida.");
        }
    }

    private void anoNormal(Scanner scan) {
        int[] diasPorMesNo = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        System.out.print("\nIngrese el mes (1-12): ");
        int mes = scan.nextInt();

        if (mes < 1 || mes > 12) {
            System.out.println("Mes inválido.");
            return;
        }

        System.out.print("Ingrese el día: ");
        int dia = scan.nextInt();

        if (dia < 1 || dia > diasPorMesNo[mes - 1]) {
            System.out.println("Fecha inválida.");
        } else {
            System.out.println("Fecha válida.");
        }
    }
}
