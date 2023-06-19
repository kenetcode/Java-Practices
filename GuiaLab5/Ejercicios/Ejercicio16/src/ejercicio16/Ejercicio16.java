/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16;

import java.util.Arrays;

/**
 * 16. Crear una aplicación en Java que incluya las siguientes funciones de
 * manejo de vectores enteros y las compruebe en la función principal:
 *
 * @author kenetcode
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] vector = {0, 5, 6, 0, 9, 2, 4, 9, 27, 9};

        int[] vector2 = {0, 5, 6, 0, 9, 2, 4, 9, 27, 9};

        System.out.println("El vector creado es :");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }

        System.out.println("\nEl numero de ceros en el vector es: " + cuentaCeros(vector));

        System.out.println("La suma de numero pares que hay dentro del arreglo es: suma = " + sumaPares(vector));

        System.out.println("El numero de veces que se repite el valor 9 en el vector es: " + cuentaRepeticiones(vector, 9));

        sustituye(vector, 0, 1);
        System.out.println("El nuevo vector sustituyendo los valores 0 por 1 es: ");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }

        intercambia(vector, 0, 2);
        System.out.println("\nEl nuevo vector intercambiando las posiciones 0 y 2 es: ");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }

        invierte(vector);
        System.out.println("\nEl nuevo vector invertido es: ");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }

        System.out.println("\nEl mayor valor en el rango de 5 y 100 del vector es: " + mayor(vector, 5, 100));

        System.out.println("La posicion del mayor valor en el rango de 5 y 100 del vector es: " + posMayor(vector, 5, 100));

        System.out.println("El vector es ordenado de mayor a menor");
        ordena2(vector);
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }

        System.out.println("\nSe comparan dos vectores, si son iguales devuelve true, si no, false");
        
        System.out.print("vector 1: ");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        
        System.out.print("\nVector 2: ");
        for (int i = 0; i < vector2.length; i++) {
            System.out.print(vector2[i] + " ");
        }
        
        if ((iguales(vector, vector2)) == true) {
            System.out.println("\nLos vectores son iguales | true");
        } else {
            System.out.println("\nLos vectores no son iguales | false");
        }
    }

    public static boolean iguales(int A1[], int A2[]) {

        boolean respuesta;

        respuesta = Arrays.equals(A1, A2);

        return respuesta;
    }

    public static void ordena2(int Arr[]) {

        Arrays.sort(Arr);

        int[] vectorOrdenado = new int[Arr.length];

        for (int i = 0; i < Arr.length; i++) {
            vectorOrdenado[i] = Arr[Arr.length - 1 - i];
        }

        for (int i = 0; i < Arr.length; i++) {
            Arr[i] = vectorOrdenado[i];
        }
    }

    public static int posMayor(int Arr[], int inf, int sup) {

        int mayor = 0;

        int indiceI = 0;

        for (int i = 0; i < Arr.length; i++) {

            if (Arr[i] >= inf && Arr[i] <= sup) {
                if (Arr[i] > mayor) {
                    mayor = Arr[i];
                    indiceI = i;
                }
            }

        }

        return indiceI;
    }

    public static int mayor(int Arr[], int inf, int sup) {

        int mayor = 0;

        for (int i = 0; i < Arr.length; i++) {

            if (Arr[i] >= inf && Arr[i] <= sup) {
                if (Arr[i] > mayor) {
                    mayor = Arr[i];
                }
            }

        }

        return mayor;
    }

    public static void invierte(int Arr[]) {

        int n = Arr.length;

        for (int i = 0; i < n / 2; i++) {
            int temp = Arr[i];
            Arr[i] = Arr[n - i - 1];
            Arr[n - i - 1] = temp;
        }

    }

    public static void intercambia(int Arr[], int i, int j) {

        int varGuardadaI, varGuardadaJ;

        varGuardadaI = Arr[i];
        varGuardadaJ = Arr[j];

        Arr[i] = varGuardadaJ;
        Arr[j] = varGuardadaI;

    }

    public static void sustituye(int Arr[], int viejo, int nuevo) {

        for (int i = 0; i < Arr.length; i++) {

            if (Arr[i] == viejo) {

                Arr[i] = nuevo;
            }
        }

    }

    public static int cuentaRepeticiones(int Arr[], int x) {
        int repeticion = 0;

        for (int i = 0; i < Arr.length; i++) {

            if (Arr[i] == x) {
                repeticion++;
            }
        }

        return repeticion;
    }

    public static int sumaPares(int Arr[]) {

        int suma = 0;

        for (int i = 0; i < Arr.length; i++) {

            if ((Arr[i] % 2) == 0) {
                suma = suma + Arr[i];
            }
        }

        return suma;
    }

    public static int cuentaCeros(int Arr[]) {

        int numCeros = 0;
        for (int i = 0; i < Arr.length; i++) {
            if (Arr[i] == 0) {
                numCeros++;
            }
        }

        return numCeros;
    }

}
