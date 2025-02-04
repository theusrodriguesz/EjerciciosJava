package EjerciciosTabla;

import java.util.Scanner;
import EjerciciosProgramacion.DiasMensuales;
import EjerciciosProgramacion.NumerosMCm;
import EjerciciosProgramacion.FechasEjercicio;
import EjerciciosProgramacion.CuadradoEjerc;

public class Seleccion {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        CuadradoEjerc cuadrado = new CuadradoEjerc();
        NumerosMCm numMCM = new NumerosMCm();
        FechasEjercicio fechasEjerc = new FechasEjercicio();

        System.out.println("=============== BIENVENIDO AL MENU DE EJERCICIOS! ===============");
        System.out.printf("En este menu, podrás eligir uno de los ejercicios de programación!\n");
        System.out.printf("\n============================== EJERCICIOS ==============================\n");
        System.out.printf("Ejercicio 3, 4 y 5 (Definir dentre 3 numeros, el mayor, central y menor.) (OPCION 1)\n");
        System.out.printf("Ejercicio 6 y 7 (Indicar el numero de dias de un mes del año bisexto o normal) (OPCION 2)\n");
        System.out.printf("Ejercicio 8 (Programa que indica si una fecha del año, bisexto o normal, es valida) (OPCION 3)\n");
        System.out.printf("Ejercicio 2 (Programa que indica si es un cuadrado perfecto (OPCION 4)\n");

        System.out.printf("Introduzca la opción deseada (OPCIONES 1, 2, 3 y 4): ");
        int opcion = scan.nextInt();

        if (opcion == 1) {
            numMCM.main(null);
        } else if (opcion == 2) {
            fechasEjerc.mostrarMenu(scan);
        } else if (opcion == 3) {
            fechasEjerc.mostrarMenu(scan);
        } else if (opcion == 4) {
            cuadrado.mostrarMenu(scan);
        }
        else {
            System.out.println("Respuesta inválida! Vuelva a intentar.");
        }

        scan.close();
    }
}
