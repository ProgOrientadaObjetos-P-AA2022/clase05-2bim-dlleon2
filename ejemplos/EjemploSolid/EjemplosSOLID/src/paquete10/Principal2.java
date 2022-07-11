/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete10;

/**
 *
 * @author SALA I
 */
public class Principal2 extends Principal{
    public static void main(String[] args) {
        // Guardar los objetos de tipo Generador Pelicular en un 
        // archivo serializado
        
        
        //NETFLIX
        
        APINetflix api = new APINetflix();
        api.establecerApiKey("123455");
        
        GeneradorPeliculas gp = new GeneradorPeliculas();
        gp.establecerLlave(api);
        gp.establecerUrl("http://api.movie?api=");
        
        //AMAZON MOVIE
        
        APIAmazonMovie api2 = new APIAmazonMovie();
        api2.establecerApiKey("123455");
        
        GeneradorPeliculas gp2 = new GeneradorPeliculas();
        gp2.establecerLlave(api2);
        gp2.establecerUrl("http://api.movie?api=");
               
        //DIRECTV
        
        APIDirectv api3 = new APIDirectv();
        api3.establecerApiKey("7954843");
        
        GeneradorPeliculas gp3 = new GeneradorPeliculas();
        gp3.establecerLlave(api3);
        gp3.establecerUrl("http://api.movie?api=");
        
        //Star plus
        
        APIStarplus api4 = new APIStarplus();
        api4.establecerApiKey("153845");
        
        GeneradorPeliculas gp4 = new GeneradorPeliculas();
        gp4.establecerLlave(api4);
        gp4.establecerUrl("http://api.movie?api=");
        
        
        
    }
    
}

