/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tesgeometricos;

/**
 *
 * @author kenetcode
 */
public class Rectangulo {

    double base = 0;
    double altura = 0;

    public double calcularArea() {
        return base * altura;
    }

    public double calcularPerimetro() {
        return base + base + altura + altura;
    }
}
