/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleado;
// Demostración de la composición.

/**
 *
 * @author kenetcode
 */
public class PruebaEmpleado {

    public static void main(String[] args) {
        Fecha nacimiento = new Fecha(7, 24, 1970);
        Fecha contratacion = new Fecha(3, 12, 2011);
        Empleado empleado = new Empleado("Juan", "Perez", nacimiento, contratacion);
        System.out.println(empleado); // invoca el método “toString” } // fin de main
    } // fin de la clase PruebaEmpleado
}
