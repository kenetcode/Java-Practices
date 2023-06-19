/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;

/**
 * 7. Escriba un programa en Java que declare una variable boolean y la inicialice con un valor lógico, 
 * luego que pruebe la conversión de dicho valor a todos los tipos de datos primitivos de Java que sea posible. 
 * Debería imprimir un mensaje mencionando las conversiones posibles. Utilice las funciones estáticas de la clase 
 * Boolean.
 * @author kenetcode
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //La variable = true del tipo boolean puede convertirse directamente solo a String ya que true o false
        //son cadenas de caracteres y valores numericos, para hacer la conversion a variables primitivas del 
        //tipo numerico deberia emplearse un if - else para asignar 1 o 0 dependiendo del valor de la variable
        //booleana si es true 1 si es false 0 o de forma simplificada se puede hacer de la siguiente manera
        //si tenemos una variable double digitoDouble; y boolean variable = true;
        //podemos hacer digitoDouble = variable ? 1.0 : 0.0; para asignar un valor dependiendo de el valor logico
        //de "variable"
        boolean variable = true;
        String conversion;
        conversion = Boolean.toString(variable);
        System.out.println("La conversion solo puede efectuarse a un String");
        System.out.println("Conversion a String : "+conversion);
    }
    
}
