package condicionales;

import javax.swing.*;

public class Multiplo10 {
    public static void main(String[] args) {
        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));

        if (numero%10 ==0){
            JOptionPane.showMessageDialog(null,"El numero"+ numero+ "es multiploo de 10");
        } else {
            JOptionPane.showMessageDialog(null,"El numero" +numero+ "no es multiplo de 10");
        }
    }
}
