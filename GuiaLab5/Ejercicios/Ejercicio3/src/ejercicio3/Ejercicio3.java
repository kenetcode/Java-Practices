/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

import java.util.Scanner;

/**
 * 3. Escriba un programa en Java lea un entero y que determine si es o no un
 * número primo.
 *
 * @author kenetcode
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int numero;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero entero para determinar si es primo o no");

        numero = sc.nextInt();

        if (numero <= 1) {
            System.out.println("El numero no es primo");
        } else if (numero == 2) {
            System.out.println("El numero es primo");
        } else if (numero % 2 == 0) {
            System.out.println("El numero no es primo");
        } else if (numero == 3) {
            System.out.println("El numero es primo");
        } else if (numero % 3 == 0) {
            System.out.println("El numero no es primo");
        } else {
            System.out.println("El numero es primo");
        }

    }

}
