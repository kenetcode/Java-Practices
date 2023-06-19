/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo4;

import java.util.Scanner;

/**
 * 4. Lectura de números enteros, reales e impresión de salida con formato.
 *
 * @author kenetcode
 */
public class Ejemplo4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero1, numero2, suma;

        double base, exponente, resultado;
        
        System.out.println("CALCULAR SUMA DE ENTEROS");

        System.out.print("Escriba el primer número entero: ");

        numero1 = entrada.nextInt();

        System.out.print("Escriba el segundo número entero: ");

        numero2 = entrada.nextInt();

        suma = numero1 + numero2;

        System.out.printf("%s %d \n\n", "La suma es: ", suma);

        System.out.println("CALCULAR POTENCIA DE REALES");

        System.out.print("Escriba la base: ");

        base = entrada.nextDouble();

        System.out.print("Escriba el exponente: ");

        exponente = entrada.nextDouble();

        resultado = Math.pow(base, exponente);

        System.out.printf("%s %.2f \n\n", "La potencia es: ", resultado);
        
        //salida con formate con printf para mostrar en la misma cadena ambos resultados, mostrar un entero y mostrar un exponente.
        System.out.printf("suma = %1$d | resultado De Exponente = %2$.2f", suma, resultado);
    }

}
