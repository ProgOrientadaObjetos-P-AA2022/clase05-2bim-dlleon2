/*
S — Single responsibility principle 
    Principio de responsabilidad única
 */
package paquete02;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class OperacionesEstudiantes {
    private ArrayList<Persona> estudiantes;
    private double promedioEdades;
    // private double edadminima;
    
    
    public void establecerEstudiante(ArrayList<Persona> lista){
        estudiantes = lista;
    }
    
    public ArrayList<Persona> obtenerEstudiante(){
        return estudiantes;
    }
    
    public void establecerPromedioEdades(){
        double suma = 0;
        for(Persona e: obtenerEstudiante()){
            suma = e.obtenerEdad();
        }
        promedioEdades = suma/obtenerEstudiante().size();
    }        
    
    public double obtenerPromedioEdades(){
        
        return promedioEdades;
    }
    
    
    
    @Override
    public String toString(){
     String reporte = String.format("");
        for (Persona e: obtenerEstudiante()) {
            reporte = String.format("%sNombre: %s\n"
                    + "Edad: %d\n",
                    reporte,
                    e.obtenerNombre(),
                    e.obtenerEdad());
        }
        reporte = String.format("\n%sPromedio Edades: %.2f\n",reporte, obtenerPromedioEdades());
        return reporte;
    }
}