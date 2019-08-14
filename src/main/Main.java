package main;

import javax.swing.*;

public class Main {
    private JButton btnPresiona;
    private JPanel panel1;

    public Main() {
        btnPresiona.addActionListener(e -> { String nombre = JOptionPane.showInputDialog(null,"Ingresa tu nombre");
                JOptionPane.showMessageDialog(null, "Hola " + nombre);
            });
    }

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Main");
        jFrame.setContentPane(new Main().panel1);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.pack();
        jFrame.setVisible(true);
    }

}
