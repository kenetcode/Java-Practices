/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileReader;

/**
 * 12.Escriba un programa en java que pruebe las siguientes excepciones de Java:
 * FileNotFoundException, ArrayIndexOutOfBoundsException y IOException.
 *
 * @author kenetcode
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {

            File archivo = new File("archivo.txt");
            Scanner sc = new Scanner(archivo);
            String linea = sc.nextLine();
            System.out.println(linea);

        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        }

        try {

            double[] array = new double[4];
            double variable = array[5];

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("El indice esta fuera del limite del array");
        }

        try {

            File file = new File("myfile.txt");
            FileReader fr = new FileReader(file);
            // Leer el archivo
            fr.close();

        } catch (IOException e) {
            System.out.println("Archivo no encontrado | Lectura incorrecta");
        }
    }
    
}
