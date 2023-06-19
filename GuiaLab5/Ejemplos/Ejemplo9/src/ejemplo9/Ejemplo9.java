/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo9;

/**
 * 9. Prueba las excepciones de división por cero y acceder una posición no
 * disponible en un vector (Para probar la segunda excepción debe eliminar la
 * instrucción de división por cero o comentarla).
 * 
 * O
 * 
 * Poner por separado las operaciones que generan un error, cada una en un bloque try para que tengan un catch y atrapen el error y envien
 * la excepcion producida
 *
 * @author kenetcode
 */
public class Ejemplo9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int valor = 5, cero = 0;

        int[] array = {1, 2, 3};

        try {

            valor = valor / cero; //división por cero

        } catch (ArithmeticException e) {

            System.out.println("Sucedió una division por cero");

        }

        try {
            
            array[4] = 5; //acceso a una posición no disponible

        } catch (Exception e) {

            System.out.println("Se ha producido un error");

        }

    }

}
