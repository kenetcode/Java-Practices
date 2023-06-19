/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tesgeometricos;

/**
 *
 * @author kenetcode
 */
public class Circulo {

    double radio = 0;
    double pi = 3.1416;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {

        return pi * radio * radio;
    }

    public double calcularPerimetro() {
        return 2 * pi * radio;
    }
}
