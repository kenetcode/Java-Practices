/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo5;

import javax.swing.JOptionPane;

/**
 * 5. Lectura en modo gráfico y operadores relacionales.
 *
 * @author kenetcode
 */
public class Ejemplo5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double valor1, valor2;

        valor1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un valor real:"));

        valor2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese otro valor real:"));

        if (valor1 == valor2) {
            JOptionPane.showMessageDialog(null, valor1 + " == " + valor2);
        } else {
            JOptionPane.showMessageDialog(null, valor1 + " NO es igual que" + valor2);
        }

        if (valor1 != valor2) {
            JOptionPane.showMessageDialog(null, valor1 + " != " + valor2);
        } else {
            JOptionPane.showMessageDialog(null, valor1 + " NO es distinto de " + valor2);
        }

        if (valor1 < valor2) {
            JOptionPane.showMessageDialog(null, valor1 + " es menor que " + valor2);
        } else {
            if (valor2 < valor1) {
                JOptionPane.showMessageDialog(null, valor2 + " es menor que" + valor1);
            } else {
                JOptionPane.showMessageDialog(null, valor1 + " No es menor ni mayor que " + valor2);
            }
        }

        System.exit(0);

    }

}
