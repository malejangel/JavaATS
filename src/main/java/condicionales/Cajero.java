package condicionales;

import javax.swing.*;

public class Cajero {
    public static void main(String[] args) {
        final int saldo_inicial = 1000;
        int opcion;
        float ingreso, saldoActual, retiro;

        opcion = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido a su cajero automatico\n"
        + "1. Ingresar dinero a la cuenta \n" + "2. Retirar dinero a la cuenta \n" + "3. salir"));

        switch (opcion){
            case 1 : ingreso = Float.parseFloat(JOptionPane.showInputDialog(""));
                                saldoActual = saldo_inicial + ingreso;
                                JOptionPane.showMessageDialog(null, "dinero en cuenta" + saldoActual);
            break;

            case 2 : retiro = Float.parseFloat(JOptionPane.showInputDialog("Digite la cantidad que desea retirar"));
                if (retiro>saldo_inicial) {
                    JOptionPane.showMessageDialog(null,"no cuenta con el saldo suficiente para este retiro");
                }    else {
                    saldoActual =saldo_inicial - retiro;
                    JOptionPane.showMessageDialog(null, "Dinero en cuenta " +saldoActual);
                }
            break;

            case 3 : break;
            default: JOptionPane.showMessageDialog(null,"Opcion incorrecta");

        }
    }
}