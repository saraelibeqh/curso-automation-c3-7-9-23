package com.icaro.clase3;

public class P4Condicionales {
    public static void main(String[] args) {
        int var1 = 100;
        int var2 = 200;

        if (var1 < var2){
            System.out.println("Var 1 es menor a Var2");
        }

        char var3 = 'C';
        char var4 = 'N';

        if (var3 == var4){
            System.out.println("Son iguales");
        }
        else {
            System.out.println("Son distintos");
        }

        long var5 = 600; //ejemplos con 1000 y 600

        if (var5 < 10){
            System.out.println("numero chico");
        } else if (var5 > 50 && var5 < 200){
            System.out.println("numero mediano");
        } else if (var5 > 500 && var5 < 1000) {
            System.out.println("numero grande");
        } else{
            System.out.println("numero muuuy grande");
        }

        String dia = "Miercoles"; //Prueba con Domingo y Miercoles

        switch (dia){
            case "Lunes":
                System.out.println("Es Lunes");
                break;
            case "Martes":
                System.out.println("Es Martes");
                break;
            case "Miercoles":
                System.out.println("Miercoles");
                break;
            case "Jueves":
                System.out.println("Es Jueves");
                break;
            case "Viernes":
                System.out.println("Es Viernes");
                break;
            default:
                System.out.println("Es Finde");

        }

    }
}
