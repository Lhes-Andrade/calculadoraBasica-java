package calculadora;

import java.util.Scanner;

public class Calculadora {
    private static Scanner teclado;
    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        int numero1 = 0;
        int numero2 = 0;
        int opcion = 0;
        boolean repeticion = true;
        while (repeticion) {
            System.out.println("*Seleccione una operación.");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Salir");
            System.out.print("...");
            opcion = teclado.nextInt();
            if (opcion >= 1 && opcion < 5) {
                System.out.println("\n|******* CALCULADORA *******|");
                System.out.println("\n*Ingresa los números.");
                System.out.println("Primer número: ");
                numero1 = teclado.nextInt();
                System.out.println("Segundo número: ");
                numero2 = teclado.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println(numero1 + " + " + numero2 + " = " + (numero1 + numero2));
                        break;
                    case 2:
                        System.out.println(numero1 + " - " + numero2 + " = " + (numero1 - numero2));
                        break;
                    case 3:
                        System.out.println(numero1 + " * " + numero2 + " = " + (numero1 * numero2));
                        break;
                    case 4:
                        if (numero2 != 0) {
                        System.out.println(numero1 + " / " + numero2 + " = " + (numero1 / numero2));
                        } else {
                            System.out.println("|-- No se puede dividir entre cero --|");
                        }
                        break;
                    default:
                        System.out.println("Algo raro está ocurriendo...");
                        break;
                }
            } else if (opcion == 5) {
                repeticion = false;
                System.out.println("Usted presionó SALIR");
            } else {
                System.out.println("Opción no válida");
            }
        }
    }
}
