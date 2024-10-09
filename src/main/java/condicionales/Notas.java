package condicionales;

import javax.swing.*;

public class Notas {
    public static void main(String[] args) {
        int nota;

        nota= Integer.parseInt(JOptionPane.showInputDialog("Ingrese nota de 0 a 10"));

        switch (nota){
            case 0:
                JOptionPane.showMessageDialog(null,"Nota Sobresaliente");
                break;
            case 1 :
                JOptionPane.showMessageDialog(null,"Nota insuficiente");
                break;

            case 2 :
                JOptionPane.showMessageDialog(null,"Nota insuficiente");
                break;

            case 3 :
                JOptionPane.showMessageDialog(null,"Nota suficiente");
                break;

            case 4 :
                JOptionPane.showMessageDialog(null,"Nota suficiente");
                break;

            case 5 :
                JOptionPane.showMessageDialog(null,"Nota bien");
                break;

            case 6 :
                JOptionPane.showMessageDialog(null,"Nota bien");
                break;

            case 7 :
                JOptionPane.showMessageDialog(null,"Nota Notable");
                break;

            case 8 :
                JOptionPane.showMessageDialog(null,"Nota Notable");
                break;

            case 9 :;
                JOptionPane.showMessageDialog(null,"Nota Notable");
                break;

            case 10 :
                JOptionPane.showMessageDialog(null,"Nota Sobresaliente");
                break;
            default: JOptionPane.showMessageDialog(null,"Error al ingresar nota");
        }
    }
}
