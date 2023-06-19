/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 11. Escriba un programa en Java que lea una fecha en el formato “dd/mm/aaaa”,
 * por ejemplo “10/05/2014”, y que la imprima en el formato “10 de mayo de
 * 2014”.
 *
 * @author kenetcode
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String fechaString;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una fecha con el formato dd/mm/aaaa");
        fechaString = sc.nextLine();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            Date fecha = sdf.parse(fechaString);
            sdf.applyPattern("dd 'de' MMMM 'de' yyyy");
            String fechaFormateada = sdf.format(fecha);
            System.out.println(fechaFormateada);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

}
