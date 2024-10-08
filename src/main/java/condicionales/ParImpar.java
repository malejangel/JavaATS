package condicionales;

import javax.swing.*;

public class ParImpar {
    public static void main(String[] args) {
        int num1, num2;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("ingrese numero a"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("ingrese numero b"));

        if (num1% 2 ==0){
            JOptionPane.showMessageDialog(null,"numero a es par");

        } else {
            JOptionPane.showMessageDialog(null,"numero a es impar");
        }

        if (num2% 2 ==0){
            JOptionPane.showMessageDialog(null,"numero b es par");

        } else {
            JOptionPane.showMessageDialog(null,"numero b es impar");
        }
    }
}
