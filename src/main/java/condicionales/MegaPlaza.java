package condicionales;

import javax.swing.*;

public class MegaPlaza {
    public static void main(String[] args) {
        int compra;
        double descuento, total;

        compra = Integer.parseInt(JOptionPane.showInputDialog("ingrese valor de compra"));

        if (compra >= 300){
            descuento = compra * 0.20;
            total = compra - descuento;
            JOptionPane.showMessageDialog(null,"El valor total es"+ total);
        } else {
            JOptionPane.showMessageDialog(null,"No cuentan con un decuento");
        }

    }
}
