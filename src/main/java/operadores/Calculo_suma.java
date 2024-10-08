package operadores;// Ejercicio hacer un programa que sume e imprima el calculo de 3 notas

import java.util.Scanner;

public class Calculo_suma {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in); // esto hace que entrada escriab en consola
        float nota1, nota2 ,nota3, suma; // variales

        System.out.println("Digite nota 1:");
        nota1= entrada.nextFloat(); // entrada.netx permite ingresar datos desde consola
        System.out.println("Digite nota 2:");
        nota2= entrada.nextFloat();
        System.out.println("Digite nota 3:");
        nota3= entrada.nextFloat();

        suma = nota1+nota2+nota3;

        System.out.println("La nota es:" + suma);
    }
}
