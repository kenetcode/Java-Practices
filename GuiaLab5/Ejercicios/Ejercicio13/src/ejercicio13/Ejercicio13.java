/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13;

import java.util.Random;
import java.util.Scanner;

/**
 * 13. Crear una aplicación para buscar un número entero en una matriz, e
 * imprimir la ubicación de dicho número.
 *
 * @author kenetcode
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int indiceI = 0, indiceJ = 0;
        Random random = new Random();

        int[][] matriz = new int[100][100];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {

                matriz[i][j] = random.nextInt(100);
            }
        }

        System.out.println("Ingrese un numero entero de 0 a 99 para conocer su ubicacion en una matriz de 10x10");
        System.out.println("Tomar en cuenta que los valores d ela matriz cada vez se asignan de manera diferente");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        
        

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                
                if(numero == matriz[i][j]){
                    indiceI = i;
                    indiceJ = j;
                }
            }
        }
        
        if(indiceI == 0 && indiceJ ==0 ){
            System.out.println("Ingreso un valor fuera del rango entre 0 - 99");
        }
        else{
            System.out.printf("La ubicacion del numero ingresado en la matriz es Fila: %d Columna: %d   matriz[%d][%d] = %d\n", indiceI, indiceJ, indiceI, indiceJ, numero);
        }
    }

}
