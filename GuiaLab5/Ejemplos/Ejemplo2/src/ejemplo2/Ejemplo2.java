/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo2;

import javax.swing.JOptionPane;

/**
 *
 * @author kenetcode
 */

//2. Cálculo de impuestos a una venta

public class Ejemplo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        final double IVA = 0.13;
        final double IMPUESTO_ESPECIAL = 0.12;

        double venta = Double.parseDouble(JOptionPane.showInputDialog("Por favor ingrese la cantidad de $ a gravar", 0));
        
        double valorGravado = venta + (venta * IVA) + (venta * IMPUESTO_ESPECIAL);
        
        JOptionPane.showMessageDialog(null,"El total a pagar es: $" + valorGravado);
    }

}
