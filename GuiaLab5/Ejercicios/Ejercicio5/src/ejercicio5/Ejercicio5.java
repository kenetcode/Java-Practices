/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

import java.util.Scanner;

/**
 * 5. Escriba un programa en Java que permita calcular cualquiera de las
 * siguientes operaciones matemáticas: raíz cuadrada, potencia, logaritmo base
 * 10, logaritmo natural, exponencial y redondeo al entero.
 *
 * @author kenetcode
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int eleccion;
        double valor;

        System.out.println("Bienvenido. A continuacion indique la operacion a realizar");
        System.out.println("1. raíz cuadrada \n2. potencia \n3. logaritmo base 10 \n4. logaritmo natural \n5. exponencial \n6. redondeo al entero");

        Scanner scanner = new Scanner(System.in);

        eleccion = Integer.parseInt(scanner.nextLine());

        switch (eleccion) {
            case 1:
                System.out.println("Por favor ingrese el numero al que desea aplicar raiz cuadrada");
                valor = Valor();
                double raiz = Math.sqrt(valor);
                System.out.println("La raiz cuadrada del valor " + valor + " es " + raiz);

                break;
            case 2:
                System.out.println("Ingrese el numero al que desea aplicar una potencia");
                valor = Valor();
                System.out.println("Ingrese la potencia");
                int potencia = (int)Valor();
                valor = Math.pow(valor, potencia);
                System.out.println("El valor elevado a la potencia ingresada es : " + valor);

                break;
            case 3:
                System.out.println("Ingrese el numero al que desea aplicar logaritmo base 10");
                valor = Valor();
                valor = Math.log10(valor);
                System.out.println("El logaritmo base 10 del valor ingresado es: " + valor);
                
                break;
            case 4:
                System.out.println("Ingrese el numero al que desea aplicar logaritmo natural");
                valor = Valor();
                valor = Math.log(valor);
                System.out.println("El logaritmo natural del valor ingresado es: " + valor);
                
                break;
            case 5:
                System.out.println("Ingrese el numero al que desea aplicar la funcion exponencial");
                valor = Valor();
                valor = Math.exp(valor);
                System.out.println("El valor de la funcion exponencial del numero ingresado es: " + valor);
                
                break;
            case 6:
                System.out.println("Ingrese el numero decimal que desea redondear");
                valor = Valor();
                float valorFloat = Math.round((float)valor);
                System.out.println("El valor redondeado es: " + valorFloat);
                
                break;
            default:
                System.out.println("Ingreso una eleccion incorrecta");
                throw new AssertionError();
        }
    }

    public static double Valor() {

        Scanner sc = new Scanner(System.in);

        double valor;

        valor = Double.parseDouble(sc.nextLine());

        return valor;
    }
}
