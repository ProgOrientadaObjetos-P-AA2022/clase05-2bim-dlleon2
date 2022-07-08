/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;

/**
 *
 * @author utpl
 */
public class TransporteTransvia {
    
    private String cooperativaTtransvia;
    private double tarifa;
    
    public void establecerCooperativaTtransvia(String n){
        cooperativaTtransvia= n;
    }
    
    public void establecerTarifa(){
        tarifa = 1.00 + (1.00*1.70);
    }
    
    public String obtenerCooperativaTtransvia(){
        return cooperativaTtransvia;
    }
    
    public double obtenerTarifa(){
        return tarifa;
    }
}
