/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebaauto;

/**
 *
 * @author kenetcode
 */
public class PruebaAuto {

    public static void main(String[] args) {
        // TODO code application logic here
        Auto uno = new Auto("Renault", "Megane", "P-432432");
        Auto dos = uno;
        boolean resultado = (uno.equals(dos)); //Resultado valdrá true
        if (resultado) {
            System.out.println("Los dos objetos son iguales");
        } else {
            System.out.println("Los objetos no son iguales");
        }
        resultado = (uno == dos); //Resultado también valdrá true
        if (resultado) {
            System.out.println("Hacen referencia al mismo objeto");
        } else {
            System.out.println("Las referencias de los objetos son diferentes");
        }
        dos = new Auto("Renault", "Megane", "P-432432");
        resultado = (uno.equals(dos)); //Resultado valdrá true
        if (resultado) {
            System.out.println("Los dos objetos son iguales");
        } else {
            System.out.println("Los objetos no son iguales");
        }
        resultado = (uno == dos); //Resultado ahora valdrá false
        if (resultado) {
            System.out.println("Hacen referencia al mismo objeto");
        } else {
            System.out.println("Las referencias de los objetos son diferentes");
        }
    }
}
