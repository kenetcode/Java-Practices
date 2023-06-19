/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentas;

/**
 *
 * @author kenetcode
 */
public class CuentaDeAhorro {

    public static double tasaInteresAnual;
    public static int cantidadCuentas = 0;
    private double saldo;

    public double CuentaDeAhorros() {
        cantidadCuentas++;
        return cantidadCuentas;
    }

    public int getCantidadCuentas() {
        return cantidadCuentas;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void calcularInteresMensual() {
        double nuevoSaldo = (saldo * tasaInteresAnual) / 12;
        this.saldo += nuevoSaldo;
    }

    public static void modificarTasaInteres(double nuevoValor) {
        tasaInteresAnual = nuevoValor / 100;
    }
}
