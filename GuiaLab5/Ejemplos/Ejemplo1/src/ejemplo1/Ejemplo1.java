/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo1;

import java.util.Scanner;

/**
 *
 * @author kenetcode
 */

//1. Sumatoria de dos números enteros

public class Ejemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int n1, n2;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Bienvenido");
        System.out.println("Ingrese 2 número enteros separados por un espacio para sumarlos:");
        n1 = entrada.nextInt();
        n2 = entrada.nextInt();
        System.out.print("La suma de los dos números es: ");
        System.out.println(n1 + n2);
    }

}
