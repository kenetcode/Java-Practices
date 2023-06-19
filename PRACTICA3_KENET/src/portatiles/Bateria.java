/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package portatiles;

/**
 *
 * @author kenetcode
 */
public class Bateria {
    
    private String marca;
    private double carga;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }
    
    public Bateria(){
        
    }
    
    public void reducirCarga(double minutos){
        carga -= minutos;
    }
    
    @Override
    public String toString(){
        return String.format("\nMarca de la Bateria: %s \nLa carga de la bateria es: %s", marca, carga);
    }
}
