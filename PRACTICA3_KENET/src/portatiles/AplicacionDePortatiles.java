/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package portatiles;

/**
 *
 * @author kenetcode
 */
public class AplicacionDePortatiles {

    public static void main(String[] args) {

        Procesador procesador1 = new Procesador(1234);
        procesador1.setVelocidad("3.4Gz");

        Procesador procesador2 = new Procesador(3456);
        procesador2.setVelocidad("2.4Gz");

        Bateria bateria1 = new Bateria();
        bateria1.setMarca("AsusV2");
        bateria1.setCarga(100);

        Bateria bateria2 = new Bateria();
        bateria2.setMarca("Samsungv5.4");
        bateria2.setCarga(100);

        Portatil portatil1 = new Portatil("Asus360");
        portatil1.setMemoria("Ram 5Gb");
        portatil1.setProcesador(procesador1);
        portatil1.setBateria(bateria2);

        Portatil portatil2 = new Portatil("HpInvictus");
        portatil2.setMemoria("Ram 10Gb");
        portatil2.setProcesador(procesador2);
        portatil2.setBateria(bateria1);

        Portatil portatil3 = new Portatil("Apple MacBook Pro");
        portatil3.setMemoria("Ram 8Gb");
        portatil3.setProcesador(procesador1);
        portatil3.setBateria(bateria1);

        if (portatil1.getProcesador().getCodigo() == portatil2.getProcesador().getCodigo()) {
            System.out.println("El portatil " + portatil1.getModelo() + " Y el portatil " + portatil2.getModelo() + " Tienen el mismo procesador");
            
            System.out.println("Los datos del portatil " + portatil1.getModelo() + " son:");
            System.out.printf("Modelo: %s Memoria: %s Carga de la bateria: %s", portatil1.getModelo(), portatil1.getMemoria(), portatil1.getBateria());
            
            System.out.println("Los datos del portatil " + portatil2.getModelo() + " son:");
            System.out.printf("Modelo: %s Memoria: %s Carga de la bateria: %s", portatil2.getModelo(), portatil2.getMemoria(), portatil2.getBateria());
        }
        
        if (portatil1.getProcesador().getCodigo() == portatil3.getProcesador().getCodigo()) {
            System.out.println("El portatil " + portatil1.getModelo() + " Y el portatil " + portatil3.getModelo() + " Tienen el mismo procesador");
            
            System.out.println("Los datos del portatil " + portatil1.getModelo() + " son:");
            System.out.printf("Modelo: %s Memoria: %s Carga de la bateria: %s", portatil1.getModelo(), portatil1.getMemoria(), portatil1.getBateria());
            
            System.out.println("Los datos del portatil " + portatil3.getModelo() + " son:");
            System.out.printf("Modelo: %s Memoria: %s Carga de la bateria: %s", portatil3.getModelo(), portatil3.getMemoria(), portatil3.getBateria());
        }
        
        if (portatil2.getProcesador().getCodigo() == portatil3.getProcesador().getCodigo()) {
            System.out.println("El portatil " + portatil2.getModelo() + " Y el portatil " + portatil3.getModelo() + " Tienen el mismo procesador");
            
            System.out.println("Los datos del portatil " + portatil2.getModelo() + " son:");
            System.out.printf("Modelo: %s Memoria: %s Carga de la bateria: %s", portatil2.getModelo(), portatil2.getMemoria(), portatil2.getBateria());
            
            System.out.println("\n\nLos datos del portatil " + portatil3.getModelo() + " son:");
            System.out.printf("Modelo: %s Memoria: %s Carga de la bateria: %s", portatil3.getModelo(), portatil3.getMemoria(), portatil3.getBateria());
        }
        
        portatil3.descargarBateria(5);
        
        System.out.println("\n\nLos datos del ultimo portatil creado son:");
        
        System.out.println(portatil3.toString());

    }
}
