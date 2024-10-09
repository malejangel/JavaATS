package condicionales;

import javax.swing.*;

public class Fecha {
    public static void main(String[] args) {

        int dia, mes, ano;

        dia= Integer.parseInt(JOptionPane.showInputDialog("ingrese dia"));
        mes= Integer.parseInt(JOptionPane.showInputDialog("ingrese mes"));
        ano= Integer.parseInt(JOptionPane.showInputDialog("ingrese ano"));

        if ((dia>=1) && (dia<=30)){
            if ((mes>=1) && (mes<=12)){
                if(ano != 0){
                    JOptionPane.showMessageDialog(null,"Fecha correcta");
                } else {
                    JOptionPane.showMessageDialog(null,"Fecha incorrecta, ano incorrecto");
                }
            }else {
                JOptionPane.showMessageDialog(null,"Fecha incorrecta, mes incorrecto");
            }
        } else {
            JOptionPane.showMessageDialog(null,"Fecha incorrecta, dia incorrecto");
        }
    }
}
