package com.icaro.examen1;
import java.util.Scanner;
public class CalculadoraNew {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double res = 0;
        String operacion;
        boolean comprobar = false;

        do{
            //Verificación de los datos puestos por el usuario del número 1.
            String numero1;
            do {
                System.out.println("\n Bienvenido a su CALCULADORA BÁSICA");
                System.out.println("\n Por favor, ingresa el primer número de la operación. ");
                numero1 = sc.nextLine();
            } while (!numero1.matches("[+-]?[\\d]*[.]?[\\d]+"));
            double nume1 = Double.parseDouble(numero1);
            double n1 = new Double(numero1);
            // Fin de la verificación de los datos puestos por el usuario del número 1.

            do {
                System.out.println("\n ¿Que operación desea realizar? (Ingrese un signo)");
                System.out.println("Como los mostrados a continuación: \n + = sumar \n - = restar \n"
                        + " x = multiplicar \n / = dividir \n");
                operacion = sc.nextLine();
                if (operacion.equals("+") || operacion.equals("-") || operacion.equals("x") ||
                        operacion.equals("X") || operacion.equals("/") || operacion.equals("%") ||
                        operacion.equals("*")) {
                    comprobar = true;
                }else { comprobar = false;
                    System.out.println("Operación no válida");}
            } while (comprobar != true);

            // Verificación de los datos puestos por el usuario del número 2.
            String numero2;
            do {
                System.out.println("\n Por favor, ingresa el segundo número.");
                numero2 = sc.nextLine();
            } while (!numero2.matches("[+-]?[\\d]*[.]?[\\d]+"));
            double nume2 = Double.parseDouble(numero2);
            double n2 = new Double(numero2);
            // Fin de la verificación de los datos puestos por el usuario del número 2.

            do{
                comprobar = true;
                switch(operacion){
                    case "+":
                        res = n1 + n2;
                        if (res < 0){
                            System.out.println("Ten cuidado, el resultado es negativo!");
                        } else if (res >= 0 && res < 10000){
                            System.out.println("Resultado dentro de los límites");
                        } else {
                            System.out.println("Error, resultado muy grande");
                        }
                        break;
                    case "-":
                        res = n1 - n2;
                        if (res < 0){
                            System.out.println("Ten cuidado, el resultado es negativo!");
                        } else if (res >= 0 && res < 10000){
                            System.out.println("Resultado dentro de los límites");
                        } else {
                            System.out.println("Error, resultado muy grande");
                        }
                        break;
                    case "x":
                    case "X":
                        res = n1 * n2;
                        if (res < 0){
                            System.out.println("Ten cuidado, el resultado es negativo!");
                        } else if (res >= 0 && res < 10000){
                            System.out.println("Resultado dentro de los límites");
                        } else {
                            System.out.println("Error, resultado muy grande");
                        }
                        break;
                    case "/":
                        /* Para evitar errores al dividir por cero,
                        se le vuelve a preguntar al usuario que añada un número distinto*/
                        while(n2 == 0){
                            do {
                                System.err.println(" No se puede dividir por cero \n"
                                        + "para evitar errores coloca otro número.");
                                numero2 = sc.nextLine();
                            }while (!numero2.matches("[+-]?[\\d]*[.]?[\\d]+"));
                            nume2 = Double.parseDouble(numero2);
                            n2 = new Double(numero2);
                        }
                        res = n1 / n2;
                        if (res < 0){
                            System.out.println("Ten cuidado, el resultado es negativo!");
                        } else if (res >= 0 && res < 10000){
                            System.out.println("Resultado dentro de los límites");
                        } else {
                            System.out.println("Error, resultado muy grande");
                        }
                        break;

                }
            }while(comprobar != true);

            System.out.println("(" + numero1 + ") " + operacion + " (" + numero2 + ")" + " = " + res);
            System.out.println("\n ¿Desea hacer alguna otra operación? \n");
            System.out.println(" [s/n]");
            do{
                comprobar = true;
                operacion = sc.nextLine();

                switch (operacion) {
                    case "s":
                    case "S":
                    case "n":
                    case "N":
                        break;
                    default:
                        System.err.println("\n Error, ingresa un literal valido. \n");
                        comprobar = false;
                }
            }while(comprobar != true);
        }while(operacion.equals("s") || operacion.equals("S"));
    }
}
