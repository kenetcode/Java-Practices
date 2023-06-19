/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package portatiles;

/**
 *
 * @author kenetcode
 */
public class Procesador {

    private int codigo;
    private String velocidad;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }

    public Procesador(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return String.format("\nCodigo del procesador: %s \nVelocidad del procesador: %s", codigo, velocidad);
    }

}
