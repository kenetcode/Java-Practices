/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleado;

/**
 *
 * @author kenetcode
 */
public class Fecha {

    private int mes; // 1-12
    private int dia;   // 1-31 con base en el mes
    private int anio;  // cualquier año
    private static final int[] diasPorMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; //días en cada mes
    // constructor: llama a comprobarMes para confirmar el valor apropiado // para el mes;
    // llama a comprobarDia para confirmar el valor apropiado para el día 

    public Fecha(int elMes, int elDia, int elAnio) {
        mes = comprobarMes(elMes); // valida el mes
        anio = elAnio; // pudo validar el año
        dia = comprobarDia(elDia); // valida el día
        System.out.printf("Constructor de objeto Fecha para la fecha %s\n", this);
    } // fin del constructor de Fecha

    // método utilitario para confirmar el valor apropiado del mes
    private int comprobarMes(int mesPrueba) {
        if (mesPrueba > 0 && mesPrueba <= 12) // valida el mes
        {
            return mesPrueba;
        } else {
            throw new IllegalArgumentException("el mes debe ser1 a 12");
        }
    }// fin del método comprobarMes

    // método utilitario para confirmar el valor apropiado del día, con base 
    // en el mes y el año
    private int comprobarDia(int diaPrueba) {
        // comprueba si el día está dentro del rango para el mes 
        if (diaPrueba > 0 && diaPrueba <= diasPorMes[mes]) {
            return diaPrueba;
        }
        // comprueba si es año bisiesto
        if (mes == 2 && diaPrueba == 29 && (anio % 400 == 0
                || (anio % 4 == 0 && anio % 100 != 0))) {
            return diaPrueba;
        }
        throw new IllegalArgumentException("dia fuera de rango para el mes y anio especificados");
    } // fin del método comprobarDia

    // devuelve un objeto String de la forma mes/dia/anio 
    public String toString() {
        return String.format("%d/%d/%d", mes, dia, anio);
    } // fin del método toString
}// fin de la clase Fecha
