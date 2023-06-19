/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleado;

/**
 *
 * @author kenetcode
 */
public class PruebaEmpleado {

    public static void main(String[] args) {
        Fecha nacimiento = new Fecha(7, 24, 1970);
        Fecha contratacion = new Fecha(3, 12, 2011);

        if (nacimiento.equals(contratacion)) {
            System.out.println("Error en las fechas");
        } else {
            Empleado empleado = new Empleado("Juan", "Perez", nacimiento, contratacion);
            System.out.println(empleado);
            System.out.println("Cantidad de empleados: " + Empleado.cantEmpleados);

            //Ingrese Mes/Dia/Año respectivamente en las siguientes 3 sentencias           
            System.out.println("\nEl mes resultante es: " + contratacion.siguienteMes(12, 31));
            System.out.println("El siguiente dia es: " + contratacion.siguienteDia(12, 31));
            System.out.println("El año resultante es: " + contratacion.siguienteAnio(12, 15, 1970));
        }
    }
}
