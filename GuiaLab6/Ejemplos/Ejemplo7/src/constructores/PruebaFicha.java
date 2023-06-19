/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package constructores;

/**
 *
 * @author kenetcode
 */
public class PruebaFicha {

    public static void main(String[] args) {
        Ficha ficha1 = new Ficha();
        ficha1.avanzar(3);
        System.out.println(ficha1.getCasillaActual());
        Ficha ficha2 = new Ficha(5);
        ficha2.avanzar(5);
        System.out.println(ficha2.getCasillaActual());
    }
}
