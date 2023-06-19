/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilidades;

import java.util.Scanner;

/**
 *
 * @author kenetcode
 */
public class TesUtilidades {

    public static void main(String[] args) {
        UtilidadesCadenas utilidades = new UtilidadesCadenas();
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese una oracion o una palabra con espacios:");
        utilidades.cadena = teclado.nextLine();

        System.out.println(utilidades.inicioTodasMayusculas());
        System.out.println(utilidades.inicioMayuscula());
        System.out.println(utilidades.palabrasInversa());
    }
}
