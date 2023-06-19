/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;

import java.util.Arrays;

/**
 * 15. Crear un vector para almacenar cualquier cantidad de números, e imprimir
 * el mayor, menor, promedio y la lista ordenada de menor a mayor.
 *
 * @author kenetcode
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vector = {3, 10, 9, 21, 100};

        int minimo = Arrays.stream(vector).min().getAsInt();
        System.out.println("El valor mínimo del vector es: " + minimo);

        int maximo = Arrays.stream(vector).max().getAsInt();
        System.out.println("El valor maximo del vector es: " + maximo);

        int sumaPromedio = 0;

        double promedio;

        for (int i = 0; i < vector.length; i++) {

            sumaPromedio = sumaPromedio + vector[i];
        }

        promedio = (double)sumaPromedio / (double)vector.length;

        System.out.printf("El promedio = %1.2f", promedio);

        Arrays.sort(vector);

        System.out.println("\nEl vector ordenado de menor a mayor es: ");

        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }

    }

}
