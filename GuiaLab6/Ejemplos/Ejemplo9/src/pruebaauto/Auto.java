/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebaauto;

/**
 *
 * @author kenetcode
 */
public class Auto {

    protected String modelo;
    protected String marca;
    protected String placa;

    Auto(String ma, String mo, String p) {
        modelo = mo;
        marca = ma;
        placa = p;
    }
    /* public boolean equals(Object b){
        if (b instanceof Auto ){
            return (((Auto) b).modelo).equals(this.modelo) && (this.marca).equals(((Auto) b).marca) && (((Auto)b).placa).equals(this.placa);
        }
        else return false;
   }*/
}
