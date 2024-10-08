package operadores;

import java.util.Scanner;

public class CalificacionFinal {
    public static void main(String[] args) {

        float nota1, nota2, nota3, nota4, Total;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese nota 1:");
        nota1=entrada.nextFloat();
        System.out.println("Ingrese nota 2:");
        nota2=entrada.nextFloat();
        System.out.println("Ingrese nota3 :");
        nota3=entrada.nextFloat();
        System.out.println("Ingrese nota4 :");
        nota4=entrada.nextFloat();

        nota1 *= 0.10f;
        nota2 *= 0.25f;
        nota3 *= 0.25f;
        nota4 *= 0.40f;

        Total = nota1 + nota2 + nota3 + nota4;

        System.out.println("Calificcion final:" + Total);
    }
}
