package condicionales;

import javax.swing.*;

public class MayorIgual {
    public static void main(String[] args) {
        int num1, num2;

        num1= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero a:"));

        num2= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero b:"));

        if (num1 >= num2){
            JOptionPane.showMessageDialog(null,"El numero a: " +num1+ " es mayor o igual a numero b " +num2);
        } else {
            JOptionPane.showMessageDialog(null, "El numero a: " +num1+ " es menor a numero b "+num2);
        }
    }
}
