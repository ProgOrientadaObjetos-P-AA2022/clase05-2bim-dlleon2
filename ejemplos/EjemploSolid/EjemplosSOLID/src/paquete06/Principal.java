/*
 * L — Liskov substitution principle (Principio de sustitución de Liskov) 
 */
package paquete06;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
        
        MayorEdad representante = new MayorEdad("José", "Visa");
        
        MenorEdad menor = new MenorEdad("Felipe", representante);
        
        Tarjeta codigo = new Tarjeta("200123540");
        
        
        System.out.printf("Nombre:%s - Tarjeta:%s\n - Codigo:%s\n",
                menor.obtenerNombre(), 
                menor.obtenerRepresentante().obtenerTarjeta(),
                codigo.obtenerCodigo());
        
    }
}
