/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo3;

import java.util.Scanner;

//3. Calcula cifras en un entero
//Divide un número sucesivamente hasta conseguir el número de cifras que tiene. Por ejemplo si se
//introduce el número 3454 el programa devolverá un 4.
/**
 *
 * @author kenetcode
 */
public class Ejemplo3 {

    /**
     * @param args the command line arguments
     */
    
    static int calcularCifras(int x) {
        int total = 0;
        while (x != 0) {
            x = x / 10;   // división entera
            total += 1; // incrementar contador
        }
        return total;
    }

    public static void main(String[] args) {
        //Scanner para leer de consola
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Introduzca un valor entero:");
        a = sc.nextInt(); // Se lee el valor 
        System.out.println("El número de cifras es: " + calcularCifras(a)); 
    }

}
