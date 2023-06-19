/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package volumenesfera;
import javax.swing.JOptionPane;
/**
 *
 * @author kenetcode
 */
public class VolumenEsfera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String volumen;
        
        Esfera esfera = new Esfera();
        
        esfera.setRadio(4);
        
        volumen = String.format("El volumen de la esfera es: V = %.2f ",esfera.calcularVolumen());
        
        JOptionPane.showMessageDialog(null, volumen);
        
    }
    
}
