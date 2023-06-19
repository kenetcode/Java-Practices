/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package constructores;

/**
 *
 * @author kenetcode
 */
public class Ficha {

    private int casilla;

    public void avanzar(int n) {
        casilla += n;
    }

    public int getCasillaActual() {
        return casilla;
    }
}
