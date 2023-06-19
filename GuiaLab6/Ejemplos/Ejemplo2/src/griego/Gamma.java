/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package griego;

/**
 *
 * @author kenetcode
 */
public class Gamma {

    public static void main(String[] args) {
        probarAlpha();
    }

    static void probarAlpha() {
        Alpha a = new Alpha();
        a.estoyProtegido = 10; // legal
        a.metodoProtegido(); // legal
    }

}
