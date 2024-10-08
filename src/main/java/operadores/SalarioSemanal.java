package operadores;

import java.util.Scanner;

// ejercicio calcular el salario semanla de un empleado apartid e sus horas
// semanales de sus horas trabajadas de su salario por hora
public class SalarioSemanal {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        float salario;
        float horas;
        float dias;
        float multi;

        System.out.println("horas que trabajas por dia: ");
        horas = entrada.nextFloat();

        System.out.println("Pago por dia:");
        salario = entrada.nextFloat();

        System.out.println("dias por semana trabajados:");
        dias = entrada.nextFloat();

        multi = horas * salario * dias;

        System.out.println("su salario por seman es:" + multi);


    }
}
