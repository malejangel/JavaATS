package operadores;

import java.util.Scanner;

public class Horas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int horasT, horas, dias, semanas;

        System.out.println("Ingrese numero de horas");
        horasT = entrada.nextInt();

        semanas = horasT /168;
        dias = horasT%168 /24;
        horas =horasT%24;



        System.out.println("en total son:");
        System.out.println("semanas = " + semanas);
        System.out.println("horas = " + horas);
        System.out.println("dias = " + dias);



    }
}
