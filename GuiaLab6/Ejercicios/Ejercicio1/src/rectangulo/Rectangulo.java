/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rectangulo;

/**
 *
 * @author kenetcode
 */
public class Rectangulo {
    double longitud = 1;
    double anchura = 1;

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        if (longitud > 0.0 && longitud < 20.0) {

            this.longitud = longitud;
        }
    }

    public double getAnchura() {
        return anchura;
    }

    public void setAnchura(double anchura) {
        if (anchura > 0.0 && longitud < 20.0) {
            this.anchura = anchura;
        }
    }

    public double CalcularArea() {
        return longitud * anchura;
    }

    public double CalcularPerimetro() {

        return longitud + longitud + anchura + anchura;
    }
}
