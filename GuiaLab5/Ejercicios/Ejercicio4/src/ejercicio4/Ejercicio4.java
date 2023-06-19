/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * 4. Escriba un programa en Java que reciba en modo texto (usando Scanner), un
 * dígito entero y que pruebe la conversión de dicho valor a todos los tipos de
 * datos primitivos de Java que sea posible. Debería imprimir un mensaje
 * mencionando las conversiones posibles. Utilice los métodos estáticos de la
 * clase Integer.
 *
 * @author kenetcode
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String resultado;
        int digito;
        byte digitoByte;
        short digitoShort;
        long digitoLong;
        float digitoFloat;
        double digitoDouble;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un digito entero");

        digito = Integer.parseInt(sc.nextLine());

        digitoByte = Integer.valueOf(digito).byteValue();

        digitoShort = Integer.valueOf(digito).shortValue();

        digitoLong = Integer.valueOf(digito).longValue();

        digitoFloat = Integer.valueOf(digito).floatValue();

        digitoDouble = Integer.valueOf(digito).doubleValue();

        System.out.println("\nLas conversiones posibles de un entero a los tipos primitivos usando los metodos estaticos de Integer son: ");
        System.out.println("Byte - Short - Long - Float - Double");
        System.out.println("Conversiones del valor entero " + digito + " son:\n");
        System.out.println("Valor byte = " + digitoByte + "\nValor short = " + digitoShort + "\nValor long = " + digitoLong + "\nValor float = " + digitoFloat + "\nValor double = " + digitoDouble);
    }

}
