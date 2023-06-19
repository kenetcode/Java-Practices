/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;

import java.util.Scanner;

/**
 * 6. Escriba un programa en Java que reciba en modo texto, un valor real y que pruebe la conversión 
 * de dicho valor a todos los tipos de datos primitivos de Java que sea posible. Debería imprimir un 
 * mensaje mencionando las conversiones posibles. Utilice los métodos estáticos de la clase Double.
 * @author kenetcode
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double digito;
        byte digitoByte;
        short digitoShort;
        long digitoLong;
        float digitoFloat;
        int digitoInt;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un digito real");

        digito = Double.parseDouble(sc.nextLine());

        digitoByte = Double.valueOf(digito).byteValue();

        digitoShort = Double.valueOf(digito).shortValue();

        digitoLong = Double.valueOf(digito).longValue();

        digitoFloat = Double.valueOf(digito).floatValue();

        digitoInt = Double.valueOf(digito).intValue();

        System.out.println("\nLas conversiones posibles de un valor real a los tipos primitivos usando los metodos estaticos de Double son: ");
        System.out.println("Byte - Short - Long - Float - Int");
        System.out.println("Conversiones del valor real " + digito + " son:\n");
        System.out.println("Valor byte = " + digitoByte + "\nValor short = " + digitoShort + "\nValor long = " + digitoLong + "\nValor float = " + digitoFloat + "\nValor int = " + digitoInt);
    }
    
}
