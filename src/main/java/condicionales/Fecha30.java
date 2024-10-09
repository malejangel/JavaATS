package condicionales;

import javax.swing.*;

public class Fecha30 {
    public static void main(String[] args) {
        int dia, mes,  ano;

        dia = Integer.parseInt(JOptionPane.showInputDialog("ingrese dia"));
        mes = Integer.parseInt(JOptionPane.showInputDialog("ingrese mes"));
        ano = Integer.parseInt(JOptionPane.showInputDialog("ingrese ano"));


        if (mes>=1 && mes<=12){
            if (((mes==1)|| (mes==3)|| (mes==5)|| (mes==7)|| (mes==8)|| (mes==10)|| (mes==12)) && (dia>=1 && dia<=31)){
              JOptionPane.showMessageDialog(null," Fecha correcta");
            } else if (((mes==4)|| (mes==6)|| (mes==9)|| (mes==11)) && (dia>=1 && dia<=30)){
                JOptionPane.showMessageDialog(null,"Fecha correcta");
            } else if (mes==2 && dia>=1 && dia<=28) {
                JOptionPane.showMessageDialog(null,"Fecha correcta");
            }else {
                JOptionPane.showMessageDialog(null, "Fecha incorrecta, día inválido");
            }
        }else{
            JOptionPane.showMessageDialog(null,"Fecha incorrecta");
        }

        if (ano !=0){
            JOptionPane.showMessageDialog(null,"Fecha correcta");
        }else {
            JOptionPane.showMessageDialog(null,"Fecha incorrecta, ano incorrecto");
        }
    }
}
