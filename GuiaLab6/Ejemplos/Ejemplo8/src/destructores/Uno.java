/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package destructores;

/**
 *
 * @author kenetcode
 */
public class Uno {

    Dos d;

    Uno() {
        d = new Dos();
    }

    @Override
    protected void finalize() throws Throwable {
        try {
            d = null; //se elimina d por lo que pudiera pasar
            System.out.println("Ejecutando finalize() de la clase Uno");
        } finally {
            super.finalize();
        }
    }
}
