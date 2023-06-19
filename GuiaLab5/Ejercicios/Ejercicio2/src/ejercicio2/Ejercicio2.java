/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

import java.util.Scanner;

/**
 * 2. Escriba un programa en Java que lea un entero y que determine e imprima si
 * es par o impar.
 *
 * @author kenetcode
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int numero;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero ");

        numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }

    }

}
