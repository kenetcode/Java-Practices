/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;

import java.util.Scanner;

/**
 * 10. Escriba un programa en Java que lea los apellidos, el carnet de un alumno
 * y el año de ingreso a la universidad. Luego determine si el carnet del alumno
 * es válido.
 *
 * @author kenetcode
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String apellidos, carnet, anioIngreso;

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese sus apellido");
        apellidos = scanner.nextLine();

        System.out.println("Ingrese su año de ingreso a la Universidad");
        anioIngreso = scanner.nextLine();

        System.out.println("Ingrese su carnet, el formato debera ser dos letras al inicio y 4 numeros seguidos");
        
        carnet = scanner.nextLine();

        if (carnet.matches("^[A-Za-z]{2}\\d{5}$")) {
            
            System.out.println("El carnet cumple con el formato, por lo que es valido");
            
        } else {

            System.out.println("El carnet no tiene el formato correcto");
        }

    }

}
