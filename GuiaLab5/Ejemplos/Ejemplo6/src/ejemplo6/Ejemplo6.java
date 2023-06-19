/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo6;
import javax.swing.*;
/**
 * 6. Constructores de objetos de tipo String y vectores de caracteres.
 * @author kenetcode
 */
public class Ejemplo6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char arregloChar[] = { 'e','s','t','a',' ','e','s',' ','l','a',' ','c','l','a','s','e'};
        byte arregloByte[] = { ( byte ) 'm', ( byte ) 'a',( byte ) 'y', (byte) 'o', ( byte ) ' ',( byte ) '2', ( byte ) '0', ( byte ) '1', (byte) '4' };
        String s = new String( "PRN215" );
        String s1 = new String();
        String s2 = new String( s );
        String s3 = new String( arregloChar );
        String s4 = new String( arregloChar, 4, 3 );
        String s5 = new String( arregloByte, 0, 4 );
        String s6 = new String( arregloByte );
        
        String salida = "s1 = " + s1 + "\ns2 = " + s2 + "\ns3 = " + s3 + "\ns4 = " + s4 + "\ns5 = " + s5 + "\ns6 = " + s6;
        
        JOptionPane.showMessageDialog(null,salida,"Resultados", JOptionPane.INFORMATION_MESSAGE );
        
        System.exit(0);
    }
    
}
