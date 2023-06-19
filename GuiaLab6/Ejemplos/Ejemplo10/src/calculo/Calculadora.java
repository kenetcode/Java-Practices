/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculo;

/**
 *
 * @author kenetcode
 */
public class Calculadora {

    public static double constantePI = 3.1416;

    public static int factorial(int n) {
        int fact = 1;
        while (n > 0) {
            fact *= n--;
        }
        return fact;
    }
}
