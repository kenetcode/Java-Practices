/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tesgeometricos;

import java.util.Scanner;

/**
 *
 * @author kenetcode
 */
public class TesGeometrico {

    public static void main(String[] args) {

        Circulo circulo = new Circulo();
        Rectangulo rectangulo = new Rectangulo();
        Triangulo triangulo = new Triangulo();
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la base del rectangulo:");
        rectangulo.base = entrada.nextDouble();
        System.out.print("\nIngrese la altura del rectangulo:");
        rectangulo.altura = entrada.nextDouble();
        System.out.print("\nIngrese el radio del circulo: ");
        circulo.radio = entrada.nextDouble();
        System.out.print("\nIngrese la base del triangulo:");
        triangulo.base = entrada.nextDouble();
        System.out.print("\nIngrese la altura del triangulo:");
        triangulo.altura = entrada.nextDouble();
        System.out.print("\nEl area de un rectangulo es: " + rectangulo.calcularArea());
        System.out.print("\nEl perimetro de un rectangulo es: " + rectangulo.calcularPerimetro());
        System.out.print("\nEl area del circulo es: " + circulo.calcularArea());
        System.out.print("\nEl perimetro del circulo es: " + circulo.calcularPerimetro());
        System.out.print("\nEl area del triangulo es: " + triangulo.calcularArea());
        System.out.print("\nEl perimetro del triangulo es: " + triangulo.calcularPerimetro());
    }
}
