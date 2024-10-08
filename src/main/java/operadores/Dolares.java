package operadores;

import java.util.Scanner;

public class Dolares {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        float Total, Guillermo,Luis,Juan;


        System.out.println("Escribir la cantidad de dolares de Guillermo");
        Guillermo = entrada.nextFloat();

        Luis= Guillermo / 2;
        Juan = (Guillermo+Luis)/2;

        Total =Guillermo + Luis + Juan;

        System.out.println("los dolares hay entre todos es: " + Total);
        System.out.println("Los dolares de guillermo son " + Guillermo);
        System.out.println("los dolares de Luis son:  " + Luis);
        System.out.println("Los dolares de Juan son:  " + Juan);


    }
}
