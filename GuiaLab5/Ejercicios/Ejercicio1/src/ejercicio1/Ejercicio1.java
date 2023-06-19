/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

import javax.swing.JOptionPane;

/**
 * 1. Escriba un programa en Java que reciba a través de un cuadro de diálogo el
 * radio de una circunferencia, calcule su área y su diámetro, y muestre los
 * resultados en un cuadro de diálogo.
 *
 * @author kenetcode
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double radio = 0, area = 0, diametro = 0;
        String mensaje = "";

        radio = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el radio de la circunferencia"));

        area = Math.PI * Math.pow(2, area);

        diametro = radio * 2;
        
        mensaje = String.format("Area es A = %1.2f \nDiametro D = %1.2f", area, diametro);
     

        JOptionPane.showMessageDialog(null, mensaje);

    }

}
