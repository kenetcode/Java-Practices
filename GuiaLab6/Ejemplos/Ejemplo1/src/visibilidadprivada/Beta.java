/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package visibilidadprivada;

/**
 *
 * @author kenetcode
 */
class Beta {

    public static void main(String[] args) {
        probarAlpha();
    }

    static void probarAlpha() {
        
        Alpha a = new Alpha();
        //a.soyPrivado = 10;        // ilegal
        //a.metodoPrivado();        // ilegal
        a.metodoPublico();          // legal

    }

}
