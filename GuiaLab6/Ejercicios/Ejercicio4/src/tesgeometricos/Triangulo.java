/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tesgeometricos;

/**
 *
 * @author kenetcode
 */
public class Triangulo {

    double base = 0;
    double altura = 0;

    public double calcularArea() {
        double area = 0;
        area = base * altura / 2;
        return area;
    }

    public double calcularPerimetro() {
        return base + altura + altura;
    }
}
