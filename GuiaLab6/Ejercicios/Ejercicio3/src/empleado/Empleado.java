/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleado;

/**
 *
 * @author kenetcode
 */
public class Empleado {

    static int cantEmpleados = 0;
    private String primerNombre;
    private String apellidoPaterno;
    private Fecha fechaNacimiento;
    private Fecha fechaContratacion;

    public Empleado(String nombre, String apellido, Fecha fechaDeNacimiento,
            Fecha fechaDeContratacion) {
        primerNombre = nombre;
        apellidoPaterno = apellido;
        fechaNacimiento = fechaDeNacimiento;
        fechaContratacion = fechaDeContratacion;
        cantEmpleados++;
    }

    public int getCantidadEmpleados() {
        return cantEmpleados;
    }

    public String toString() {

        return String.format("%s, %s Contratado: %s Cumpleanios: %s",
                apellidoPaterno, primerNombre, fechaContratacion, fechaNacimiento);
    }
}
