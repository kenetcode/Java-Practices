/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matematicas;

/**
 *
 * @author kenetcode
 */
public class PruebaMatematicas {

    public static void main(String[] args) {
        Matematicas x = new Matematicas();
        double[] y = {4.5, 2.5, 1.3, 1.7};
        double z = x.sumar(3.25, 2.75);
        System.out.println(z);
        z = x.sumar(1, 2, 3);
        System.out.println(z);
        System.out.println(x.sumar(y));
    }
}
