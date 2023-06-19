/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matematicas;

/**
 *
 * @author kenetcode
 */
public class Matematicas {

    public double sumar(double x, double y) {
        return x + y;
    }

    public double sumar(double x, double y, double z) {
        return x + y + z;
    }

    public double sumar(double[] array) {
        double total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }

        return total;
    }
}
