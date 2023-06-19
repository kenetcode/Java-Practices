/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package referenciathis;

/**
 *
 * @author kenetcode
 */
public class Punto {

    int posX, posY;//posición del punto

    Punto(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }

    public void imprimir() {
        System.out.println("x = " + posX + ", y = " + posY);
    }
}
