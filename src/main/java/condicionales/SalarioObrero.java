package condicionales;

import javax.swing.*;

public class SalarioObrero {
    public static void main(String[] args) {
        int horasTrabajadas;
        float salarioTotal;

        horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Digite horas trabjadas"));

        if (horasTrabajadas <= 40){
            salarioTotal = horasTrabajadas *16;
        } else {
            salarioTotal = (40*16) + ((horasTrabajadas - 40) * 20);
        }

        JOptionPane.showMessageDialog(null,"El salario total es:"+salarioTotal);

    }
}
