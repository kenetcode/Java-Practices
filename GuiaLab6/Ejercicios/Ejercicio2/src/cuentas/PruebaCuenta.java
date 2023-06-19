/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentas;

import java.text.DecimalFormat;

/**
 *
 * @author kenetcode
 */
public class PruebaCuenta {
    public static void main(String[] args) {
        CuentaDeAhorro ahorro1 = new CuentaDeAhorro();
        CuentaDeAhorro ahorro2 = new CuentaDeAhorro();
        DecimalFormat df = new DecimalFormat("###.##");

        ahorro1.setSaldo(2000.00);
        ahorro2.setSaldo(3000.00);
        CuentaDeAhorro.modificarTasaInteres(1.5);

        System.out.println("-Saldo original ahorro1: " + ahorro1.getSaldo());
        System.out.println("-Saldo original ahorro2: " + ahorro2.getSaldo());
        System.out.println("");
        for (int i = 1; i < 13; i++) {
            ahorro1.calcularInteresMensual();
            ahorro2.calcularInteresMensual();
            if (i == 1) {
                System.out.println("Calculando interes mensual totales de los 12 meses");
            }
        }
        System.out.println("-Nuevo saldo de ahorro1: " + df.format(ahorro1.getSaldo()));
        System.out.println("-Nuevo saldo de ahorro2: " + df.format(ahorro2.getSaldo()));

        CuentaDeAhorro.modificarTasaInteres(2.5);
        System.out.println("\nNuevos saldos con tasa de interes modificada:");
        ahorro1.calcularInteresMensual();
        ahorro2.calcularInteresMensual();
        System.out.println("-Nuevo saldo de ahorro1: " + df.format(ahorro1.getSaldo()));
        System.out.println("-Nuevo saldo de ahorro2: " + df.format(ahorro2.getSaldo()));

        System.out.println("\n-Cantidad de cuenta existentes: " + CuentaDeAhorro.cantidadCuentas);
    }
}
