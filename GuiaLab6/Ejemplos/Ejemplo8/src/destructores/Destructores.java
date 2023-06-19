/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package destructores;

/**
 *
 * @author kenetcode
 */
public class Destructores {
    
    public static void main(String[] args) throws Throwable {
        Uno a = new Uno();
        System.out.println("Concluyendo la aplicacion para llamar a finalize() ");
        a.finalize();
    }
    
}
