/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8;

import java.util.Scanner;

/**
 * 8. Escriba un programa en Java que reciba un valor entero entre 1 y 999,999;
 * y que muestre su valor en letras.
 *
 * @author kenetcode
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int valor;
        String cadena = "";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un valor entre el rango de 1 y 999,999 incluyendo ambos limites tambien");
        valor = Integer.parseInt(scanner.nextLine());

        if (valor >= 1 && valor <= 999999) {
            System.out.printf("El valor %d esta dentro del rango permitido y su valor en String es: ", valor);
            cadena = Integer.toString(valor);
            System.out.println("\n" + cadena);
        } else {
            System.out.printf("El valor %d no esta dentro del rango permitido, por lo que no se acepta", valor);
        }
    }

}
