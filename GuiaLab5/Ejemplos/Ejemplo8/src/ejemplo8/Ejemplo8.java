/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo8;

import javax.swing.JOptionPane;

/**
 * Ejemplo 8: Genera una matriz con el triangulo de pascal, dependiendo de la
 * dimensión.
 *
 * @author kenetcode
 */
public class Ejemplo8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String texto;

        texto = "";

        int max = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la dimencion del triangulo de pascal "));

        int[][] pascal = new int[max][max];

        for (int i = 0; i < max - 1; i++) {

            for (int j = 0; j < max - 1; j++) {

                if (j == 0) {

                    pascal[i][j] = 1;
                }

                pascal[i + 1][j + 1] = pascal[i][j] + pascal[i][j + 1];
            }

            if (i == max - 2) {

                pascal[i + 1][0] = 1;

            }
        }

        for (int i = 0; i < pascal.length; i++) {
            
            for (int j = 0; j < pascal.length; j++) {
                
                texto += pascal[i][j] + "\t";
                
            }
            
            texto += "\n";
        }

        System.out.print(texto);

    }
}
