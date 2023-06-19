/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package portatiles;

/**
 *
 * @author kenetcode
 */
public class Portatil {
    
    private String modelo;
    private String memoria;
    private Procesador procesador;
    private Bateria bateria;
    
    public String getModelo() {
        return modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public String getMemoria() {
        return memoria;
    }
    
    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }
    
    public Procesador getProcesador() {
        return procesador;
    }
    
    public void setProcesador(Procesador procesador) {
        this.procesador = procesador;
    }
    
    public Bateria getBateria() {
        return bateria;
    }
    
    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }
    
    public Portatil(String modelo) {
        this.modelo = modelo;
    }
    
    public void descargarBateria(double minutos) {
        bateria.reducirCarga(minutos);
    }
    
    @Override
    public String toString(){
        return String.format("\nModelo del portatil: %s \nMemoria del portatil: %s %s %s", modelo, memoria, procesador.toString(), bateria.toString());
    }
    
}
