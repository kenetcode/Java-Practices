/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package visibilidadprivada;

/**
 *
 * @author kenetcode
 */
public class Alpha {

    private int soyPrivado;

    private void metodoPrivado() {
        System.out.println("metodoPrivado");
    }

    public void metodoPublico() {
        System.out.println("metodoPublico");
        System.out.println("Atributo privado: " + soyPrivado);
        System.out.println("metodoPrivado: ");
        metodoPrivado();
    }

}
