package operadores;

import java.util.Scanner;

public class VentaCarros {
    public static void main(String[] args) {
        float salarioMes = 1000;
        float comision = 150;
        float carros;
        float valor;
        float salarioTotal, comisionTotal, comisionPorValor;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese los carros que vendio en el mes");
        carros =  entrada.nextFloat();
        System.out.println("ingrese el valor de venta de cada carro vendido");
        valor = entrada.nextFloat();

        comisionTotal = comision * carros;
        comisionPorValor= (valor*carros) * 0.05f;

        salarioTotal = salarioMes+comisionTotal+comisionPorValor;

        System.out.println("salarioTotal = " + salarioTotal);



    }
}
