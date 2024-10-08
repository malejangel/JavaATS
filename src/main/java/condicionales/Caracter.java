package condicionales;

import javax.swing.*;

public class Caracter {
    public static void main(String[] args) {
        char letra;

        letra = JOptionPane.showInputDialog("Digite una letras:").charAt(0);

        if(Character.isUpperCase(letra)){ // para ver si es letra mayuscula
            JOptionPane.showMessageDialog(null,"Es una letra Mayuscula");
        } else {
            JOptionPane.showMessageDialog(null,"Es una letra minuscula");
        }
    }
}
