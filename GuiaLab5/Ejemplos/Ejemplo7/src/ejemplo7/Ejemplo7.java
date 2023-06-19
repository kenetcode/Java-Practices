/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo7;

/**
 * 7. Ejemplo de métodos de la clase String.
 *
 * @author kenetcode
 */
public class Ejemplo7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Ejemplo de uso de length");

        int i;

        String str = "Hola Mundo";

        i = str.length(); // retorna 10 

        System.out.println("Longitud de cadena \"" + str + "\" es: " + i);

        System.out.println("Ejemplo de uso de valueOf");

        i = 65;

        float j = 590;

        double l = 1E10;

        str = String.valueOf(i); //str queda igual "65" 

        System.out.println(str);

        str = String.valueOf(j); //str queda igual "590.0" 

        System.out.println(str);

        str = String.valueOf(l); //str queda igual "1.0E10" 

        System.out.println(str);

        System.out.println("Ejemplo de uso de charAt");

        str = "Hola mundo";

        System.out.println(str.charAt(0));// retorna H

        System.out.println(str.charAt(4));// retorna " "

        System.out.println(str.charAt(8));// retorna d

        //System.out.println(str.charAt(10)); // se produce una excepcion pues el ultimo caracter del string ocupa la posicion 9
        
        boolean valor;

        System.out.println("Ejemplo de uso de equals");

        str = "hola mundo";

        valor = str.equals("Chao"); // retorna false ,pues str es distinto de "Chao"
        
        System.out.println(valor);

        if (valor) {
            System.out.println("son iguales");
        } else {
            System.out.println("son diferentes");
        }

        System.out.println("Ejemplo de uso de equals ignorando mayusculas");

        str = "HoLa MuNdo";

        valor = str.equalsIgnoreCase("hOLa mUnDO"); // retorna true,pues compara los caracteres

        if (valor) // ignorando las mayusculas
        {
            System.out.println("son iguales");
        } else {
            System.out.println("son diferentes");
        }

        System.out.println("Ejemplo de uso de regionMatches");

        str = "Hola Mundo";

        valor = str.regionMatches(5, "Mundial", 0, 4); // retorna true, pues se compara el string

        if (valor) // str desde la posicion 5 con el string "Mundial",desde la posicion 0, tomando en cuenta los 4 primeros caracteres de cada substring...luego "Mund"=="Mund"
        {
            System.out.println("Substring concuerdan");
        } else {
            System.out.println("No concuerdan");
        }

        System.out.println("Ejemplo de uso de endsWith");

        str = "Hola Mundo";

        valor = str.endsWith("ndo"); // retorna true, pues ndo es sufijo de str

        if (valor) {
            System.out.println("Substring concuerdan");
        } else {
            System.out.println("No concuerdan");
        }

        System.out.println("Ejemplo de uso de indexOf");

        str = "Hola Mundo";

        i = (int)(str.indexOf(97)); // retorna 3, pues el numero 97 representa al codigo

        System.out.println(i); // unicode "a", el que esta en la posicion 3

        i = str.indexOf(100); // retorna 8, pues el numero 100 representa al codigo

        System.out.println(i); // unicode "d", el que esta en la posicion 8

        i = str.indexOf(98); // retorna -1, pues el numero 98 representa al codigo

        System.out.println(i); // unicode "b", que no se encuentra en el string

        String s;

        System.out.println("Ejemplo de uso de substring");

        str = "Hola Mundo";

        s = str.substring(2); // retorna "la Mundo"

        System.out.println(s);

        s = str.substring(5); // retorna "Mundo"

        System.out.println(s);

        //s = str.substring(12); // retorna una excepcion pues 12 excede el largo del string

        System.out.println(s);

        System.out.println("Ejemplo de uso de trim");

        str = "Hola Mundo                        ";

        str = str.trim(); // str queda como "Hola Mundo", pues se eliminan los espacios al final 

        System.out.print(str + ".");

        System.out.println("\nEjemplo de uso de replace");

        str = "Hela Munde";

        str = str.replace('e', 'o'); // str queda como "Hola Mundo"

        System.out.println(str);

    }

}
