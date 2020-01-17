/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frequenciab;


/**
 *
 * @author Turma A
 */
public class FrequenciaB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Director realizador = new Director("Joao", "Portugues", "20-12-1974");
        
        TVShow serie = new TVShow("teste",5.0,2010,90,"Joao"){};
        TVShow Documentary = new Documentary("teste2",5.0,2010,90,"Joao","ação",5) {};
        TVShow MiniSerie = new MiniSeries("teste3",5.0,2010,"Joao",90,50) {};
        
       System.out.println(serie.toString());
       System.out.println(Documentary.toString());
       System.out.println(MiniSerie.toString());
       System.out.println(realizador.toString());
    }
    
    

    
    
    
}
