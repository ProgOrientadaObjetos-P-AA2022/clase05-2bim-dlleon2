/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete06;


public class Tarjeta extends Persona{
    double codigo;

    public Tarjeta(String n) {
        super(n);
    }
    
    public void establecerCodigo(double C){
        codigo = C; 
    }
    public double obtenerCodigo(){
        return codigo;
    }
    
    public String establecerCodigoCodigo(){
         throw new RuntimeException("un niño no tiene tarjeta");
    }
}