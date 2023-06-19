/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package volumenesfera;

/**
 *
 * @author kenetcode
 */
public class Esfera {

    private double radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public Esfera() {
    }

    public double calcularVolumen() {

        double resultado;

        resultado = 4.0 / 3.0 * Math.PI * Math.pow(radio, 3);

        return resultado;
    }

}
