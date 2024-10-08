package condicionales;

import javax.swing.*;

public class Cifras {
    public static void main(String[] args) {
        int numero, cifras;
         numero= Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero entre 0 y 99,999"));

         if (numero < 0 || numero > 99999){
             JOptionPane.showMessageDialog(null,"Este numero no esta en el rango");
         } else {
             cifras = String.valueOf(numero).length(); // convertir el numero a cadena para contar cifras
             JOptionPane.showMessageDialog(null,"Este numero tiene: " + cifras+ " cifras");

         }
    }
}
