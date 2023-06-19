/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9;

import java.util.Scanner;

/**
 * 9. Escriba un programa en Java que lea una cadena de caracteres conteniendo
 * cualquier caracter del código Unicode, luego que imprima cada caracter de la
 * cadena y su número de código Unicode equivalente. Nota: Puede usar la salida
 * con formato.
 *
 * @author kenetcode
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String cadena;
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una cadena de caracteres incluyendo simbolos y numeros");
        
        cadena = scanner.nextLine();

        for (int i = 0; i < cadena.length(); i++) {
            int code = cadena.codePointAt(i);
            System.out.println("El código Unicode de '" + cadena.charAt(i) + "' es " + code);
        }

    }

}
