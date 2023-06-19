/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14;

import java.util.Random;
import java.util.Arrays;

/**
 * 14. Crear una aplicación que busque el número más grande del vector de
 * números reales e imprimir la posición que ocupa.
 *
 * @author kenetcode
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random();

        double[] vector = new double[100];

        for (int i = 0; i < vector.length; i++) {

            vector[i] = random.nextDouble();
        }

        double maximo = vector[0];

        int indiceVector = 0;

        for (int i = 1; i < vector.length; i++) {
            if (vector[i] > maximo) {
                maximo = vector[i];
                indiceVector = i;
            }
        }
        
        System.out.printf("El valor mas grande es %1.4f y se encuentra en la posicion del vector[%d]\n", maximo, indiceVector);

//        double maximoTeste = Arrays.stream(vector).max().getAsDouble();
// Este codigo comentado sirve para encontrar el valor mayor de un arreglo, pero como necesitabamos la posicion
// debia hacerse de la manera anterior.
//        System.out.println("El maximo valor es " + maximoTeste);
    }

}
