/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleado;
// Clase Empleado con referencias a otros objetos.

/**
 *
 * @author kenetcode
 */
public class Empleado {

    private String primerNombre;
    private String apellidoPaterno;
    private Fecha fechaNacimiento;
    private Fecha fechaContratacion;

    // constructor para inicializar nombre, fecha de nacimiento y fecha
    // de contratación
    public Empleado(String nombre, String apellido, Fecha fechaDeNacimiento, Fecha fechaDeContratacion) {
        primerNombre = nombre;
        apellidoPaterno = apellido;
        fechaNacimiento = fechaDeNacimiento;
        fechaContratacion = fechaDeContratacion;
    }// fin del constructor de Empleado

    // convierte Empleado a formato String
    public String toString() {
        return String.format("%s, %s Contratado: %s Cumpleanios: %s", apellidoPaterno, primerNombre, fechaContratacion, fechaNacimiento);
    } // fin del método toString
}// fin de la clase Empleado
